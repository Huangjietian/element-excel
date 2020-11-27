package cn.kerninventor.excel.core.user.elements.restrict;

/**
 * <p>
 *     枚举类下拉数组
 * </p>
 *
 * @author Kern
 */
public @interface RestrictListEnum {

    Class<? extends Enum> value();

}
