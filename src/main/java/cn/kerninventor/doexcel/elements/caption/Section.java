package cn.kerninventor.doexcel.elements.caption;


import cn.kerninventor.doexcel.elements.style.Style;

import java.lang.annotation.*;

/**
 * <p>
 *     The title;Subtitles;instructions.
 * </p>
 *
 * @author Kern
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.PARAMETER})
public @interface Section {

    /**
     * 内容
     * @return
     */
    String value();

    /**
     * 风格
     * @return
     */
    Style style() default @Style;

    /**
     * 结束列
     * @return
     */
    int colEnd() default Integer.MAX_VALUE;

}
