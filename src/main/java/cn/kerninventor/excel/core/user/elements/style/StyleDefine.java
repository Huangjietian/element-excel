package cn.kerninventor.excel.core.user.elements.style;

import org.apache.commons.math3.stat.inference.BinomialTest;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Workbook;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;


/**
 * <p>
 *
 * </p>
 *
 * @author Kern
 */
public interface StyleDefine {

    /**
     * 风格自定义
     * @param workbook
     * @return
     */
    default HashMap<Double, CellStyle> customDefine(Workbook workbook) {
        return new HashMap<>(0);
    }

    /**
     * 构造风格容器的流程模板方法
     * @param workbook
     * @return
     */
    default Function<StyleDefine, HashMap<Double, CellStyle>> process(final Workbook workbook) {
        return styleDefine -> {
            HashMap<Double, CellStyle> styleHashMap = new HashMap<>(16);
            styleHashMap.put(DefaultStyleIndex.headline, headlineStyle(workbook));
            styleHashMap.put(DefaultStyleIndex.defaultRange, defaultRangeStyle(workbook));
            styleHashMap.put(DefaultStyleIndex.defaultColumnHead, defaultColumnHeadStyle(workbook));
            styleHashMap.put(DefaultStyleIndex.defaultColumnBody, defaultColumnBodyStyle(workbook));
            styleHashMap.putAll(customDefine(workbook));
            return styleHashMap;
        };
    }

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
