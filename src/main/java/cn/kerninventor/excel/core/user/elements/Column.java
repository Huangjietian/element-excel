package cn.kerninventor.excel.core.user.elements;


import cn.kerninventor.excel.core.user.interfaces.defaultimpl.DefaultCellValueReader;
import cn.kerninventor.excel.core.user.interfaces.defaultimpl.DefaultCellValueWriter;
import cn.kerninventor.excel.core.user.interfaces.CellValueReader;
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
     * 定义表头
     */
    String[] value();

    /**
     * 表头风格名称，符合发布订阅模式，如果匹配不到将使用默认风格
     */
    String headStyleName() default "ColumnHead";

    /**
     * 表体风格名称，符合发布订阅模式，如果匹配不到将使用默认风格
     */
    String bodyStyleName() default "ColumnBody";

    /**
     * 定义列宽,
     * 如果定义的数大于0,将覆盖 {@link Tabulation#minimumColumnsWidth()} 以及 {@link Tabulation#maximumColumnsWidth()}的值.
     */
    int width() default 0;

    /**
     * 定义列的单元格格式，详情参考Excel的单元格格式自定义部分
     * 例如{@code @Column(cellFormat = "@")} 表示设置单元格格式为文本格式
     */
    String cellFormat() default "";

    /**
     * 定义列的单元格函数
     */
    String formula() default "";

    /**
     * 定义列的单元格写入器 默认提供的几种单元格写入器请参考 {@link CellValueWriter}
     */
    Class<? extends CellValueWriter> cellWriter() default DefaultCellValueWriter.class;

    /**
     * 定义列的单元格读取器 默认提供的几种单元格读取器请参考 {@link CellValueReader}
     */
    Class<? extends CellValueReader> cellReader() default DefaultCellValueReader.class;

}
