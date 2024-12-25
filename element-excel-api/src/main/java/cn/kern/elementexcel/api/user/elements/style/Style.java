package cn.kern.elementexcel.api.user.elements.style;

import org.apache.poi.ss.usermodel.*;

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
     * @see cn.kern.elementexcel.api.user.elements.style.Font
     */
    cn.kern.elementexcel.api.user.elements.style.Font font() default @Font;

    /**
     * 边框风格
     */
    BorderStyle borderStyle() default BorderStyle.THIN;

    /**
     * 边框颜色
     */
    HSSFColorPredefined borderColor() default HSSFColorPredefined.BLACK;

    /**
     * 前景填充样式
     */
    FillPatternType fillType() default FillPatternType.SOLID_FOREGROUND;

    /**
     * 前景颜色
     */
    HSSFColorPredefined foregroundFillColor() default HSSFColorPredefined.AUTOMATIC;

    /**
     * 背景颜色
     */
    HSSFColorPredefined backgroundFillColor() default HSSFColorPredefined.AUTOMATIC;

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
    short indention() default 0;

    /**
     * 隐藏
     */
    boolean hidden() default false;


    /**
     * 旋转角度
     */
    short rotation() default 0;

    /**
     * 打开或关闭样式的引用前缀
     */
    boolean quotePrefixed() default false;

    /**
     * 设置根据内容自行缩进
     */
    boolean shrinkToFit() default false;

    /**
     * 单元格格式下标 {@link org.apache.poi.ss.usermodel.BuiltinFormats}
     */
    String dataFormat() default "General";

    @Documented
    @Target({ElementType.TYPE, ElementType.FIELD, ElementType.TYPE_PARAMETER})
    @Retention(RetentionPolicy.RUNTIME)
    @interface List {
        Style[] value();
    }

}
