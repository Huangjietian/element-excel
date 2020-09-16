package cn.kerninventor.doexcel.elements;


import cn.kerninventor.doexcel.constants.Usage;
import cn.kerninventor.doexcel.definition.ElementParser;

import java.lang.annotation.*;

/**
 * <p>
 *     Excel elements. You can use this to custom your excel annotation.
 * </p>
 *
 * @author Kern
 */
@Documented
@Inherited
@Target(ElementType.ANNOTATION_TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface ExcelElements {

    Class<? extends ElementParser> parser();

    Usage usage();

    boolean isMore();
}
