package cn.kerninventor.doexcel.elements.suspension;

import java.lang.annotation.*;

/**
 * <p>
 *     Text boxes definition.
 * </p>
 *
 * @author Kern
 */
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface TextBoxes {

    TextBox[] value();

}
