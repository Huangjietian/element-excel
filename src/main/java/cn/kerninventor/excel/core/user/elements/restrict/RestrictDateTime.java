package cn.kerninventor.excel.core.user.elements.restrict;

import cn.kerninventor.excel.core.constants.ComparisionType;

/**
 * <p>
 *     时间
 * </p>
 *
 * @author Kern
 */
public @interface RestrictDateTime {

    String value() default "1900-01-01";

    String value2() default "";

    ComparisionType compareType() default ComparisionType.GT;

}
