package cn.kerninventor.excel.core.io.component;

import cn.kerninventor.excel.core.user.elements.Column;
import cn.kerninventor.excel.core.user.elements.functionality.MergeColumn;
import cn.kerninventor.excel.core.user.interfaces.CellValueReader;
import cn.kerninventor.excel.core.user.interfaces.CellValueTranslator;
import cn.kerninventor.excel.core.user.interfaces.CellValueWriter;
import cn.kerninventor.excel.core.utils.Assert;
import cn.kerninventor.excel.core.utils.ReflectUtil;

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
    private CellValueTranslator cellValueTranslator;

    ColumnDefinition(Field field) {
        this.column = Assert.notNull(field.getDeclaredAnnotation(Column.class), "错误的列");
        this.field = field;
        this.cellValueWriter = ReflectUtil.newInstance(column.cellWriter());
        this.cellValueReader = ReflectUtil.newInstance(column.cellReader());
    }


}
