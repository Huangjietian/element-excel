package cn.kerninventor.excel.core.user.interfaces;

import org.apache.poi.ss.usermodel.Cell;

/**
 * <p>
 *      列的约束条件生成类
 * </p>
 *
 * @author Kern
 */
public interface ColumnRestrictionFiller<Annotation> {

    void fill(Cell cell, Annotation annotation);

}
