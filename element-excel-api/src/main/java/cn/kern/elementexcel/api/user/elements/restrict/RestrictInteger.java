package cn.kern.elementexcel.api.user.elements.restrict;

import cn.kern.elementexcel.api.constants.ComparisonType;
import cn.kern.elementexcel.api.user.interfaces.defaultimpl.ColumnIntegerRestrictionFiller;

import java.lang.annotation.*;

/**
 * <p>
 *     整数
 * </p>
 *
 * @author Kern
 */
@RestrictColumn(
        supportTypes = {Integer.class},
        filler = ColumnIntegerRestrictionFiller.class
)
@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface RestrictInteger {

    int min() default 0;

    int max() default 0;

    ComparisonType compareType() default ComparisonType.GT;
}
