package cn.kern.elementexcel.api.user.elements;


import cn.kern.elementexcel.api.user.elements.style.Style;
import cn.kern.elementexcel.api.user.elements.style.StyleNameConstants;
import org.apache.poi.ss.usermodel.BorderStyle;

import java.lang.annotation.*;

/**
 * <p>
 *     表格定义
 * </p>
 *
 * @author Kern
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface Tabulation {

    /**
     * 定义表头行行高
     * 如果小于0将打印警告日志并采用默认值
     */
    float theadRowHeight() default 15.0f;

    /**
     * 定义表体行行高
     * 如果小于0将打印警告日志并采用默认值
     */
    float tbodyRowHeight() default 15.0f;

    /**
     * 定义起始行
     * 如果小于0将打印警告日志并采用默认值
     */
    int startRowIndex() default 0;

    /**
     * 定义起始列
     * 如果小于0将打印警告日志并采用默认值
     */
    int startColumnIndex() default 0;

    /**
     * 定义表体配置有效行数
     * 有效行数指表格表体部分各项配置生效的行数，包括各类函数，数据校验，单元格格式，风格等。
     * 如果小于0将打印警告日志并采用默认值
     */
    int effectiveRows() default 100;

    /**
     * 定义最小列宽 Integer.MIN_VALUE ~ {@link Tabulation#maximumColumnsWidth}
     * 如果定义的最小列宽小于或等于0，将进行列宽的自适应(根据列表头的文本内容进行适应)
     * 如果定义的最小列宽大于{@link Tabulation#maximumColumnsWidth},将采用默认值
     */
    int minimumColumnsWidth() default 0;

    /**
     * 定义最大列宽 0 ~ 255
     * 如果定义的最大列宽小于0或大于255，将打印警告日志并采用默认值
     */
    int maximumColumnsWidth() default 255;

    /**
     * 默认风格
     */
    Style defaultStyle() default @Style(
            value = StyleNameConstants.DEFAULT,
            notes = "Default Style",
            borderStyle = BorderStyle.NONE
    );
}
