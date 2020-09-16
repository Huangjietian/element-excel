package cn.kerninventor.doexcel;

import cn.kerninventor.doexcel.constants.DocumentType;
import cn.kerninventor.doexcel.definition.TableDefinitionFactory;
import cn.kerninventor.doexcel.reader.Reader;
import cn.kerninventor.doexcel.writer.Writer;
import org.apache.poi.ss.usermodel.Workbook;

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
        Workbook workbook = documentType.createWorkbook();
        TableDefinitionFactory parser = TableDefinitionFactory.of(tClass);
        return null;
    }

    public static <T> Reader<T> callReader(Class<T> tClass, DocumentSource source) {
        Workbook workbook = source.getWorkbook();
        TableDefinitionFactory parser = TableDefinitionFactory.of(tClass);
        return null;
    }

}
