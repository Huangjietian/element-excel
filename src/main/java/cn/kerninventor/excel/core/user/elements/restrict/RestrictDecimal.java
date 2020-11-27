package cn.kerninventor.excel.core.user.elements.restrict;

import cn.kerninventor.excel.core.constants.ComparisionType;

/**
 * <p>
 *     小数
 * </p>
 *
 * @author Kern
 */
public @interface RestrictDecimal {

    double value() default 0.00;

    double value2() default 0.00;

    ComparisionType compareType() default ComparisionType.GT;
}
