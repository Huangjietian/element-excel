package cn.kern.elementexcel.api;

import cn.kern.elementexcel.api.constants.DocumentType;
import cn.kern.elementexcel.api.io.ElementExcelReader;
import cn.kern.elementexcel.api.io.ElementExcelWriter;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/**
 * <p>
 *     entrance. Simple Method Factory!
 * </p>
 *
 * @author Kern
 */
public class ElementExcel {

    public static <T> ElementExcelWriter<T> callWriter(Class<T> templateClass) {
        return callWriter(templateClass, DocumentType.XLSX);
    }

    public static <T> ElementExcelWriter<T> callWriter(Class<T> templateClass, DocumentType documentType) {
        return callWriter(templateClass, WorkbookBuilder.build(documentType));
    }

    public static <T> ElementExcelWriter<T> callWriter(Class<T> templateClass, Workbook workbook) {
        return null;
    }

    public static <T> ElementExcelReader<T> callReader(Class<T> templateClass, InputStream inputStream) throws IOException {
        return callReader(templateClass, WorkbookBuilder.build(inputStream));
    }

    public static <T> ElementExcelReader<T> callReader(Class<T> templateClass, File file) throws IOException {
        return callReader(templateClass, WorkbookBuilder.build(file));
    }

    public static <T> ElementExcelReader<T> callReader(Class<T> templateClass, Workbook workbook) {
        return null;
    }

}
