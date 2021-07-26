package cn.kerninventor.excel.core.user.elements.functionality;

import java.lang.annotation.*;

/**
 * <p>
 *     根据上下文的环境变量执行某类配置，
 *     例如；
 *      某个类的读写，
 *      某个配置的生效与否
 * </p>
 *
 * @author Kern
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD})
public @interface Profile {

    /**
     * 上下文环境变量的键
     * @return
     */
    String key();

    /**
     * 上下文环境变量的值
     * @return
     */
    String value();
}
