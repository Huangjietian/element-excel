package cn.kerninventor.excel.core.io.component;

import cn.kerninventor.excel.core.user.elements.Tabulation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.Objects;

/**
 * <p>
 *     表格元素定义工厂
 * </p>
 *
 * @author Kern
 */
public class ComponentFactory<T> {


    private T t;

    public static <T> ComponentFactory<T> of(Class<T> tClass) {
        /**
         * 获取配置主注解
         */
        Tabulation tabulation = Objects.requireNonNull(
                Objects.requireNonNull(tClass,
                        "Invalid configuration bean, the configuration bean is null!").getDeclaredAnnotation(Tabulation.class),
                "Invalid configuration bean, The beans must be annotated with the " + Tabulation.class.getName()
        );

        /**
         * 获取列注解， 包括ExcelColumn 和 ExcelValidation
         */
        Field[] declaredFields = tClass.getDeclaredFields();




        /**
         * TODO 统一封装成 ParseTask，利用异步解析完成解析工作。
         * 解析：
         * 1. 表格风格(表头 + 表体)
         * 2. 表格全局内容
         * 3. 文本行以及大标题
         * 4. 文本框
         * 5. 图片
         * 6.
         *
         * TODO 执行读写时，分析哪些工作是可以通过异步任务完成的，
         * 写入：  写入需要同时填充模板，因此需要完成的工作更多一些
         * 0. 定位分析，划分区域以供各个阶段工作的同时进行
         * 1. 写表头
         * 2. 写文本行
         * 3. 写文本框   asynchronous
         * 4. 写图片     asynchronous
         * 5. 写表头
         * 6. 写表体
         *
         * 读取：  读取仅需要读取对应
         * 0. 定位到表格主体位置
         * 1. 循环查询列名，根据列名读取excel内容
         * 2. 格式转换后赋值到对应Bean实体中
         *
         */

        return new ComponentFactory<T>();
    }

    /**
     * 是否是默认的注解, TODO 性能问题
     */
    public boolean isDefaultAnnotation(Annotation annotation) throws NoSuchFieldException, IllegalAccessException {
//        Map<String, Object> defaultMemberValues = AnnotationType.getInstance(annotation.annotationType()).memberDefaults();
//        Object handler = Proxy.getInvocationHandler(annotation);
//        Field field = handler.getClass().getDeclaredField("memberValues");
//        Map<String, Object> memberValues = (Map<String, Object>) field.get(handler);
//        return defaultMemberValues.equals(memberValues);
        return false;
    }

}
