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
        if (nodeKey == null) {
            throw new NullPointerException("The node key cannot be null! node:" + nodeInfo.toString());
        }
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

    public List<TreeNode<E>> getBranches() {
        return branches;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    <K> void decorate(Collection<E> collection, final Function<E, K> getNodeKeyFunc, final Function<E, K> getRootNodeKeyFunc) {
        Iterator<E> eIterator = collection.iterator();
        while (eIterator.hasNext()) {
            E e = eIterator.next();
            if (nodeKey.equals(getRootNodeKeyFunc.apply(e))) {
                branches.add(new TreeNode<>(getNodeKeyFunc.apply(e), e));
                eIterator.remove();
            }
        }
        if (!branches.isEmpty()) {
            for (TreeNode<E> treeNode : branches) {
                treeNode.decorate(collection, getNodeKeyFunc, getRootNodeKeyFunc);
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

    @Override
    public String toString() {
        return nodeKey.toString();
    }
}
