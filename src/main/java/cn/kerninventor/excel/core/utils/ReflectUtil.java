package cn.kerninventor.excel.core.utils;

import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * <p>
 *     反射工具类
 * </p>
 * @author Kern
 * @version 1.0
 */
public class ReflectUtil {

    /**
     * 获取指定字段名的标准Get方法名称
     * @param fieldName
     * @return
     */
    public static String specifiedGetMethodName(String fieldName) {
        if (fieldName == null || "".equals(fieldName.trim())){
            throw new NullPointerException("Field name can't be empty!");
        }
        return "get" + fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1);
    }

    /**
     * 获取指定字段名的标准Set方法名称
     * @param fieldName
     * @return
     */
    public static String specifiedSetMethodName(String fieldName) {
        if (fieldName == null || "".equals(fieldName.trim())){
            throw new NullPointerException("Field name can't be empty!");
        }
        return "set" + fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1);
    }

    /**
     * 获取类中指定字段的Get方法
     * @param clazz
     * @param fieldName
     * @return
     * @throws NoSuchMethodException
     */
    public static Method specifiedGetMethod(Class<?> clazz, String fieldName) throws NoSuchMethodException {
        Objects.requireNonNull(fieldName, "Field name can't be null!");
        Objects.requireNonNull(clazz, "clazz can't be null!");
        return clazz.getDeclaredMethod(specifiedGetMethodName(fieldName));
    }

    /**
     * 获取类中指定字段的Set方法
     * @param clazz
     * @param fieldName
     * @param argClass
     * @return
     * @throws NoSuchMethodException
     */
    public static Method specifiedSetMethod(Class<?> clazz, String fieldName, Class<?> argClass) throws NoSuchMethodException {
        Objects.requireNonNull(fieldName, "Field name can't be null!");
        Objects.requireNonNull(clazz, "clazz can't be null!");
        return clazz.getDeclaredMethod(specifiedSetMethodName(fieldName), argClass);
    }

    /**
     * 获取字段中的值
     * @param field
     * @param target
     * @return
     * @throws IllegalAccessException
     */
    public static Object getFieldValue(Field field, Object target) throws IllegalAccessException {
        if (!field.isAccessible()) {
            field.setAccessible(true);
        }
        return field.get(target);
    }

    /**
     * 设置字段中的值
     * @param field
     * @param target
     * @param value
     * @throws IllegalAccessException
     */
    public static void setFieldValue(Field field, Object target, Object value) throws IllegalAccessException {
        if (!field.isAccessible()) {
            field.setAccessible(true);
        }
        field.set(target, value);
    }

    /**
     * 类的实例化
     * @param clazz
     * @param parameters
     * @param <T>
     * @return
     * @throws NoSuchMethodException
     * @throws IllegalAccessException
     * @throws InvocationTargetException
     * @throws InstantiationException
     */
    public static <T extends Object> T newInstance(Class<T> clazz, Object... parameters) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?>[] paramTypes = new Class[parameters.length];
        for (int i = 0 ; i < parameters.length ; i ++) {
            paramTypes[i] = parameters[i].getClass();
        }
        return clazz.getDeclaredConstructor(paramTypes).newInstance(parameters);
    }

    /**
     * 判断是否基础数据类型的包装类
     * @param clazz
     * @return
     */
    public static boolean isBasicWrapperType(Class<?> clazz) {
        try {
            return ((Class<?>) clazz.getField("TYPE").get(null)).isPrimitive();
        } catch (Exception e) {
            return false;
        }
    }


    /**
     * 获取类中的泛型类型
     * @param clazz
     * @return
     */
    public static Type[] getGenericTypes(Class<?> clazz) {
        for (Type type : clazz.getGenericInterfaces()) {
            if (type instanceof ParameterizedType) {
                return ((ParameterizedType) type).getActualTypeArguments();
            }
        }
        return null;
    }
}
