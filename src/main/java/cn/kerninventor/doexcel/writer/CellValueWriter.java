package cn.kerninventor.doexcel.writer;


import org.apache.poi.ss.usermodel.Cell;

/**
 * <p>一句话描述</p>
 *
 * @author Kern
 */
public interface CellValueWriter {

    void setCellValue(Cell cell, Object value);

}
