package cn.kern.elementexcel.api.user.elements.suspension;

import java.lang.annotation.*;

/**
 * <p>
 *     Picture definition.
 * </p>
 *
 * @author Kern
 */
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Picture {

    /**
     * 本地文件绝对路径
     * 系统相对文件路径
     * 网络文件路径
     * base646字符
     * @return
     */
    String value();

    int[] anchorIndex();
}
