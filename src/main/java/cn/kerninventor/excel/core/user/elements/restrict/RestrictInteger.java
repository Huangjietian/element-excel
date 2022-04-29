package cn.kerninventor.excel.core.user.elements.restrict;

import cn.kerninventor.excel.core.constants.ComparisonType;

import java.lang.annotation.*;

/**
 * <p>
 *     整数
 * </p>
 *
 * @author Kern
 */
@RestrictColumn(supportTypes = {Integer.class})
@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface RestrictInteger {

    int min() default 0;

    int max() default 0;

    ComparisonType compareType() default ComparisonType.GT;
}
