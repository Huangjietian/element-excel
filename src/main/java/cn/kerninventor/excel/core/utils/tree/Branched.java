package cn.kerninventor.excel.core.utils.tree;

import java.io.Serializable;
import java.util.Collection;

/**
 * <p>
 *     实现了该接口的类可以被{@link TreeWrappers#ofBranches(Collection, TreeWrappers.TreeRootStrategy)} 方法接收，并将返回一个泛型为当前类的Tree类实例。实现树状结构的封装
 * </p>
 * @author Kern
 */
public interface Branched<Key> extends Serializable {

    /**
     * 子节点唯一标识
     * @return key
     */
    Key nodeKey();

    /**
     * 父节点唯一标识
     * @return key
     */
    Key rootNodeKey();

}
