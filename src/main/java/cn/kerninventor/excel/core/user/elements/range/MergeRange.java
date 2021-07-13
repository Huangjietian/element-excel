package cn.kerninventor.excel.core.user.elements.range;

import cn.kerninventor.excel.core.user.elements.style.StyleScope;

/**
 * <p>
 *     合并区域
 * </p>
 *
 * @author Kern
 */
public @interface MergeRange {

    /**
     * 风格下标
     * @return
     */
    double styleIndex() default StyleScope.global;
}
