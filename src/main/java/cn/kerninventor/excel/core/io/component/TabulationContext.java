package cn.kerninventor.excel.core.io.component;

import cn.kerninventor.excel.core.user.elements.Tabulation;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

/**
 * <p>
 *     表格元素定义工厂
 * </p>
 *
 * @author Kern
 */
public class TabulationContext<T> implements Context {

    private Class<T> templateClass;
    private Tabulation tabulation;
    private Workbook workbook;
    private Sheet currentSheet;
    private Map<Class<? extends Component>, Component> componentContainer;
    private Map<Predicate, TabulationContext<?>> attachedContext;
    private Map<String, String> env;
    private Map<Double, CellStyle> styleContainer;
    private List<ColumnDefinition> columnDefinitionList;

    @Override
    public String getProperty(String key) {
        return env.get(key) == null ? "" : env.get(key);
    }

    @Override
    public Context setProperty(String key, String value) {
        if (env == null) {
            env = new HashMap<>(16);
        }
        env.put(key, value);
        return this;
    }

}
