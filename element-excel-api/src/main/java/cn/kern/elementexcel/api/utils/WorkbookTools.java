package cn.kern.elementexcel.api.utils;

import org.apache.poi.ss.usermodel.*;

import java.nio.charset.Charset;

/**
 * <p>
 *     针对于工作表对象的工具。
 *     提供了一些基于poi {@link Workbook}的通用方法
 * </p>
 *
 * @Since: 2021/3/30
 * @author: Kern
 */
public class WorkbookTools {

    /**
     * 中文版Excel默认的编码格式为GBK
     */
    protected static final Charset DEFAULT_CHARSET = Charset.forName("GBK");

    /**
     * 根据sheetName获取一个Sheet对象，如果没有就创建一个
     * @param workbook
     * @param sheetName
     * @return
     */
    public static Sheet getSheetForce(Workbook workbook, String sheetName) {
        return workbook.getSheet(sheetName) == null ? workbook.createSheet(sheetName) : workbook.getSheet(sheetName);
    }

    /**
     * 根据sheetAt获取一个Sheet对象，如果没有就创建一个
     * @param workbook
     * @param sheetAt
     * @return
     */
    public static Sheet getSheetForce(Workbook workbook, int sheetAt) {
        return workbook.getSheetAt(sheetAt) == null ? workbook.createSheet() : workbook.getSheetAt(sheetAt);
    }

    /**
     * 根据Row Index获取一个Row对象，如果没有就创建一个
     * @param sheet
     * @param rowIdx
     * @return
     */
    public static Row getRowForce(Sheet sheet, int rowIdx) {
        return sheet.getRow(rowIdx) == null ? sheet.createRow(rowIdx) : sheet.getRow(rowIdx);
    }

    /**
     * 根绝Cell Index 获取一个Cell对象，如果没有就创建一个
     * @param row
     * @param cellIdx
     * @return
     */
    public static Cell getCellForce(Row row, int cellIdx) {
        return row.getCell(cellIdx) == null ? row.createCell(cellIdx) : row.getCell(cellIdx);
    }

    /**
     * 根据对象的字节长度获取对应的单元格列宽
     * @param obj
     * @param fontHeightInPoints
     * @return
     */
    public static int getCellWidthByContent(Object obj, int fontHeightInPoints) {
        int cellWidthAdjustIncrement = 2;
        int size = obj.toString().getBytes(DEFAULT_CHARSET).length + cellWidthAdjustIncrement;
        return adjustCellWidth(size) * fontHeightInPoints / 12;
    }

    /**
     * 默认的列宽调整方法
     * @param width
     * @return (int) ((width + 0.82) * 256)
     */
    public static int adjustCellWidth(int width) {
        if (0 == width) {
            return 0;
        }
        return (int) ((width + 0.82) * 256);
    }

    /**
     * 获取风格中的Font字体对象
     * @param cellStyle
     * @param workbook
     * @return
     */
    public static Font getFontFrom(CellStyle cellStyle, Workbook workbook) {
        return workbook.getFontAt(cellStyle.getFontIndexAsInt());
    }

    /**
     * 获取列数字下标对应的英文下标
     * @param cellIndex
     * @return [a-zA-Z]
     */
    public static String transferExcelColumnIndex(int cellIndex){
        String cellStrIndex = "";
        int iHead = (cellIndex - 1) / 26;
        int iLeftOver = (cellIndex - 1) % 26;
        if (iHead >= 26) {
            cellStrIndex = transferExcelColumnIndex(iHead);
        } else if (iHead > 0) {
            cellStrIndex += (char)(64 + iHead);
        }
        cellStrIndex += (char)(65 + iLeftOver);
        return cellStrIndex;
    }
}
