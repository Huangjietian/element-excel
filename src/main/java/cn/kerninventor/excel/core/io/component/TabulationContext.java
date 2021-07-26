package cn.kerninventor.excel.core.io.component;

import cn.kerninventor.excel.core.user.elements.Tabulation;
import cn.kerninventor.excel.core.user.elements.style.Style;
import cn.kerninventor.excel.core.user.elements.suspension.Picture;
import cn.kerninventor.excel.core.user.elements.suspension.TextBox;
import cn.kerninventor.excel.core.utils.Assert;
import cn.kerninventor.excel.core.utils.ReflectUtil;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Predicate;

/**
 * <p>
 *     表格元素定义工厂
 * </p>
 *
 * @author Kern
 */
public class TabulationContext<T> {

    private Class<T> templateClass;
    private Tabulation tabulation;
    private Workbook workbook;
    private Sheet current_sheet;
    private ConcurrentHashMap<Predicate, TabulationContext<?>> attachedContext;
    private ConcurrentHashMap<String, String> env;
    private HashMap<Double, CellStyle> styleContainer;
    private List<ColumnDefinition> columnDefinitionList;
    private List<? extends Annotation> configAnnotationList;






}
