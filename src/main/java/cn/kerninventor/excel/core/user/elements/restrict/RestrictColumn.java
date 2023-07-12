package cn.kerninventor.excel.core.user.elements.restrict;

import cn.kerninventor.excel.core.user.interfaces.ColumnRestrictionFiller;

import java.lang.annotation.*;

/**
 * @author kern
 */
@Inherited
@Documented
@Target(ElementType.ANNOTATION_TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface RestrictColumn {

    Class<?>[] supportTypes();

    Class<? extends ColumnRestrictionFiller> filler();
}
