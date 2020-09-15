package cn.kerninventor.doexcel.writer;

import org.apache.poi.ss.usermodel.CellStyle;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * <p>一句话描述</p>
 *
 * @author Kern
 */
public final class WritingSupervisor {

    private Map<CellStyle, String[]> columnStyleMatchList;
    private Map<Predicate, List<String>> predicateIgnoredColumnList = new LinkedHashMap<>();

    /**
     * 忽略列
     * @param columnNames
     * @return
     */
    public WritingSupervisor ignore(String... columnNames) {
        return ignore(null, columnNames);
    }

    /**
     * 忽略列
     * @param predicate
     * @param columnNames
     * @return
     */
    public WritingSupervisor ignore(Predicate predicate, String... columnNames) {
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
    public WritingSupervisor setColumnsStyle(CellStyle style, String columnNames) {
        return this;
    }


}
