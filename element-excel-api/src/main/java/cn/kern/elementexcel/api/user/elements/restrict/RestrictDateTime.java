package cn.kern.elementexcel.api.user.elements.restrict;

import cn.kern.elementexcel.api.constants.ComparisonType;
import cn.kern.elementexcel.api.user.interfaces.defaultimpl.ColumnDateTimeRestrictionFiller;

import java.lang.annotation.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * <p>
 *     时间
 * </p>
 *
 * @author Kern
 */
@RestrictColumn(
        supportTypes = {LocalDate.class, LocalDateTime.class, Date.class, String.class},
        filler = ColumnDateTimeRestrictionFiller.class
)
@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface RestrictDateTime {

    String after() default "1900-01-01";

    String before() default "";

    ComparisonType compareType() default ComparisonType.GT;

}
