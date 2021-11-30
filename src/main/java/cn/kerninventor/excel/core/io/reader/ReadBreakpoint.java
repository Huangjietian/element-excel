package cn.kerninventor.excel.core.io.reader;


import org.apache.poi.ss.usermodel.Workbook;

/**
 * <p>写时中断</p>
 *
 * @author Kern
 */
public interface ReadBreakpoint {

    <T> ElementExcelReader<T> resume(Class<T> tClass, Workbook workbook);
}
