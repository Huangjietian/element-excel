package cn.kerninventor.doexcel.elements.style;

import java.lang.annotation.*;

/**
 * <p>
 *     Cell style group definition.
 * </p>
 *
 * @author Kern
 */
@Documented
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface StyleGroup {

    int value() default 0;

    Style headStyle() default @Style(font = @Font(fontName = "Arial Black", fontSize = 12));

    Style bodyStyle() default @Style;
}
