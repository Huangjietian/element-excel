package cn.kerninventor.doexcel.writer;


import cn.kerninventor.doexcel.constants.DocumentType;

/**
 * <p>一句话描述</p>
 *
 * @author Kern
 */
public interface WriteBreakpoint {

    <T> Writer<T> resume(Class<T> tClass, DocumentType documentType);

    default <T> Writer<T> resume(Class<T> tClass) {
        return resume(tClass, DocumentType.XLSX);
    }
}
