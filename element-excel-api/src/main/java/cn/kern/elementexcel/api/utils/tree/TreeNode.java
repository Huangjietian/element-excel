package cn.kern.elementexcel.api.utils.tree;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
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
        if (nodeKey == null) {
            throw new NullPointerException("The node key cannot be null! node:" + nodeInfo.toString());
        }
        this.nodeKey = nodeKey;
        this.nodeInfo = nodeInfo;
    }

    public TreeNode(Object nodeKey, E nodeInfo, int level) {
        if (nodeKey == null) {
            throw new NullPointerException("The node key cannot be null! node:" + nodeInfo.toString());
        }
        this.nodeKey = nodeKey;
        this.nodeInfo = nodeInfo;
        this.level = level;
    }

    private final Object nodeKey;
    private final E nodeInfo;
    private final List<TreeNode<E>> branches = new LinkedList<>();
    private int level;
    private Object result;

    public Object getNodeKey() {
        return nodeKey;
    }

    public E getNodeInfo() {
        return nodeInfo;
    }

    public List<TreeNode<E>> getBranches() {
        return branches;
    }

    public int getLevel() {
        return level;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    <K> void decorate(Collection<E> collection, final Function<E, K> getNodeKeyFunc, final Function<E, K> getRootNodeKeyFunc, int level) {
        Iterator<E> eIterator = collection.iterator();
        while (eIterator.hasNext()) {
            E e = eIterator.next();
            if (nodeKey.equals(getRootNodeKeyFunc.apply(e))) {
                branches.add(new TreeNode<>(getNodeKeyFunc.apply(e), e, level));
                eIterator.remove();
            }
        }
        if (!branches.isEmpty()) {
            for (TreeNode<E> treeNode : branches) {
                treeNode.decorate(collection, getNodeKeyFunc, getRootNodeKeyFunc, ++level);
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
        getBranches().forEach(e -> e.fullGardening(gardener, predicate));
    }

    @Override
    public String toString() {
        return nodeKey.toString();
    }
}
