package cn.kerninventor.excel.core.user.interfaces;

/**
 * <p>
 *     单元格值比较器
 * </p>
 *
 * @author Kern
 */
public interface CellValueComparator<T> {

    /**
     * 比较，比较的场景适用于合并列的比较，通过比较结果判断数据列的行之间是否采取合并
     * @param o1
     * @param o2
     * @return 比较结果
     */
    boolean compare(T o1, T o2);
}
