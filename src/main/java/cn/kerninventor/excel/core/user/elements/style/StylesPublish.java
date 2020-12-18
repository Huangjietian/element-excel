package cn.kerninventor.excel.core.user.elements.style;

import cn.kerninventor.excel.core.constants.StyleScope;

/**
 * <p>
 *     风格发布
 * </p>
 *
 * @author Kern
 */
public @interface StylesPublish {

    Style[] value() default {};

}
