package cn.kerninventor.doexcel.elements.suspension;

import java.lang.annotation.*;

/**
 * <p>
 *     Picture definition.
 * </p>
 *
 * @author Kern
 */
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Picture {

    String value();

    Anchor anchor();
}
