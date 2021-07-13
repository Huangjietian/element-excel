package cn.kerninventor.excel.core.user.elements.style;

import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.VerticalAlignment;

import java.lang.annotation.*;

import static org.apache.poi.hssf.util.HSSFColor.HSSFColorPredefined;

/**
 * <p>
 *     Style definition.
 * </p>
 * @author Kern
 */
@Documented
@Repeatable(Style.List.class)
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.TYPE_PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface Style {

    /**
     * 默认为
     * @return
     */
    double index() default StyleScope.global;

    /**
     * 备注
     * @return
     */
    String notes() default "";

    /**
     * 风格字体
     * @see Font
     * @return
     */
    Font font() default @Font;

    /**
     * 边框风格
     * @return
     */
    BorderStyle borderStyle() default BorderStyle.THIN;

    /**
     * 边框颜色
     * @return
     */
    HSSFColorPredefined borderColor() default HSSFColorPredefined.BLACK;

    /**
     * 填充样式
     * @return
     */
    FillPatternType fillType() default FillPatternType.SOLID_FOREGROUND;

    /**
     * 前景颜色
     * @return
     */
    HSSFColorPredefined fillColor() default HSSFColorPredefined.AUTOMATIC;

    /**
     * 垂直居中样式
     * @return
     */
    VerticalAlignment verticalAlignment() default VerticalAlignment.CENTER;

    /**
     * 水平居中样式
     * @return
     */
    HorizontalAlignment alignment() default HorizontalAlignment.CENTER;

    /**
     * 自动换行
     * @return
     */
    boolean wrapText() default false;

    /**
     * 风格锁
     * @return
     */
    boolean locked() default false;

    /**
     * 缩进
     * @return
     */
    int indention() default 0;

    /**
     * 隐藏
     * @return
     */
    boolean hidden() default false;


    @Documented
    @Target({ElementType.TYPE, ElementType.FIELD, ElementType.TYPE_PARAMETER})
    @Retention(RetentionPolicy.RUNTIME)
    @interface List {
        Style[] value();
    }

}
