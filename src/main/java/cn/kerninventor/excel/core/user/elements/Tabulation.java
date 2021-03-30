package cn.kerninventor.excel.core.user.elements;

import cn.kerninventor.excel.core.user.elements.style.Style;

import java.lang.annotation.*;

/**
 * <p>
 *     表格定义
 * </p>
 *
 * @author Kern
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface Tabulation {

    /**
     * 定义表头行行高,不能小于0,小于0将导致异常
     * @return
     */
    float theadRowHeight() default 15.0f;

    /**
     * 定义表体行行高,不能小于0,小于0将导致异常
     * @return
     */
    float tbodyRowHeight() default 15.0f;

    /**
     * 定义起始行,不能小于0,小于0将视为0
     * @return
     */
    int startRowIndex() default 0;

    /**
     * 定义起始列,不能小于0,小于0将视为0
     * @return
     */
    int startColumnIndex() default 0;

    /**
     * 定义表体配置有效行数,不能小于0,小于0将导致异常
     * @return
     */
    int effectiveRows() default 20;

    /**
     * 定义最小列宽,不能小于0,小于0将视为0
     * @return
     */
    int minimumColumnsWidth() default 0;

    /**
     * 定义最大列宽,不能超过255,否则将导致异常
     * @return
     */
    int maximumColumnsWidth() default 255;

    /**
     * 设置行冻结点
     * @return
     */
    int rowFreezePoint() default 0;

    /**
     * 设置列冻结点
     * @return
     */
    int columnFreezePoint() default 0;


}
