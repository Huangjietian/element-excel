package cn.kern.elementexcel.api.user.elements.restrict;

import cn.kern.elementexcel.api.constants.ComparisonType;
import cn.kern.elementexcel.api.user.interfaces.defaultimpl.ColumnDecimalRestrictionFiller;

import java.lang.annotation.*;
import java.math.BigDecimal;

/**
 * <p>
 *     小数
 * </p>
 *
 * @author Kern
 */
@RestrictColumn(
        supportTypes = {Double.class, Float.class, BigDecimal.class},
        filler = ColumnDecimalRestrictionFiller.class
)
@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface RestrictDecimal {

    double min() default 0.00;

    double max() default 0.00;

    ComparisonType compareType() default ComparisonType.GT;
}
