package cn.kerninventor.excel.core.io;


import cn.kerninventor.excel.core.io.component.Output;

/**
 * <p>
 *
 * </p>
 *
 * @author Kern
 */
public interface ElementExcelWriter<T> {

    /**
     * 是否在写入时覆盖已有的sheet页
     * true -> 删除重名的sheet页，重新创建
     * false -> throw new Exception();
     * @param overwrite
     * @return
     */
    ElementExcelWriter<T> overwrite(boolean overwrite);

    ElementExcelReader<T> convert();

    WriteBreakpoint breakOff();

//    Writer<T> write(WritingSupervisor supervisor);
//
//    Writer<T> write(List<T> tList, WritingSupervisor supervisor);
//
//    Writer<T> write(String sheetName, WritingSupervisor supervisor);
//
//    Writer<T> write(String sheetName, List<T> tList, WritingSupervisor supervisor);

    WriteBreakpoint output(Output... outputArr);



}
