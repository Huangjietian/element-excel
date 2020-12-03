package cn.kerninventor.excel.core.user.impl;

import cn.kerninventor.excel.core.user.interfaces.CellValueComparator;

/**
 * <p>
 *     默认的列字段比较器
 * </p>
 *
 * @author Kern
 */
public class DefaultCellValueComparator <T> implements CellValueComparator<T> {

    @Override
    public boolean compare(T o1, T o2) {
        return o1.equals(o2);
    }

}
