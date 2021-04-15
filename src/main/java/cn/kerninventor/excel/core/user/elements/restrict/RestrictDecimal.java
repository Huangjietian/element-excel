package cn.kerninventor.excel.core.user.elements.restrict;

import cn.kerninventor.excel.core.constants.ComparisonType;

import java.lang.annotation.*;
import java.math.BigDecimal;

/**
 * <p>
 *     小数
 * </p>
 *
 * @author Kern
 */
@RestrictColumn(supportTypes = {Double.class, Float.class, BigDecimal.class})
@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface RestrictDecimal {

    double value() default 0.00;

    double value2() default 0.00;

    ComparisonType compareType() default ComparisonType.GT;
}
