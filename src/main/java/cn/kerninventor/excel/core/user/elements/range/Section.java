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
@Target({ElementType.PARAMETER})
public @interface Section {

    /**
     * 内容
     * @return
     */
    String value();

    /**
     * 风格
     * @return
     */
    int styleSubs() default -1;

    /**
     * 占据的列数
     * @return
     */
    int colLength() default Integer.MAX_VALUE;

}
