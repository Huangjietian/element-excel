package cn.kerninventor.excel.core.utils.tree;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * <p>
 *     树节点封装类
 * </p>
 * @author Kern
 */
public class TreeNode<E> implements Serializable {

    public TreeNode(Object nodeKey, E nodeInfo) {
        this.nodeKey = nodeKey;
        this.nodeInfo = nodeInfo;
    }

    private final Object nodeKey;
    private E nodeInfo;
    private List<TreeNode<E>> branches = new ArrayList<>(16);
    private Object result;

    public Object getNodeKey() {
        return nodeKey;
    }

    public E getNodeInfo() {
        return nodeInfo;
    }

    public void setNodeInfo(E nodeInfo) {
        this.nodeInfo = nodeInfo;
    }

    public List<TreeNode<E>> getBranches() {
        return branches;
    }

    public void setBranches(List<TreeNode<E>> branches) {
        this.branches = branches;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    <K> void decorate(Collection<E> collection, Function<E, K> getNodeKey, Function<E, K> getRootNodeKey) {
        Iterator<E> iterator = collection.iterator();
        while (iterator.hasNext()) {
            E e = iterator.next();
            if (getNodeKey.apply(getNodeInfo()).equals(getRootNodeKey.apply(e))) {
                try {
                    branches.add(new TreeNode<>(getNodeKey.apply(e), e));
                } catch (Exception exception) {
                    throw new IllegalArgumentException("Tree decorate has error: " + exception.getMessage(), exception);
                }
                iterator.remove();
            }
        }
        if (!branches.isEmpty()) {
            for (TreeNode<E> treeNode : branches) {
                treeNode.decorate(collection, getNodeKey, getRootNodeKey);
            }
        }
    }

    public void gardening(final Consumer<TreeNode<E>> gardener, final Predicate<E> predicate) {
        if (predicate.test(getNodeInfo())) {
            gardener.accept(this);
        }
    }

    public void fullGardening(final Consumer<TreeNode<E>> gardener, final Predicate<E> predicate) {
        if (predicate.test(getNodeInfo())) {
            gardener.accept(this);
        }
        gardener.accept(this);
        getBranches().forEach(e -> e.fullGardening(gardener, predicate));
    }
}
