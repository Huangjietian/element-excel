package cn.kerninventor.excel.core.user.elements;

import cn.kerninventor.excel.core.user.interfaces.RangeElementParser;

/**
 * <p>
 *     元素解析器
 * </p>
 *
 * @author Kern
 */
public @interface RangeElement {

    Class<? extends RangeElementParser> value();
}
