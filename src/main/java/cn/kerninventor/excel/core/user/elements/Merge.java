package cn.kerninventor.excel.core.user.elements;

import cn.kerninventor.excel.core.user.impl.DefaultColumnFieldComparator;
import cn.kerninventor.excel.core.user.interfaces.ColumnFieldComparator;

import java.util.Comparator;

/**
 * <p>一句话描述</p>
 *
 * @author Kern
 */
public @interface Merge {

    /**
     * 基于对应字段名的列进行合并
     * @return
     */
    String baseOnFieldName() default "";

    /**
     * 是否合并空值
     * @return
     */
    boolean mergeOfEmptyValues() default false;

    /**
     * 是否对String类型的字段进行 {@link String#trim()}
     * @return
     */
    boolean trimOfValue() default true;

    /**
     *
     * 定义比较器,使用该比较器进行相符判断,对于复杂对象,可以实现 {@link ColumnFieldComparator}接口,并在该处声明
     * @return
     */
    Class<? extends ColumnFieldComparator> comparator() default DefaultColumnFieldComparator.class;

}
