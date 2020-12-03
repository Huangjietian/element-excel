package cn.kerninventor.excel.core.user.elements;

import cn.kerninventor.excel.core.user.interfaces.RangeElementParser;

import java.lang.annotation.*;

/**
 * <p>
 *     元素解析器
 * </p>
 *
 * @author Kern
 */
@Element
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.ANNOTATION_TYPE)
public @interface RangeElement {

    Class<? extends RangeElementParser> value();

}
