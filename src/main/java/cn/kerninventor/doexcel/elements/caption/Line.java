package cn.kerninventor.doexcel.elements.caption;


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

    /**
     * 段落
     * @return
     */
    Section[] value() default {};

    /**
     * 风格订阅
     * @return
     */
    int styleSubs() default -1;

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
