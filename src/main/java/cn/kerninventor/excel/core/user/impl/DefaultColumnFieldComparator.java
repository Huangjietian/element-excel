package cn.kerninventor.excel.core.user.impl;

import cn.kerninventor.excel.core.user.interfaces.ColumnFieldComparator;

/**
 * <p>
 *     默认的列字段比较器
 * </p>
 *
 * @author Kern
 */
public class DefaultColumnFieldComparator implements ColumnFieldComparator<Object> {

    @Override
    public boolean equals(Object t1, Object t2) {
        return t1.equals(t2);
    }
}
