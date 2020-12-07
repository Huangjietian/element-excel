package cn.kerninventor.excel.core.user.interfaces;

import org.apache.poi.ss.usermodel.Sheet;

import java.lang.annotation.Annotation;

/**
 * <p>
 *     Sheet页元素解析器
 * </p>
 *
 * @author Kern
 */
public interface SheetElementParser<A extends Annotation> {

    void parse(Sheet sheet, A annotation);

}
