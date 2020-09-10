package cn.kerninventor.doexcel;

import cn.kerninventor.doexcel.constants.DocumentType;
import org.apache.poi.ss.usermodel.CellStyle;

/**
 * <p>一句话描述</p>
 *
 * @author Kern
 */
public class MainTest {

    public static void main(String[] args) {
        ExcelKit.callWriter(MainTest.class, DocumentType.XLSX).overwrite(true).output(Appender.of(""))
        .resume(Object.class, DocumentType.XLS).convert().breakOff();

    }

    public void test(CellStyle cellStyle) {

    }
}
