package cn.kern.elementexcel.api.user.elements.restrict;

import cn.kern.elementexcel.api.user.interfaces.defaultimpl.ColumnListEnumRestrictionFiller;

import java.lang.annotation.*;

/**
 * <p>
 *     枚举类下拉数组
 * </p>
 *
 * @author Kern
 */
@RestrictColumn(
        supportTypes = Object.class,
        filler = ColumnListEnumRestrictionFiller.class
)
@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface RestrictListEnum {

    Class<? extends Enum> value();

}
