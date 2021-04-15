package cn.kerninventor.excel.core;

import cn.kerninventor.excel.core.constants.DocumentType;
import cn.kerninventor.excel.core.io.reader.Reader;
import cn.kerninventor.excel.core.io.writer.Writer;
import cn.kerninventor.excel.core.io.component.ComponentFactory;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * <p>
 *     Beeper. Simple Method Factory!
 * </p>
 *
 * @author Kern
 */
public class ExcelBeeper {

    public static <T> Writer<T> callWriter(Class<T> tClass) {
        return callWriter(tClass, DocumentType.XLSX);
    }

    public static <T> Writer<T> callWriter(Class<T> tClass, DocumentType documentType) {
        Workbook workbook;
        if (documentType == DocumentType.XLS) {
            workbook = new HSSFWorkbook();
        } else {
            workbook = new XSSFWorkbook();
        }
        ComponentFactory<T> parser = ComponentFactory.of(tClass);
        return null;
    }

    public static <T> Reader<T> callReader(Class<T> tClass, Workbook workbook) {
        ComponentFactory<T> parser = ComponentFactory.of(tClass);
        return null;
    }

}
