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
public @interface MultiLine {

    Line[] value();

    /**
     * 风格订阅
     * @return
     */
    int globalStyleSubs() default -1;

}
