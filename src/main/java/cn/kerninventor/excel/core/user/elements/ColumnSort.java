package cn.kerninventor.excel.core.user.elements;

import cn.kerninventor.excel.core.user.impl.DefaultColumnFieldComparator;
import cn.kerninventor.excel.core.user.interfaces.ColumnFieldComparator;

/**
 * <p>
 *     列排序器
 * </p>
 *
 * @author Kern
 */
public @interface ColumnSort {

    /**
     * 排序优先权重
     * @return
     */
    int value() default 0;

    /**
     * 比较器
     * @return
     */
    Class<? extends ColumnFieldComparator> comparator() default DefaultColumnFieldComparator.class;
}
