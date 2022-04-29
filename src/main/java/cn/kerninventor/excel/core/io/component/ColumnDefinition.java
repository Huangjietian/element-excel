package cn.kerninventor.excel.core.io.component;

import cn.kerninventor.excel.core.user.elements.Column;
import cn.kerninventor.excel.core.user.elements.functionality.MergeColumn;
import cn.kerninventor.excel.core.user.interfaces.CellValueReader;
import cn.kerninventor.excel.core.user.interfaces.CellValueWriter;
import cn.kerninventor.excel.core.utils.Assert;
import cn.kerninventor.excel.core.utils.ReflectTools;

import java.lang.annotation.Annotation;
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
    private ThreadLocal<Boolean> ignore;
    private Column column;
    private MergeColumn mergeColumn;
    private Annotation[] restricts;
    private CellValueWriter cellValueWriter;
    private CellValueReader cellValueReader;

    ColumnDefinition(Field field) {
        this.column = Assert.notNull(field.getDeclaredAnnotation(Column.class), "错误的列");
        this.field = field;
        this.cellValueWriter = ReflectTools.newInstance(column.cellWriter());
        this.cellValueReader = ReflectTools.newInstance(column.cellReader());
    }


}
