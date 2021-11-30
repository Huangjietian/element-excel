package cn.kerninventor.excel.core.user.elements.style;

import org.apache.poi.ss.usermodel.FontUnderline;

import java.lang.annotation.*;

import static org.apache.poi.hssf.util.HSSFColor.HSSFColorPredefined;

/**
 * <p>
 *     Font definition.
 * </p>
 * @author Kern
 */
@Documented
@Target(ElementType.TYPE_PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
public @interface Font {

    /**
     * 字体名称
     */
    String fontName() default FontNameConstants.SIM_SUM;

    /**
     * 字体大小
     */
    int fontSize() default 10;

    /**
     * 字体颜色
     */
    HSSFColorPredefined color() default HSSFColorPredefined.BLACK;

    /**
     * 字体加粗
     */
    boolean bold() default false;

    /**
     * 字体倾斜
     */
    boolean italic() default false;

    /**
     * 字体删除线
     */
    boolean strikeout() default false;

    /**
     * 字体下划线
     */
    FontUnderline underline() default FontUnderline.NONE;
}
