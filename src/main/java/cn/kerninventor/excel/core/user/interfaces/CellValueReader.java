package cn.kerninventor.excel.core.user.interfaces;


import org.apache.poi.ss.usermodel.Cell;

/**
 * <p>一句话描述</p>
 *
 * @author Kern
 */
public interface CellValueReader {

    <T> T doRead(Cell cell, Class<T> generics);

}
