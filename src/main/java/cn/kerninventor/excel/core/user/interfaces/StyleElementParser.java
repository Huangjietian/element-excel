package cn.kerninventor.excel.core.user.interfaces;

import cn.kerninventor.excel.core.user.elements.style.Style;
import org.apache.poi.ss.usermodel.CellStyle;

import java.lang.annotation.Annotation;
import java.util.List;

/**
 * <p>
 *     风格元素解析器
 * </p>
 *
 * @author Kern
 */
public interface StyleElementParser <A extends Annotation> {

    List<CellStyle> parse(A styleAnnotation);
}
