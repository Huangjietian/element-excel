package cn.kerninventor.excel.core.user.elements.restrict;

import cn.kerninventor.excel.core.constants.ComparisonType;
import cn.kerninventor.excel.core.user.interfaces.defaultimpl.ColumnIntegerRestrictionFiller;

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
