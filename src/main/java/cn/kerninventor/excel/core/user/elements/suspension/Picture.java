package cn.kerninventor.excel.core.user.elements.suspension;

import cn.kerninventor.excel.core.user.elements.Element;

import java.lang.annotation.*;
import java.net.URI;
import java.net.URL;

/**
 * <p>
 *     Picture definition.
 * </p>
 *
 * @author Kern
 */
@Element(Integer.MAX_VALUE - 4)
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
