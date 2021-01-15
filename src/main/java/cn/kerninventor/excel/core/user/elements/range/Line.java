package cn.kerninventor.excel.core.user.elements.range;


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
@Target({ElementType.TYPE})
public @interface Line {

    int AUTO_INDEX = -1;

    /**
     * 段落
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
     * 风格订阅
     * @return
     */
    int styleSubs() default -1;

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
}
