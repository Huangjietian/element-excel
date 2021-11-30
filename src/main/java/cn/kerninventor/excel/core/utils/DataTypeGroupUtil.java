package cn.kerninventor.excel.core.utils;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author Kern
 * @version 1.0
 */
public class DataTypeGroupUtil {

    public static boolean isMemberOfNumberType(Class<?> clz) {
        return Number.class.isAssignableFrom(clz);
    }

    public static boolean isMemberOfIntType(Class<?> clz) {
        if (isMemberOfNumberType(clz)) {
            return clz == Byte.class || clz == Short.class ||
                    clz == Integer.class || clz == Long.class ||
                    clz == byte.class || clz == short.class ||
                    clz == int.class || clz == long.class
            ;
        }
        return false;
    }

    public static boolean isMemberOfDecimal(Class<?> clz) {
        if (isMemberOfNumberType(clz)) {
            return clz == Float.class || clz == Double.class || clz == BigDecimal.class ||
                    clz == float.class || clz == double.class
            ;
        }
        return false;
    }

    public static boolean isMemberOfCharacter(Class<?> clz) {
        return (clz == String.class || clz == Character.class || clz == char.class);
    }

    public static boolean isMemberOfDateType(Class<?> clz) {
        return Date.class.isAssignableFrom(clz);
    }

}
