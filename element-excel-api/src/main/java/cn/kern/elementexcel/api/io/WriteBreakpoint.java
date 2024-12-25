package cn.kern.elementexcel.api.io;


import cn.kern.elementexcel.api.constants.DocumentType;

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
