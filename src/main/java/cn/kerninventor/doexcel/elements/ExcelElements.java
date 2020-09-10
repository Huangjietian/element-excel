package cn.kerninventor.doexcel.elements;


import cn.kerninventor.doexcel.constants.Usage;
import cn.kerninventor.doexcel.parser.ElementParser;

import java.lang.annotation.*;

/**
 * <p>一句话描述</p>
 *
 * @author Kern
 */
@Documented
@Target(ElementType.ANNOTATION_TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface ExcelElements {

    Class<? extends ElementParser> parser();

    Usage usage();
}
