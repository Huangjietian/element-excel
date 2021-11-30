package cn.kerninventor.excel.core.waring;

/**
 * 错误的Excel配置异常，一般指某项配置的属性配置错误
 * @author kern
 */
public class IllegalExcelConfigException extends RuntimeException {

    public IllegalExcelConfigException() {
    }

    public IllegalExcelConfigException(String message) {
        super(message);
    }

    public IllegalExcelConfigException(String message, Throwable cause) {
        super(message, cause);
    }

    public IllegalExcelConfigException(Throwable cause) {
        super(cause);
    }

    public IllegalExcelConfigException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
