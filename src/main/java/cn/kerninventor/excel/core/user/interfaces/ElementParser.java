package cn.kerninventor.excel.core.user.interfaces;

import cn.kerninventor.excel.core.io.component.TabulationContext;
import cn.kerninventor.excel.core.user.elements.Element;

import java.lang.annotation.Annotation;

/**
 * <p>
 *
 * </p>
 *
 * @author Kern
 */
@FunctionalInterface
public interface ElementParser <E extends Annotation> {

    void parse(E e, TabulationContext<?> tabulationContext, Element element);
}
