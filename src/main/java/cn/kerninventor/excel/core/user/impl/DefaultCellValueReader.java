package cn.kerninventor.excel.core.user.impl;

import cn.kerninventor.excel.core.user.interfaces.CellValueReader;
import org.apache.poi.ss.usermodel.Cell;

/**
 * <p>
 *     默认的单元格值读取器
 * </p>
 *
 * @author Kern
 */
public class DefaultCellValueReader implements CellValueReader {

    @Override
    public <T> T doRead(Cell cell, Class<T> generics) {
        return null;
    }

}
