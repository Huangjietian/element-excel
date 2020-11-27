package cn.kerninventor.excel.core.user.elements.restrict;

import cn.kerninventor.excel.core.constants.ComparisionType;

/**
 * <p>
 *     文本长度
 * </p>
 *
 * @author Kern
 */
public @interface RestrictTextLength {

    int value();

    int value2();

    ComparisionType compareType() default ComparisionType.LTE;
}
