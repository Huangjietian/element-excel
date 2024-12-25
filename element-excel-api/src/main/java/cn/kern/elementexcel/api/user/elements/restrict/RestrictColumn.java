package cn.kern.elementexcel.api.user.elements.restrict;

import cn.kern.elementexcel.api.user.interfaces.ColumnRestrictionFiller;

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
