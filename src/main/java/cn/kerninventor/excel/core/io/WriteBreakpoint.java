package cn.kerninventor.excel.core.io;


import cn.kerninventor.excel.core.constants.DocumentType;

/**
 * <p>
 *     写时中断
 * </p>
 *
 * @author Kern
 */
public interface WriteBreakpoint {

    <T> ElementExcelWriter<T> resume(Class<T> tClass, DocumentType documentType);

    default <T> ElementExcelWriter<T> resume(Class<T> tClass) {
        return resume(tClass, DocumentType.XLSX);
    }
}
