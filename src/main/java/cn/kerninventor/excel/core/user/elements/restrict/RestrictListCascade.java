package cn.kerninventor.excel.core.user.elements.restrict;

/**
 * <p>
 *     级联
 * </p>
 *
 * @author Kern
 */
public @interface RestrictListCascade {

    /**
     * 需要解决键的自动前缀，_
     * 同时需要解决如果键中包含特殊符号，应该对键进行特殊字符的替换，同时使用excel函数对函数进行等值替换
     * @return
     */
    String value();

}
