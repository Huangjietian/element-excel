package cn.kern.elementexcel.api.io;


/**
 * <p>一句话描述</p>
 *
 * @author Kern
 */
public interface ElementExcelReader<T> {

    ElementExcelWriter<T> convert();

//    Reader<T> read(ReadingSupervisor supervisor, ReadResult<T> readResult);
//
//    Reader<T> read(int sheetAt, ReadingSupervisor supervisor, ReadResult<T> readResult);
//
//    Reader<T> read(String sheetName, ReadingSupervisor supervisor, ReadResult<T> readResult);

    ReadBreakpoint breakOff();
}
