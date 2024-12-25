package cn.kern.elementexcel.api.user.elements.style;

import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.usermodel.Font;

/**
 * <p>
 *     风格生成器，基于POI提供的{@link CellStyle}接口提供流式编程范式
 * </p>
 * @author Kern
 */
public final class StyleBuilder {

    private final CellStyle cellStyle;

    public StyleBuilder(CellStyle cellStyle) {
        this.cellStyle = cellStyle;
    }

    public static CellStyle applyStyle(Workbook workbook, Style style) {
        return applyStyle(workbook, workbook.createCellStyle(), style);
    }

    public static CellStyle applyStyle(Workbook workbook, CellStyle cellStyle, Style style) {
        Font font = FontBuilder.applyFont(workbook, style.font());
        return newInstance(cellStyle)
                .setFont(font)
                .setAlignment(style.alignment())
                .setVerticalAlignment(style.verticalAlignment())
                .setSurroundBorder(style.borderStyle(), style.borderColor())
                .setHidden(style.hidden())
                .setLocked(style.locked())
                .setRotation(style.rotation())
                .setWrapText(style.wrapText())
                .setIndention(style.indention())
                .setDataFormat(style.dataFormat())
                .setShrinkToFit(style.shrinkToFit())
                .setQuotePrefixed(style.quotePrefixed())
                .setFillPattern(style.fillType())
                .setFillForegroundColor(style.foregroundFillColor())
                .setFillBackgroundColor(style.backgroundFillColor())
                .get();
    }

    public static StyleBuilder newInstance(Workbook workbook) {
        return new StyleBuilder(workbook.createCellStyle());
    }

    public static StyleBuilder newInstance(CellStyle cellStyle) {
        return new StyleBuilder(cellStyle);
    }

    /**
     * 获取风格
     * @return 风格
     */
    public CellStyle get() {
        return cellStyle;
    }

    /**
     * 设置字体
     * @param font 字体
     * @return builder
     */
    public StyleBuilder setFont(Font font) {
        cellStyle.setFont(font);
        return this;
    }

    /**
     * 设置上边框
     * @param borderStyle 边框风格
     * @param hssfColorPredefined 颜色
     * @return builder
     */
    public StyleBuilder setTopBorder(BorderStyle borderStyle, HSSFColor.HSSFColorPredefined hssfColorPredefined){
        if (borderStyle != null){
            cellStyle.setBorderTop(borderStyle);
        }
        if (hssfColorPredefined != null) {
            cellStyle.setTopBorderColor(hssfColorPredefined.getIndex());
        }
        return this;
    }

    /**
     * 设置下边框
     * @param borderStyle 边框风格
     * @param hssfColorPredefined 颜色
     * @return builder
     */
    public StyleBuilder setBottomBorder(BorderStyle borderStyle, HSSFColor.HSSFColorPredefined hssfColorPredefined){
        if (borderStyle != null){
            cellStyle.setBorderBottom(borderStyle);
        }
        if (hssfColorPredefined != null) {
            cellStyle.setBottomBorderColor(hssfColorPredefined.getIndex());
        }
        return this;
    }

    /**
     * 设置左边框
     * @param borderStyle 边框风格
     * @param hssfColorPredefined 颜色
     * @return builder
     */
    public StyleBuilder setLeftBorder(BorderStyle borderStyle, HSSFColor.HSSFColorPredefined hssfColorPredefined){
        if (borderStyle != null){
            cellStyle.setBorderLeft(borderStyle);
        }
        if (hssfColorPredefined != null) {
            cellStyle.setLeftBorderColor(hssfColorPredefined.getIndex());
        }
        return this;
    }

    /**
     * 设置右边框
     * @param borderStyle 边框风格
     * @param hssfColorPredefined 颜色
     * @return builder
     */
    public StyleBuilder setRightBorder(BorderStyle borderStyle, HSSFColor.HSSFColorPredefined hssfColorPredefined){
        if (borderStyle != null){
            cellStyle.setBorderRight(borderStyle);
        }
        if (hssfColorPredefined != null) {
            cellStyle.setRightBorderColor(hssfColorPredefined.getIndex());
        }
        return this;
    }

    /**
     * 设置四周边框
     * @param borderStyle 边框风格
     * @param hssfColorPredefined 颜色
     * @return builder
     */
    public StyleBuilder setSurroundBorder(BorderStyle borderStyle, HSSFColor.HSSFColorPredefined hssfColorPredefined) {
        if (borderStyle != null) {
            cellStyle.setBorderTop(borderStyle);
            cellStyle.setBorderBottom(borderStyle);
            cellStyle.setBorderLeft(borderStyle);
            cellStyle.setBorderRight(borderStyle);
        }
        if (hssfColorPredefined != null) {
            cellStyle.setTopBorderColor(hssfColorPredefined.getIndex());
            cellStyle.setBottomBorderColor(hssfColorPredefined.getIndex());
            cellStyle.setLeftBorderColor(hssfColorPredefined.getIndex());
            cellStyle.setRightBorderColor(hssfColorPredefined.getIndex());
        }
        return this;
    }

    /**
     * 设置上边框
     * @param borderStyle 边框风格
     * @return builder
     */
    public StyleBuilder setTopBorder(BorderStyle borderStyle){
        return setTopBorder(borderStyle, HSSFColor.HSSFColorPredefined.BLACK);
    }

