package cn.kerninventor.excel.core.constants;

import org.apache.poi.ss.usermodel.DataValidationConstraint;

/**
 * @author Kern
 * @version 1.0
 */
public enum ComparisonType {

    BET(" <> ",    DataValidationConstraint.OperatorType.BETWEEN,          true),
    NOT_BET(" >< ",DataValidationConstraint.OperatorType.NOT_BETWEEN,      true),
    ET(" == ",     DataValidationConstraint.OperatorType.EQUAL,            false),
    NO_ET(" != ",  DataValidationConstraint.OperatorType.NOT_BETWEEN,      false),
    GT(" > ",      DataValidationConstraint.OperatorType.GREATER_THAN,     false),
    LT(" < ",      DataValidationConstraint.OperatorType.LESS_THAN,        false),
    GTE(" >= ",    DataValidationConstraint.OperatorType.GREATER_OR_EQUAL, false),
    LTE(" <= ",    DataValidationConstraint.OperatorType.LESS_OR_EQUAL,    false),
    ;

    private String expression;
    private int code;
    private boolean isNeedValue2;

    ComparisonType(String expression, int code, boolean isNeedValue2) {
        this.expression = expression;
        this.code = code;
        this.isNeedValue2 = isNeedValue2;
    }

    public boolean needValue2() {
        return isNeedValue2;
    }

    public int getCode() {
        return code;
    }

    public String getExpression() {
        return expression;
    }

}
