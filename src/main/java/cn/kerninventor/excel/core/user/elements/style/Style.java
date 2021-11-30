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
     * 发布的风格的名称
     */
    String value();

    /**
     * 备注
     */
    String notes() default "";

    /**
     * 风格字体
     * @see Font
     */
    Font font() default @Font;

    /**
     * 边框风格
     */
    BorderStyle borderStyle() default BorderStyle.THIN;

    /**
     * 边框颜色
     */
    HSSFColorPredefined borderColor() default HSSFColorPredefined.BLACK;

    /**
     * 填充样式
     */
    FillPatternType fillType() default FillPatternType.SOLID_FOREGROUND;

    /**
     * 前景颜色
     */
    HSSFColorPredefined fillColor() default HSSFColorPredefined.AUTOMATIC;

    /**
     * 垂直居中样式
     */
    VerticalAlignment verticalAlignment() default VerticalAlignment.CENTER;

    /**
     * 水平居中样式
     */
    HorizontalAlignment alignment() default HorizontalAlignment.CENTER;

    /**
     * 自动换行
     */
    boolean wrapText() default false;

    /**
     * 风格锁
     */
    boolean locked() default false;

    /**
     * 缩进
     */
    int indention() default 0;

    /**
     * 隐藏
     */
    boolean hidden() default false;

    @Documented
    @Target({ElementType.TYPE, ElementType.FIELD, ElementType.TYPE_PARAMETER})
    @Retention(RetentionPolicy.RUNTIME)
    @interface List {
        Style[] value();
    }

}
