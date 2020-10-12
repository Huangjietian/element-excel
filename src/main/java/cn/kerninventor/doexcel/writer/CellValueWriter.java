package cn.kerninventor.doexcel.writer;


import org.apache.poi.ss.usermodel.Cell;

import java.lang.reflect.Field;

/**
 * <p>
 *     单元格值写入器
 * </p>
 *
 * @author Kern
 */
public interface CellValueWriter {

    /**
     * 是否是支持的泛型
     * @param field
     */
    void isSupportedType(Field field);

    /**
     * 设置单元格值
     * @param cell
     * @param value
     */
    void setCellValue(Cell cell, Object value);

}
