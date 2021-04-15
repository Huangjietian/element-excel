package cn.kerninventor.excel.core.io.component;

import cn.kerninventor.excel.core.user.elements.Tabulation;

import java.util.List;

/**
 * <p>一句话描述</p>
 *
 * @author Kern
 */
public class TabulationDefinition {

    private float theadRowHeight;
    private float tbodyRowHeight;
    private int startRowIndex;
    private int startColumnIndex;
    private int effectiveRows;
    private int minimumColumnsWidth;
    private int maximumColumnsWidth;
    private int rowFreezePoint;
    private int columnFreezePoint;

    /**
     * 行指针
     */
    private int rowPoint;
    /**
     * 列指针
     */
    private int colPoint;

    private List<ColumnDefinition> columnDefinitions;

    /**
     * 根据写任务按照起始指针排序，先行后列
     */
}
