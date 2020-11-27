package cn.kerninventor.excel.core;

import cn.kerninventor.excel.core.constants.DocumentType;
import cn.kerninventor.excel.core.io.Reader;
import cn.kerninventor.excel.core.io.Writer;
import cn.kerninventor.excel.core.io.component.ComponentFactory;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * <p>一句话描述</p>
 *
 * @author Kern
 */
public class ExcelKit {

    public static <T> Writer<T> callWriter(Class<T> tClass) {
        return callWriter(tClass, DocumentType.XLSX);
    }

    public static <T> Writer<T> callWriter(Class<T> tClass, DocumentType documentType) {
        Workbook workbook;
        if (DocumentType.XLSX == documentType) {
            workbook = new XSSFWorkbook();
        } else {
            workbook = new HSSFWorkbook();
        }
        ComponentFactory parser = ComponentFactory.of(tClass);
        return null;
    }

    public static <T> Reader<T> callReader(Class<T> tClass, DocumentSource source) {
        Workbook workbook = source.getWorkbook();
        ComponentFactory parser = ComponentFactory.of(tClass);
        return null;
    }

}
