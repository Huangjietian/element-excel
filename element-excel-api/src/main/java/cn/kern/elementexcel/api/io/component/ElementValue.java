package cn.kern.elementexcel.api.io.component;

/**
 * @author kern
 */
@FunctionalInterface
public interface ElementValue {

    String getValue();

    static ElementValue of(String value, Context context) {
        if (value == null) {
            return () -> "";
        }
        else if (value.startsWith("#{") && value.endsWith("}")) {
            return () -> context.getProperty(value.replace("#{", "").replace("}", ""));
        } else {
            return () -> value;
        }
    }
}
