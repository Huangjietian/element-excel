package cn.kerninventor.excel.core.user.elements.style;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Workbook;

/**
 * <p>
 *
 * </p>
 *
 * @author Kern
 */
public interface StyleWrapper {

    /**
     * 默认的标题风格
     * @param workbook
     * @return
     */
    default CellStyle defaultHeadlineStyle(Workbook workbook) {
        return workbook.createCellStyle();
    }

    /**
     * 默认的区域风格
     * @param workbook
     * @return
     */
    default CellStyle defaultRangeStyle(Workbook workbook) {
        return workbook.createCellStyle();
    }

    /**
     * 默认的表头风格
     * @param workbook
     * @return
     */
    default CellStyle defaultColumnHeadStyle(Workbook workbook) {
        return workbook.createCellStyle();
    }

    /**
     * 默认的表体风格
     * @param workbook
     * @return
     */
    default CellStyle defaultColumnBodyStyle(Workbook workbook) {
        return workbook.createCellStyle();
    }

}
