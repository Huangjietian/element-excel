package cn.kerninventor.excel.core.user.elements.restrict;

import cn.kerninventor.excel.core.user.elements.Element;

import java.lang.annotation.*;

@Inherited
@Documented
@Target(ElementType.ANNOTATION_TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface RestrictColumn {

    Class<?>[] supportTypes();
}
