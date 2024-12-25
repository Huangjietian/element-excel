package cn.kern.elementexcel.api.user.elements.range;


import cn.kern.elementexcel.api.user.elements.style.StyleNameConstants;

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

    /**
     * 大标题内容,允许使用#{}获取动态标题
     */
    String value();

    /**
     * 大标题占用行数
     */
    int rowNumbers() default 1;

    /**
     * 大标题行高度
     */
    float rowHeight() default 15.0f;

    /**
     * 风格名称，符合发布订阅模式，如果匹配不到将使用默认风格
     */
    String style() default StyleNameConstants.HEADLINE;

}
