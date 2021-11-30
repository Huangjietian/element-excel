package cn.kerninventor.excel.core;

import cn.kerninventor.excel.core.constants.DocumentType;
import cn.kerninventor.excel.core.io.reader.ElementExcelReader;
import cn.kerninventor.excel.core.io.writer.ElementExcelWriter;
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
public class ElementExcelFactory {

    public static <T> ElementExcelWriter<T> callWriter(Class<T> templateClass) {
        return callWriter(templateClass, DocumentType.XLSX);
    }

    public static <T> ElementExcelWriter<T> callWriter(Class<T> templateClass, DocumentType documentType) {
        Workbook workbook;
        if (documentType == DocumentType.XLS) {
            workbook = new HSSFWorkbook();
        } else {
            workbook = new XSSFWorkbook();
        }
        return null;
    }

    public static <T> ElementExcelReader<T> callReader(Class<T> tClass, Workbook workbook) {
        return null;
    }

}
