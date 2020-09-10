package cn.kerninventor.doexcel.reader;


import cn.kerninventor.doexcel.DocumentSource;

/**
 * <p>一句话描述</p>
 *
 * @author Kern
 */
public interface ReadBreakpoint {

    <T> Reader<T> resume(Class<T> tClass, DocumentSource documentSource);
}
