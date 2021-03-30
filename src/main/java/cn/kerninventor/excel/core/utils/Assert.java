package cn.kerninventor.excel.core.utils;

import java.util.function.Supplier;

/**
 * <p>
 *     断言
 * </p>
 *
 * @Since: 2021/3/30
 * @author: Kern
 */
public class Assert {

    public static <E> E notNull(E object, String message) {
        return notNull(object, new NullPointerException(message));
    }

    public static <E> E notNull(E notNull, Supplier<String> messageSupplier) {
        return notNull(notNull, messageSupplier != null ? messageSupplier.get() : null);
    }

    public static <E> E notNull(E object, RuntimeException exception) {
        if (object == null) {
            throw exception;
        }
        return object;
    }

    public static void isTrue(boolean expression, String message) {
        isTrue(expression, new IllegalArgumentException(message));
    }

    public static void isTrue(boolean expression, Supplier<String> messageSupplier) {
        isTrue(expression, messageSupplier != null ? messageSupplier.get() : null);
    }

    public static void isTrue(boolean expression, RuntimeException exception) {
        if (!expression) {
            throw exception;
        }
    }

}
