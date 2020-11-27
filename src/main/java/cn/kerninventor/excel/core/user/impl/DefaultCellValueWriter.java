package cn.kerninventor.excel.core.user.impl;

import cn.kerninventor.excel.core.user.interfaces.CellValueWriter;
import org.apache.poi.ss.usermodel.Cell;

import java.lang.reflect.Field;

/**
 * <p>
 *     默认的列值写入器
 * </p>
 *
 * @author Kern
 */
public class DefaultCellValueWriter implements CellValueWriter {

    @Override
    public void isSupportedType(Field field) {

    }

    @Override
    public void setCellValue(Cell cell, Object value) {

    }
}
