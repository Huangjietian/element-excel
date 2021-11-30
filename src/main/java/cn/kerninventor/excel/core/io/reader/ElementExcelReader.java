package cn.kerninventor.excel.core.io.reader;


import cn.kerninventor.excel.core.io.writer.ElementExcelWriter;

/**
 * <p>一句话描述</p>
 *
 * @author Kern
 */
public interface ElementExcelReader<T> {

    ElementExcelWriter<T> swerve();

//    Reader<T> read(ReadingSupervisor supervisor, ReadResult<T> readResult);
//
//    Reader<T> read(int sheetAt, ReadingSupervisor supervisor, ReadResult<T> readResult);
//
//    Reader<T> read(String sheetName, ReadingSupervisor supervisor, ReadResult<T> readResult);

    ReadBreakpoint breakOff();
}