    /**
     * 设置下边框
     * @param borderStyle 边框风格
     * @return builder
     */
    public StyleBuilder setBottomBorder(BorderStyle borderStyle){
        return setBottomBorder(borderStyle, HSSFColor.HSSFColorPredefined.BLACK);
    }

    /**
     * 设置左边框
     * @param borderStyle 边框风格
     * @return builder
     */
    public StyleBuilder setLeftBorder(BorderStyle borderStyle){
        return setLeftBorder(borderStyle, HSSFColor.HSSFColorPredefined.BLACK);
    }

    /**
     * 设置右边框
     * @param borderStyle 边框风格
     * @return builder
     */
    public StyleBuilder setRightBorder(BorderStyle borderStyle){
        return setRightBorder(borderStyle, HSSFColor.HSSFColorPredefined.BLACK);
    }

    /**
     * 设置四周边框
     * @param borderStyle 边框风格
     * @return builder
     */
    public StyleBuilder setSurroundBorder(BorderStyle borderStyle) {
        return setSurroundBorder(borderStyle, HSSFColor.HSSFColorPredefined.BLACK);
    }

    /**
     * 设置填充形式
     * @param fillPatternType 填充形式
     * @return builder
     */
    public StyleBuilder setFillPattern(FillPatternType fillPatternType) {
        cellStyle.setFillPattern(fillPatternType);
        return this;
    }

    /**
     * 设置背景填充颜色
     * @param hssfColorPredefined 填充颜色
     * @return builder
     */
    public StyleBuilder setFillBackgroundColor(HSSFColor.HSSFColorPredefined hssfColorPredefined) {
        cellStyle.setFillBackgroundColor(hssfColorPredefined.getIndex());
        return this;
    }

    /**
     * 设置前景填充颜色
     * @param hssfColorPredefined 填充颜色
     * @return builder
     */
    public StyleBuilder setFillForegroundColor(HSSFColor.HSSFColorPredefined hssfColorPredefined) {
        cellStyle.setFillForegroundColor(hssfColorPredefined.getIndex());
        return this;
    }

    /**
     * 设置垂直居中形式
     * @param verticalAlignment 垂直居中形式
     * @return builder
     */
    public StyleBuilder setVerticalAlignment(VerticalAlignment verticalAlignment) {
        cellStyle.setVerticalAlignment(verticalAlignment);
        return this;
    }

    /**
     * 设置水平居中形式
     * @param horizontalAlignment 水平居中形式
     * @return builder
     */
    public StyleBuilder setAlignment(HorizontalAlignment horizontalAlignment) {
        cellStyle.setAlignment(horizontalAlignment);
        return this;
    }

    /**
     * 设置完全居中
     * @return builder
     */
    public StyleBuilder setWholeCenter() {
        return setVerticalAlignment(VerticalAlignment.CENTER).setAlignment(HorizontalAlignment.CENTER);
    }

    /**
     * 设置自动换行
     * @param wrapText 自动换行
     * @return builder
     */
    public StyleBuilder setWrapText(boolean wrapText) {
        cellStyle.setWrapText(wrapText);
        return this;
    }

    /**
     * 设置风格锁
     * @param locked 是否锁风格
     * @return builder
     */
    public StyleBuilder setLocked(boolean locked) {
        cellStyle.setLocked(locked);
        return this;
    }

    /**
     * 设置缩进
     * @param indention 是否缩进
     * @return builder
     */
    public StyleBuilder setIndention(short indention) {
        cellStyle.setIndention(indention);
        return this;
    }

    /**
     * 设置隐藏
     * @param hidden 是否隐藏
     * @return builder
     */
    public StyleBuilder setHidden(Boolean hidden) {
        cellStyle.setHidden(hidden);
        return this;
    }

    /**
     * 设置旋转角度
     * @param rotation 旋转角度
     * @return builder
     */
    public StyleBuilder setRotation(short rotation) {
        cellStyle.setRotation(rotation);
        return this;
    }

    /**
     * 打开或关闭样式的引用前缀
     * @param quotePrefixed 旋转角度
     * @return builder
     */
    public StyleBuilder setQuotePrefixed(boolean quotePrefixed) {
        cellStyle.setQuotePrefixed(quotePrefixed);
        return this;
    }

    /**
     * 设置根据内容自行缩进
     * @param shrinkToFit 是否根据内容自行缩进
     * @return builder
     */
    public StyleBuilder setShrinkToFit(boolean shrinkToFit) {
        cellStyle.setShrinkToFit(shrinkToFit);
        return this;
    }

    /**
     * 设置单元格格式
     * @param dataFormatIndex 单元格格式下标
     * @return builder
     */
    public StyleBuilder setDataFormat(short dataFormatIndex) {
        cellStyle.setDataFormat(dataFormatIndex);
        return this;
    }

    /**
     * 设置单元格格式
     * @param dataFormatExp 单元格格式表达式
     * @return builder
     */
    public StyleBuilder setDataFormat(String dataFormatExp) {
        cellStyle.setDataFormat((short) BuiltinFormats.getBuiltinFormat(dataFormatExp));
        return this;
    }

}
