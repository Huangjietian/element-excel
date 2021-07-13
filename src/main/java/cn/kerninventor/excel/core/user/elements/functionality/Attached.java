package cn.kerninventor.excel.core.user.elements.functionality;

import java.lang.annotation.*;

/**
 * <p>
 *     附加的表格内容，
 *     为了避免配置类的各类配置过多，导致配置类难以阅读和维护，编程人员可以通过在主模板类中添加额外的模板配置对模板的不同配置进行分类
 * </p>
 *
 * @author Kern
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Attached {


}
