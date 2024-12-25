package cn.kern.elementexcel.api.user.elements.restrict;

import cn.kern.elementexcel.api.constants.ComparisonType;
import cn.kern.elementexcel.api.user.interfaces.defaultimpl.ColumnTextLengthRestrictionFiller;

import java.lang.annotation.*;

/**
 * <p>
 *     文本长度
 * </p>
 *
 * @author Kern
 */
@RestrictColumn(
        supportTypes = Object.class,
        filler = ColumnTextLengthRestrictionFiller.class
)
@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface RestrictTextLength {

    int min() default 0;

    int max() default 255;

    ComparisonType compareType() default ComparisonType.LTE;
}
