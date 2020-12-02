package cn.kerninventor.excel.core.user.interfaces;

import cn.kerninventor.excel.core.io.component.MergeRange;

import java.lang.annotation.Annotation;
import java.util.List;

/**
 * <p>
 *     表体元素解析器
 * </p>
 *
 * @author Kern
 */
public interface RangeElementParser<A extends Annotation> {

    List<MergeRange> parse(A rangeAnnotation);
}
