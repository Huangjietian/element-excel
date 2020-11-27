package cn.kerninventor.excel.core.user.elements.restrict;

import cn.kerninventor.excel.core.constants.ComparisionType;

/**
 * <p>
 *     整数
 * </p>
 *
 * @author Kern
 */
public @interface RestrictInteger {

    int value() default 0;

    int value2() default 0;

    ComparisionType compareType() default ComparisionType.GT;
}
