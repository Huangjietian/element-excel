package cn.kerninventor.excel.core.io.component;

import cn.kerninventor.excel.core.user.elements.Column;
import cn.kerninventor.excel.core.user.elements.Element;
import cn.kerninventor.excel.core.user.elements.Tabulation;
import cn.kerninventor.excel.core.utils.Assert;
import cn.kerninventor.excel.core.utils.ReflectUtil;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;

/**
 * <p>
 *     模板类解析类
 * </p>
 *
 * @author Kern
 */
public class ExcelTemplateClassParser {

    public <T> TabulationContext<T> parse(Class<T> templateClass) {
        //1. 获取主配置类
        Assert.notNull(templateClass, "配置类Class对象不能为空");
        Tabulation tabulation = ReflectUtil.getRequiredAnnotation(templateClass, Tabulation.class, "错误的配置类, 配置类必须添加如下注解： " + Tabulation.class.getName());
        //2. 获取其他配置元素
        ConcurrentMap<Element, List<Annotation>> elementContainer = getElements(templateClass);
        //3. 获取字段配置
        List<ColumnDefinition> columnDefinitions = getColumnDefinitions(templateClass);
        
        return new TabulationContext<>();
    }

    private ConcurrentMap<Element, List<Annotation>> getElements(Class<?> templateClass) {
        return Arrays.stream(templateClass.getDeclaredAnnotations())
                .filter(e -> e.getClass().getDeclaredAnnotation(Element.class) != null)
                .sorted(new ElementComparator())
                .collect(Collectors.groupingByConcurrent(e -> e.getClass().getDeclaredAnnotation(Element.class)));
    }

    private List<ColumnDefinition> getColumnDefinitions(Class<?> templateClass) {
        return Arrays.stream(templateClass.getDeclaredFields())
                .filter(e -> e.getDeclaredAnnotation(Column.class) != null)
                .map(ColumnDefinition::new)
                .collect(Collectors.toList());
    }


    static final class ElementComparator implements Comparator<Annotation> {
        @Override
        public int compare(Annotation o1, Annotation o2) {
            Element element1 = Assert.notNull(o1.getClass().getDeclaredAnnotation(Element.class), "内部错误, 未找到Element标签 {@link Element}");
            Element element2 = Assert.notNull(o2.getClass().getDeclaredAnnotation(Element.class), "内部错误, 未找到Element标签 {@link Element}");
            return Integer.compare(element1.value(), element2.value());
        }
    }
}
