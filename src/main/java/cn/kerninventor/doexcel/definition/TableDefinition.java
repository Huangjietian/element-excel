package cn.kerninventor.doexcel.definition;

import cn.kerninventor.doexcel.elements.ExcelTabulation;

import java.util.List;

/**
 * <p>一句话描述</p>
 *
 * @author Kern
 */
public class TableDefinition {

    private ExcelTabulation excelTabulation;
    private int rowPoint; //行指针
    private int colPoint; //列指针
    private List<ColumnDefinition> columnDefinitions;


    /**
     * 根据写任务按照起始指针排序，先行后列
     */
}
