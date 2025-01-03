package cn.kern.elementexcel.api.user.elements.restrict;

import cn.kern.elementexcel.api.user.interfaces.defaultimpl.ColumnListCascadeRestrictionFiller;

import java.lang.annotation.*;

/**
 * <p>
 *     级联
 * </p>
 *
 * @author Kern
 */
@RestrictColumn(
        supportTypes = Object.class,
        filler = ColumnListCascadeRestrictionFiller.class
)
@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface RestrictListCascade {

    /**
     * 需要解决键的自动前缀，_
     * 同时需要解决如果键中包含特殊符号，应该对键进行特殊字符的替换，同时使用excel函数对函数进行等值替换
     */
    String value();

}
