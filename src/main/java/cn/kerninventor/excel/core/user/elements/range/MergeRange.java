package cn.kerninventor.excel.core.user.elements.range;

import cn.kerninventor.excel.core.user.elements.Element;
import cn.kerninventor.excel.core.user.elements.style.DefaultStyleIndex;

/**
 * <p>
 *     合并区域
 * </p>
 *
 * @author Kern
 */
@Element(1)
public @interface MergeRange {

    /**
     * 风格下标
     * @return
     */
    double styleIndex() default DefaultStyleIndex.defaultRange;
}
