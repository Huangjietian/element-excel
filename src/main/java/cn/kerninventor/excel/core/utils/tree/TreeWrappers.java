package cn.kerninventor.excel.core.utils.tree;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * <p>
 *     树状结构包装器
 * </p>
 *
 * @author Kern
 */
public class TreeWrappers <E> implements Serializable {

    private final List<TreeNode<E>> nodes;

    public List<TreeNode<E>> getNodes() {
        return nodes;
    }

    protected TreeWrappers(List<TreeNode<E>> nodes) {
        this.nodes = nodes;
    }

    /**
     * <p>
     *     无侵入的Tree包装方法，通过{@link Function<E,K>}函数指定对象的父子节点。<br/>
     *     传入对象集合，可以获得一个{@link TreeWrappers <E>}实例，表示了该集合的树状结构。<br/>
     *     可以通过{@link TreeRootStrategy<E>}参数指定根部策略
     * </p>
     * @param collection  对象集合
     * @param rootStrategy  根部策略
     * @param getNodeKey  获取子节点的函数
     * @param getRootNodeKey  获取父节点的函数
     * @param <E>  对象泛型
     * @return  返回一个 {@link TreeWrappers}实例，表示了该集合的树状结构。
     */
    public static <E, K> TreeWrappers<E> of(Collection<E> collection, final TreeRootStrategy<E> rootStrategy, final Function<E, K> getNodeKey, final Function<E, K> getRootNodeKey) {
        if (collection == null || collection.isEmpty()) {
            return new TreeWrappers<>(new ArrayList<>());
        }
        List<E> roots = getRoots(collection, rootStrategy);
        if (roots == null || roots.isEmpty()) {
            throw new IllegalArgumentException("No root was found!");
        }
        List<TreeNode<E>> rootTreeNodeSet = new ArrayList<>(roots.size());
        roots.forEach(e -> {
            try {
                rootTreeNodeSet.add(new TreeNode<>(getNodeKey.apply(e), e));
            } catch (Exception e1) {
                throw new IllegalArgumentException("Internal error, Collection to tree error!");
            }
        });
        rootTreeNodeSet.forEach(e -> e.decorate(collection, getNodeKey, getRootNodeKey));
        return new TreeWrappers<E>(rootTreeNodeSet);
    }

    /**
     * <p>
     *     传入实现了{@link Branched}接口的对象集合，可以获得一个{@link TreeWrappers}实例，表示了该集合的树状结构。<br/>
     *     可以通过{@link TreeRootStrategy<E>}参数指定根部策略
     * </p>
     * @param collection  实现了 {@link Branched}接口的对象集合
     * @param rootStrategy  根部策略
     * @param <E>  实现了 {@link Branched}接口的对象类型
     * @return  返回一个 {@link TreeWrappers}实例，表示了该集合的树状结构。
     */
    public static <E extends Branched<?>> TreeWrappers<E> ofBranches(Collection<E> collection, final TreeRootStrategy<E> rootStrategy) {
        return of(collection, rootStrategy, Branched::nodeKey, Branched::rootNodeKey);
    }

    /**
     * 根据根策略匹配根节点
     * @param collection  对象集合
     * @param rootStrategy   根部策略
     * @param <E>  对象泛型
     * @return   返回根节点集合
     */
    private static <E> List<E> getRoots(Collection<E> collection, final TreeRootStrategy<E> rootStrategy) {
        return collection.stream().filter(rootStrategy::rule).collect(Collectors.toList());
    }

    /**
     * 园艺工人
     * 引入的 {@link Consumer< TreeNode  <E>> gardener} 将对最终返回的 {@link TreeNode <E>} 类进行消费操作
     * {@link TreeNode#setResult(Object)} 将支持接收一个结果集用于存储可能的消费结果
     * @param gardener  对tree类的消费操作定义
     * @return
     */
    public TreeWrappers<E> gardening(final Consumer<TreeNode<E>> gardener) {
        nodes.forEach(e -> e.fullGardening(gardener, node -> true));
        return this;
    }

    /**
     * 园艺工人
     * 引入的 {@link Consumer< TreeNode  <E>> gardener} 将对最终返回的 {@link TreeNode <E>} 类进行消费操作
     * {@link TreeNode#setResult(Object)} 将支持接收一个结果集用于存储可能的消费结果
     * @param gardener  对tree类的消费操作定义
     * @param predicate 对断言为true的资源进行该操作，传入{@code true}时将默认对所有资源进行递归操作
     * @return
     */
    public TreeWrappers<E> gardening(final Consumer<TreeNode<E>> gardener, final Predicate<E> predicate) {
        nodes.forEach(e -> e.fullGardening(gardener, predicate));
        return this;
    }

    /**
     * <p>
     *     根部策略函数接口
     * </p>
     */
    @FunctionalInterface
    public interface TreeRootStrategy<E> {

        boolean rule(E root);

    }

}
