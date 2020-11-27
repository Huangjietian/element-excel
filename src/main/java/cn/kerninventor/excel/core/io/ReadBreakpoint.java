package cn.kerninventor.excel.core.io;


import cn.kerninventor.excel.core.DocumentSource;

/**
 * <p>一句话描述</p>
 *
 * @author Kern
 */
public interface ReadBreakpoint {

    <T> Reader<T> resume(Class<T> tClass, DocumentSource documentSource);
}
