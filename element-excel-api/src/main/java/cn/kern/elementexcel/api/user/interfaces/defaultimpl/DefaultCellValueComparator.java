package cn.kern.elementexcel.api.user.interfaces.defaultimpl;

import cn.kern.elementexcel.api.user.interfaces.CellValueComparator;

/**
 * <p>
 *     默认的列字段比较器
 * </p>
 *
 * @author Kern
 */
public class DefaultCellValueComparator implements CellValueComparator<Object> {

    @Override
    public boolean compare(Object o1, Object o2) {
        if (o1 == null) {
            if (o2 == null) {
                return true;
            }
            return false;
        }
        return o1.equals(o2);
    }

}
