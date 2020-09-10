package cn.kerninventor.doexcel.elements.caption;


import cn.kerninventor.doexcel.elements.style.Font;
import cn.kerninventor.doexcel.elements.style.Style;

/**
 * <p>一句话描述</p>
 *
 * @author Kern
 */
public @interface HeadLine {

    String value();

    Style style() default @Style(font = @Font(fontSize = 12, fontName = "Arial Black"));

    int rowNumber() default 1;

    float rowHeight() default 15.0f;

}
