package cn.kerninventor.doexcel.definition;

import java.lang.annotation.Annotation;

/**
 * <p>一句话描述</p>
 *
 * @author Kern
 */
public interface ElementParser<T extends Annotation, D> {

    D parsedIntoOne(T t);

}
