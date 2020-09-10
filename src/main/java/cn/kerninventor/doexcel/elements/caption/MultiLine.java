package cn.kerninventor.doexcel.elements.caption;


import cn.kerninventor.doexcel.elements.style.Style;

/**
 * <p>一句话描述</p>
 *
 * @author Kern
 */
public @interface MultiLine {

    Line[] value();

    /**
     * 风格订阅
     * @return
     */
    Style globalStyle() default @Style;

}
