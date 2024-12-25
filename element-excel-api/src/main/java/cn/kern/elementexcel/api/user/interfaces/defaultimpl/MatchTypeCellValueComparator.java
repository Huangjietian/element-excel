package cn.kern.elementexcel.api.user.interfaces.defaultimpl;

import cn.kern.elementexcel.api.user.interfaces.CellValueComparator;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * <p>
 *     匹配类型的单元格值比较器
 * </p>
 *
 * @author kern
 */
public class MatchTypeCellValueComparator implements CellValueComparator<Object> {

    private static Map<Class, CellValueComparator> comparatorMap = new ConcurrentHashMap<>();

    public static <T> void attach(Class<T> type, CellValueComparator<T> comparator) {
        comparatorMap.put(type, comparator);
    }

    private CellValueComparator matchComparator(Object o, Object o2) {
        return null;
    }

    @Override
    public boolean compare(Object o1, Object o2) {
        CellValueComparator cellValueComparator = matchComparator(o1, o2);
        if (cellValueComparator != null) {
            return cellValueComparator.compare(o1, o2);
        }
        return false;
    }
}
