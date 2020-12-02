package cn.kerninventor.excel.core.user.elements.range;


import cn.kerninventor.excel.core.user.elements.RangeElement;
import cn.kerninventor.excel.core.user.interfaces.RangeElementParser;

import java.lang.annotation.*;

/**
 * <p>一句话描述</p>
 *
 * @author Kern
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@RangeElement(RangeElementParser.class)
public @interface HeadLine {

    String value();

    int styleSubs() default 0;

    int rowNumber() default 1;

    float rowHeight() default 15.0f;

}
