package cn.kerninventor.excel.core.user.elements.restrict;

import cn.kerninventor.excel.core.constants.ComparisonType;
import cn.kerninventor.excel.core.user.interfaces.defaultimpl.ColumnTextLengthRestrictionFiller;

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
