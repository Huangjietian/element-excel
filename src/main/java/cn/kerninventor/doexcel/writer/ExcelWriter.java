package cn.kerninventor.doexcel.writer;

import cn.kerninventor.doexcel.Appender;
import cn.kerninventor.doexcel.reader.Reader;

/**
 * <p>一句话描述</p>
 *
 * @author Kern
 */
public class ExcelWriter<T> implements Writer<T> {


    @Override
    public Writer<T> overwrite(boolean overwrite) {
        return null;
    }

    @Override
    public Reader<T> convert() {
        return null;
    }

    @Override
    public WriteBreakpoint breakOff() {
        return null;
    }

    @Override
    public WriteBreakpoint output(Appender... appenderArr) {
        return null;
    }


    public ExcelWriter<T> write() {




        return this;
    }
}
