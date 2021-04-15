package cn.kerninventor.excel.core.user.elements.restrict;

import java.lang.annotation.*;

/**
 * <p>
 *     静态数据
 * </p>
 *
 * @author Kern
 */
@RestrictColumn(supportTypes = Object.class)
@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface RestrictListStatic {

    String[] value();
}
