package cn.kerninventor.excel.core.user.elements.range;

import java.lang.annotation.*;

/**
 * @author kern
 */
@Documented
@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
public @interface Grid {

    /**
     * 值内容，允许使用#{}获取动态参数
     */
    String value();

    /**
     * 占用的列数
     */
    int columnNumbers() default 1;

    /**
     * 风格名称，符合发布订阅模式，如果匹配不到将使用默认风格
     */
    String style() default "Line";
}
