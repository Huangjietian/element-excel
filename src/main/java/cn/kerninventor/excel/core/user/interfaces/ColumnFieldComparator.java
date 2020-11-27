package cn.kerninventor.excel.core.user.interfaces;

/**
 * <p>
 *     列字段比较器
 * </p>
 *
 * @author Kern
 */
public interface ColumnFieldComparator<T> {

    boolean equals(T t1, T t2);
}
