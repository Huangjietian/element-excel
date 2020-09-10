package cn.kerninventor.doexcel.elements.suspension;

import java.lang.annotation.*;

/**
 * <p>
 *     Pictures definition.
 * </p>
 *
 * @author Kern
 */
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Pictures {

    Picture[] value();
}
