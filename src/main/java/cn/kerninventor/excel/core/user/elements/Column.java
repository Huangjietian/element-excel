package cn.kerninventor.excel.core.user.elements;


import cn.kerninventor.excel.core.constants.StyleScope;
import cn.kerninventor.excel.core.user.impl.DefaultCellValueWriter;
import cn.kerninventor.excel.core.user.interfaces.CellValueWriter;

import java.lang.annotation.*;

/**
 * <p>
 *     列定义
 * </p>
 *
 * @author Kern
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
public @interface Column {

    /**
     * 定义表头名称
     * @return
     */
    String[] value();

    /**
     * 定义列宽,
     * 如果定义的数大于0,将覆盖 {@link Tabulation#minimumColumnsWidth()} 以及 {@link Tabulation#maximumColumnsWidth()}的值.
     * @return
     */
    int width() default -1;

    /**
     * 定义列的单元格格式，详情参考Excel的单元格格式自定义部分
     * 例如{@code @Column(cellFormat = "@")} 表示设置单元格格式为文本格式
     * @return
     */
    String cellFormat() default "";

    /**
     * 定义列的单元格函数
     * @return
     */
    String formula() default "";

    /**
     * 定义列的单元格写入器 默认提供的几种单元格写入器请参考 {@link CellValueWriter}
     * @return
     */
    Class<? extends CellValueWriter> cellWriter() default DefaultCellValueWriter.class;

    /**
     * 风格订阅
     * 通常情况下，该数组的最后一个整数指向风格元素中作用域为{@link StyleScope#TBODY}的风格下标
     * 前面的多个整数应同{@link #value()}的数量保持一致，并代表 Value() 代表的每一个表头的风格
     * 例如
     * {@code  @Column(value = "表头1, 表头2", styleSub = "0, 0, 0")}
     * 则 该列的表头行第一行将适配到作用域 {@link StyleScope#THEAD}的第0个元素
     * @return
     */
    int[] styleSub() default {0,0};

}
