package cn.kerninventor.excel.core;

import cn.kerninventor.excel.core.constants.DocumentType;
import cn.kerninventor.excel.core.io.reader.Reader;
import cn.kerninventor.excel.core.io.writer.Writer;
import cn.kerninventor.excel.core.io.component.TabulationContext;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * <p>
 *     entrance. Simple Method Factory!
 * </p>
 *
 * @author Kern
 */
public class ExcelElementsEntrance {

    public static <T> Writer<T> callWriter(Class<T> templateClass) {
        return callWriter(templateClass, DocumentType.XLSX);
    }

    public static <T> Writer<T> callWriter(Class<T> templateClass, DocumentType documentType) {
        Workbook workbook;
        if (documentType == DocumentType.XLS) {
            workbook = new HSSFWorkbook();
        } else {
            workbook = new XSSFWorkbook();
        }
        return null;
    }

    public static <T> Reader<T> callReader(Class<T> tClass, Workbook workbook) {
        return null;
    }

}
