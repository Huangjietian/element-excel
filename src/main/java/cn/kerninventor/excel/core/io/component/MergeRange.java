package cn.kerninventor.excel.core.io.component;

import org.apache.poi.ss.usermodel.CellStyle;

/**
 * <p>
 *     合并区域
 * </p>
 *
 * @author Kern
 */
public class MergeRange {

    private String content;
    private CellStyle cellStyle;
    private int firstColIndex;
    private int lastColIndex;
    private int firstRowIndex;
    private int lastRowIndex;
}
