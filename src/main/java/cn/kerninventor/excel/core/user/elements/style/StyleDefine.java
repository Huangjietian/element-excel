package cn.kerninventor.excel.core.user.elements.style;

import org.apache.commons.math3.stat.inference.BinomialTest;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Workbook;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;


/**
 * <p>
 *
 * </p>
 *
 * @author Kern
 */
@FunctionalInterface
public interface StyleDefine {

    HashMap<Integer, CellStyle> customDefine(Workbook workbook);


    /**
     * 默认的标题风格
     * @param workbook
     * @return
     */
    default CellStyle headlineStyle(Workbook workbook) {
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
