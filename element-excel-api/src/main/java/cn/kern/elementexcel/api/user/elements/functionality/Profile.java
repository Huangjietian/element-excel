package cn.kern.elementexcel.api.user.elements.functionality;

import java.lang.annotation.*;

/**
 * <p>
 *     根据上下文的环境变量执行某类配置，
 *     例如；
 *     - env的注入
 *     - 动态数据的注入
 *     - 表格列的修改
 *     - 风格的修改
 *     - 显示与隐藏
 *     - 动态字典置换
 *     - 数据筛选
 * </p>
 *
 * @author Kern
 */
@Documented
@Repeatable(Profile.List.class)
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD})
public @interface Profile {

    /**
     * 上下文环境变量的键
     */
    String key();

    /**
     * 上下文环境变量的值
     */
    String value();

    @Documented
    @Target({ElementType.FIELD, ElementType.METHOD})
    @Retention(RetentionPolicy.RUNTIME)
    @interface List {
        Profile[] value();
    }
}
