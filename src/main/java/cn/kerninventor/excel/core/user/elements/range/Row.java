package cn.kerninventor.excel.core.user.elements.range;



import cn.kerninventor.excel.core.user.elements.Element;
import cn.kerninventor.excel.core.user.elements.style.DefaultStyleIndex;

import java.lang.annotation.*;

/**
 * <p>
 *     The title;Subtitles;instructions.
 * </p>
 *
 * @author Kern
 */
@Element(2)
@Documented
@Repeatable(Row.List.class)
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface Row {

    int AUTO_INDEX = -1;

    /**
     * 风格下标
     * @return
     */
    double styleIndex() default DefaultStyleIndex.defaultRange;

    /**
     * 段落, 用于配置复杂的包含多个段落的行
     * @return
     */
    Section[] value() default {};

    /**
     * 使用该字段表示该行的每一个段落都仅占据一列，共拥有字符串数组长度总和的段落。
     * 例如 {@code @Line(strValue = {"备注","","签名",""})}
     * 讲生成四格的行  | 备注 |      | 签名 |     |
     * @return
     */
    String[] strValue() default {};

    /**
     * 列下标
     * @return
     */
    int columnIndex() default AUTO_INDEX;

    /**
     * 行下标
     * @return
     */
    int rowIndex() default AUTO_INDEX;

    /**
     * 行数
     * @return
     */
    int rowNumber() default 1;

    /**
     * 行高
     * @return
     */
    float rowHeight() default 15.0f;

    /**
     * 是否位于底部
     * @return
     */
    boolean bottom() default false;

    @Documented
    @Target(ElementType.TYPE)
    @Retention(RetentionPolicy.RUNTIME)
    @interface List {
        Row[] value();
    }
}
