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
@Target({ElementType.PARAMETER, ElementType.FIELD})
public @interface Section {

    /**
     * 内容
     * @return
     */
    String value();

    /**
     * 占据的列数
     * @return
     */
    int columnNumber() default 1;

}
