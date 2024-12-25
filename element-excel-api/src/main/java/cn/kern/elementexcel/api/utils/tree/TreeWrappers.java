package cn.kern.elementexcel.api.utils.tree;

import java.io.Serializable;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * <p>
 *     树状结构包装器
 * </p>
 *
 * @author Kern
 */
public class TreeWrappers <E> implements Serializable {

    private final List<TreeNode<E>> nodes;
    private int nodeSize = 0;

    protected TreeWrappers() {
        nodes = new LinkedList<>();
    }

    /**
     * <p>
     *     无侵入的Tree包装方法，通过{@link Function<E,K>}函数指定对象的父子节点。<br/>
     *     传入对象集合，可以获得一个{@link TreeWrappers<E>}实例，表示了该集合的树状结构。<br/>
     *     可以通过{@link TreeRootStrategy<E>}参数指定根部策略
     * </p>
     * @param collection  对象集合
     * @param rootStrategy  根部策略
     * @param getNodeKeyFunc  获取子节点的函数
     * @param getRootNodeKeyFunc  获取父节点的函数
     * @param <E>  对象泛型
     * @return  返回一个 {@link TreeWrappers}实例，表示了该集合的树状结构。
     */
    public static <E, K> TreeWrappers<E> of(Collection<E> collection, final TreeRootStrategy<E> rootStrategy, final Function<E, K> getNodeKeyFunc, final Function<E, K> getRootNodeKeyFunc) {
        if (collection == null || collection.isEmpty()) {
            return new TreeWrappers<>();
        }
        int size = collection.size();
        TreeWrappers<E> treeWrappers = new TreeWrappers<>();
        treeWrappers.findRoots(collection, rootStrategy, getNodeKeyFunc);
        treeWrappers.getNodes().forEach(e -> e.decorate(collection, getNodeKeyFunc, getRootNodeKeyFunc, 2));
        treeWrappers.setNodeSize(size - collection.size());
        return treeWrappers;
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
     * @return   返回根节点集合
     */
    private void findRoots(Collection<E> collection, final TreeRootStrategy<E> rootStrategy, final Function<E, ?> getNodeKeyFunc) {
        List<E> roots = new ArrayList<>(16);
        Iterator<E> eIterator = collection.iterator();
        while (eIterator.hasNext()) {
            E element = eIterator.next();
            if (rootStrategy.rule(element)) {
                roots.add(element);
                eIterator.remove();
            }
        }
        if (roots.isEmpty()) {
            throw new IllegalArgumentException("No root was found!");
        }
        roots.forEach(e -> getNodes().add(new TreeNode<E>(getNodeKeyFunc.apply(e), e, 1)));
    }

    public List<TreeNode<E>> getNodes() {
        return nodes;
    }

    public int getNodeSize() {
        return nodeSize;
    }

    private void setNodeSize(int nodeSize) {
        this.nodeSize = nodeSize;
    }

    /**
     * 园艺工人
     * 引入的 {@link Consumer<TreeNode> gardener} 将对最终返回的 {@link TreeNode<E>} 类进行消费操作
     * {@link TreeNode#setResult(Object)} 将支持接收一个结果集用于存储可能的消费结果
     * @param gardener  对tree类的消费操作定义
     * @return tree
     */
    public TreeWrappers<E> gardening(final Consumer<TreeNode<E>> gardener) {
        nodes.forEach(e -> e.fullGardening(gardener, node -> true));
        return this;
    }

    /**
     * 园艺工人
     * 引入的 {@link Consumer<TreeNode> gardener} 将对最终返回的 {@link TreeNode<E>} 类进行消费操作
     * {@link TreeNode#setResult(Object)} 将支持接收一个结果集用于存储可能的消费结果
     * @param gardener  对tree类的消费操作定义
     * @param predicate 对断言为true的资源进行该操作，传入{@code true}时将默认对所有资源进行递归操作
     * @return tree
     */
    public TreeWrappers<E> gardening(final Consumer<TreeNode<E>> gardener, final Predicate<E> predicate) {
        nodes.forEach(e -> e.fullGardening(gardener, predicate));
        return this;
    }

    public <M> List<M> toList(final Function<TreeNode<E>, M> mapper) {
        return toCollection(new LinkedList<>(), mapper);
    }

    public <M> Set<M> toSet(final Function<TreeNode<E>, M> mapper) {
        return toCollection(new LinkedHashSet<>(), mapper);
    }

    public <C extends Collection<M>, M> C toCollection(C collection, final Function<TreeNode<E>, M> mapper) {
        if (collection != null) {
            gardening(e -> collection.add(mapper.apply(e)));
        }
        return collection;
    }

    public TreeNode<E> getNode(Object nodeKey) {
        if (nodeKey == null) {
            return null;
        }
        List<TreeNode<E>> node = new ArrayList<>(1);
        gardening(e -> {
            if (e.getNodeKey().equals(nodeKey) && node.size() == 0) {
                node.add(e);
            }
        });
        return node.size() > 0 ? node.get(0) : null;
    }

    /**
     * <p>
     *     根部策略函数接口
     * </p>
     */
    @FunctionalInterface
    public interface TreeRootStrategy<E> {

        /**
         * 规则
         * @param root root
         * @return true|false
         */
        boolean rule(E root);

    }

}
