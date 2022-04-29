package cn.kerninventor.excel.core.utils;

/**
 * <p>
 *
 * </p>
 *
 * @author kern
 */
public class StringTools {

    public static boolean endWithIgnoreCase(String str, String suffix) {
        return str != null &&
                suffix != null &&
                str.length() >= suffix.length() &&
                str.substring(str.length() - suffix.length()).equalsIgnoreCase(suffix);
    }

    public static boolean startWithIgnoreCase(String str, String prefix) {
        return str != null &&
                prefix != null &&
                str.length() >= prefix.length() &&
                str.substring(0, prefix.length()).equalsIgnoreCase(prefix);
    }
}
