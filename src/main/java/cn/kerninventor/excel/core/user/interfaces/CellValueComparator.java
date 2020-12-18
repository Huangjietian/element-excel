package cn.kerninventor.excel.core.user.interfaces;

/**
 * <p>
 *     单元格值比较器
 * </p>
 *
 * @author Kern
 */
public interface CellValueComparator<T> {

    boolean compare(T o1, T o2);
}
