package cn.kerninventor.excel.core.user.elements.range;


import java.lang.annotation.*;

/**
 * <p>一句话描述</p>
 *
 * @author Kern
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface HeadLine {

    String value();

    int rowNumber() default 1;

    float rowHeight() default 15.0f;

}
