package cn.kerninventor.excel.core.user.elements;

import lombok.EqualsAndHashCode;

import java.lang.annotation.*;

/**
 * <p>
 *     元素类
 * </p>
 *
 * @author Kern
 */
@Documented
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.ANNOTATION_TYPE)
public @interface Element {

    /**
     * @return element parse sorted
     */
    int value();


}
