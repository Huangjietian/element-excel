package cn.kerninventor.excel.core.io;


import cn.kerninventor.excel.core.constants.DocumentType;

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
