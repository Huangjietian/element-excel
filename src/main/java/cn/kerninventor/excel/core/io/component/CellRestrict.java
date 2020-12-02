package cn.kerninventor.excel.core.io.component;

import org.apache.poi.ss.usermodel.DataValidationConstraint;

/**
 * <p>
 *     单元格约束
 * </p>
 *
 * @author Kern
 */
public class CellRestrict {

    private DataValidationConstraint dvConstraint;
    private int firstColIndex;
    private int lastColIndex;
    private int firstRowIndex;
    private int lastRowIndex;
    private String promptMessage;
    private String errorMessage;

}
