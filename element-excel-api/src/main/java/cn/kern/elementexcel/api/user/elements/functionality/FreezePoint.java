package cn.kern.elementexcel.api.user.elements.functionality;

import java.lang.annotation.*;

/**
 * <p>
 *     冻结点
 *     默认值冻结效果是无效的
 * </p>
 * @author kern
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface FreezePoint {

    /**
     * 设置行冻结点
     * 如果小于0将打印警告日志并采用默认值
     */
    int rowIndex() default 0;

    /**
     * 设置列冻结点
     * 如果小于0将打印警告日志并采用默认值
     */
    int colIndex() default 0;

}
