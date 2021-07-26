package cn.kerninventor.excel.core.user.elements.range;


import cn.kerninventor.excel.core.user.elements.Element;
import cn.kerninventor.excel.core.user.elements.style.DefaultStyleIndex;

import java.lang.annotation.*;

/**
 * <p>一句话描述</p>
 *
 * @author Kern
 */
@Element(1)
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface HeadLine {


    String value();

    int rowNumber() default 1;

    float rowHeight() default 15.0f;

    /**
     * 风格下标
     * @return
     */
    double styleIndex() default DefaultStyleIndex.headline;
}
