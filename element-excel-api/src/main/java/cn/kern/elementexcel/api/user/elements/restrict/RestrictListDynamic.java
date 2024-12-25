package cn.kern.elementexcel.api.user.elements.restrict;

import cn.kern.elementexcel.api.user.interfaces.defaultimpl.ColumnListDynamicRestrictionFiller;

import java.lang.annotation.*;

/**
 * <p>
 *     动态数据
 * </p>
 *
 * @author Kern
 */
@RestrictColumn(
        supportTypes = Object.class,
        filler = ColumnListDynamicRestrictionFiller.class
)
@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface RestrictListDynamic {

    String value();

}
