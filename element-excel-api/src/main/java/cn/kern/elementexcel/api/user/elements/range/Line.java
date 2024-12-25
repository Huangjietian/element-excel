package cn.kern.elementexcel.api.user.elements.range;



import cn.kern.elementexcel.api.user.elements.style.StyleNameConstants;

import java.lang.annotation.*;

/**
 * <p>
 *     The title;Subtitles;instructions.
 * </p>
 * 例如
 * {@code
 *      @Line({"备注","","签名",""})
 *      @Tabulation
 *      public class Template {
 *
 *      }
 * }
 *      生成四格的行  | 备注 |      | 签名 |     |
 * 连续的多个重复内容的行将进行合并
 * 例如
 * {@code
 *      @Line({"备注","备注","","签名",""})
 *      @Tabulation
 *      public class Template {
 *
 *      }
 *      生成五格的行  |     备注     |      | 签名 |     |
 * }
 * 允许使用占位符获取动态参数 #{}
 * 例如
 * {@code
 *      @Line({"备注","#{remark}","签名","#{sign}"})
 *      @Tabulation
 *      public class Template {
 *
 *      }
 * }
 *      将获取动态参数容器中中对应健的值填充到相应单元格中
 * @author Kern
 */
@Documented
@Repeatable(Line.List.class)
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface Line {

    /**
     * 使用该字段表示该行的每一个段落都仅占据一列，共拥有字符串数组长度总和的段落。
     */
    String[] value() default {};

    /**
     * 复杂行的配置，非空的情况下将替代 value()
     * 如果你需要行的每一个段落具有不同的风格可以使用该项做配置
     */
    Grid[] grids() default {};

    /**
     * 列下标
     * 如果小于0将按照配置顺序自适应
     */
    int columnIndex() default -1;

    /**
     * 行下标
     * 如果小于0将按照配置顺序自适应
     */
    int rowIndex() default -1;

    /**
     * 行数
     */
    int rowNumbers() default 1;

    /**
     * 行高
     */
    float rowHeight() default 15.0f;

    /**
     * 是否位于底部
     */
    boolean bottom() default false;

    /**
     * 自动对齐列数，在行的列数不足表格的表头列时最后一个单元格将合并不足的列数作为行的最后一个单元格
     */
    boolean autoAlign() default false;

    /**
     * 风格名称，符合发布订阅模式，如果匹配不到将使用默认风格
     */
    String style() default StyleNameConstants.LINE;

    @Documented
    @Target(ElementType.TYPE)
    @Retention(RetentionPolicy.RUNTIME)
    @interface List {
        Line[] value();
    }
}
