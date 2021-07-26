package cn.kerninventor.excel.core.waring;

/**
 * <p>
 *     预期外的Excel解析异常
 * </p>
 *
 * @author Kern
 */
public class UnexpectedExcelParseException extends RuntimeException {

    public UnexpectedExcelParseException() {
    }

    public UnexpectedExcelParseException(String message) {
        super(message);
    }

    public UnexpectedExcelParseException(String message, Throwable cause) {
        super(message, cause);
    }

    public UnexpectedExcelParseException(Throwable cause) {
        super(cause);
    }

    public UnexpectedExcelParseException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
