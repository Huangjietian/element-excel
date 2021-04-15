package cn.kerninventor.excel.core.io.component;

import cn.kerninventor.excel.core.user.interfaces.CellValueWriter;

import java.lang.reflect.Field;

/**
 * <p>
 *     列定义
 * </p>
 *
 * @author Kern
 */
public class ColumnDefinition {

    private Field field;
    private boolean ignore;
    private String headlineValue;
    private int columnWidth;
    private String cellFormat;
    private String formula;
    private CellValueWriter cellValueWriter;



}
