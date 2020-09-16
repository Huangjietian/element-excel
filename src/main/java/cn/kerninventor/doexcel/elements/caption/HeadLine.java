package cn.kerninventor.doexcel.elements.caption;


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

    int styleSubs() default 0;

    int rowNumber() default 1;

    float rowHeight() default 15.0f;

}
