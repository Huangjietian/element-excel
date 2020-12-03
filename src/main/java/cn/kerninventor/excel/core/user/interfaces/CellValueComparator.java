package cn.kerninventor.excel.core.user.interfaces;

/**
 * <p>
 *     列字段比较器
 * </p>
 *
 * @author Kern
 */
public interface CellValueComparator<T> {

    boolean compare(T o1, T o2);
}
