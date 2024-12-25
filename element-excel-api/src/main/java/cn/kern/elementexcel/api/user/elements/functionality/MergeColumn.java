package cn.kern.elementexcel.api.user.elements.functionality;

import cn.kern.elementexcel.api.user.interfaces.defaultimpl.DefaultCellValueComparator;
import cn.kern.elementexcel.api.user.interfaces.CellValueComparator;

import java.lang.annotation.*;

/**
 * <p>
 *     列的合并配置
 * </p>
 *
 * @author Kern
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface MergeColumn {

    /**
     * 基于对应字段名的列进行合并
     * 如果未匹配到指定的字段名，将导致基于列的合并无效，采用当前列合并
     */
    String baseOn() default "";

    /**
     * 定义比较器,使用该比较器进行相符判断,对于复杂对象,可以实现 {@link CellValueComparator}接口,并在该处声明
     */
    Class<? extends CellValueComparator> comparator() default DefaultCellValueComparator.class;

}
