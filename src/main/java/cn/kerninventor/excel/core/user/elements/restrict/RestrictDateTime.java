package cn.kerninventor.excel.core.user.elements.restrict;

import cn.kerninventor.excel.core.constants.ComparisonType;

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
@RestrictColumn(supportTypes = {LocalDate.class, LocalDateTime.class, Date.class, String.class})
@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface RestrictDateTime {

    String value() default "1900-01-01";

    String value2() default "";

    ComparisonType compareType() default ComparisonType.GT;

}
