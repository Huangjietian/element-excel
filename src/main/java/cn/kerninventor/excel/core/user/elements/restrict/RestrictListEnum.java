package cn.kerninventor.excel.core.user.elements.restrict;

import cn.kerninventor.excel.core.user.interfaces.defaultimpl.ColumnListEnumRestrictionFiller;

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
