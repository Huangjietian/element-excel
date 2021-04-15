package cn.kerninventor.excel.core.user.elements.restrict;

import cn.kerninventor.excel.core.constants.ComparisonType;

import java.lang.annotation.*;

/**
 * <p>
 *     文本长度
 * </p>
 *
 * @author Kern
 */
@RestrictColumn(supportTypes = Object.class)
@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface RestrictTextLength {

    int value();

    int value2();

    ComparisonType compareType() default ComparisonType.LTE;
}
