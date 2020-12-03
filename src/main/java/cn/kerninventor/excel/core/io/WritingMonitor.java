package cn.kerninventor.excel.core.io;

import org.apache.poi.ss.usermodel.CellStyle;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * <p>一句话描述</p>
 *
 * @author Kern
 */
public final class WritingMonitor {

    private Map<CellStyle, String[]> columnStyleMatchList;
    private Map<Predicate, List<String>> predicateIgnoredColumnList = new LinkedHashMap<>();

    /**
     * 忽略列
     * @param columnNames
     * @return
     */
    public WritingMonitor ignore(String... columnNames) {
        return ignore(null, columnNames);
    }

    /**
     * 忽略列
     * @param predicate
     * @param columnNames
     * @return
     */
    public WritingMonitor ignore(Predicate predicate, String... columnNames) {
        predicate = predicate == null ? e -> false : predicate;
        predicateIgnoredColumnList.put(predicate, Arrays.stream(columnNames).filter(e -> e != null && !"".equals(e.trim())).collect(Collectors.toList()));
        return this;
    }

    /**
     * 设置列风格
     * @param style
     * @param columnNames
     * @return
     */
    public WritingMonitor setColumnsStyle(CellStyle style, String columnNames) {
        return this;
    }


}
