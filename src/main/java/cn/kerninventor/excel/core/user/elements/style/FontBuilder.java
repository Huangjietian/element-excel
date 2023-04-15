package cn.kerninventor.excel.core.user.elements.style;

import org.apache.poi.common.usermodel.fonts.FontCharset;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.FontUnderline;
import org.apache.poi.ss.usermodel.Workbook;

import java.nio.charset.Charset;

/**
 * <p>
 * 字体构造器
 * </p>
 *
 * @author Kern
 * @since 2023-04-15 3:16 PM
 */
public class FontBuilder {

    private final Font font;

    public FontBuilder(Font font) {
        this.font = font;
    }

    public static Font copyFont(Workbook workbook, Font sourceFont) {
        return copyFont(workbook.createFont(), sourceFont);
    }

    public static Font copyFont(Font targetFont, Font sourceFont) {
        return newInstance(targetFont)
                .setFontColor(sourceFont.getColor())
                .setFontName(sourceFont.getFontName())
                .setFontSize(sourceFont.getFontHeightInPoints())
                .setCharSet(sourceFont.getCharSet())
                .setBold(sourceFont.getBold())
                .setItalic(sourceFont.getItalic())
                .setStrikeout(sourceFont.getStrikeout())
                .setUnderline(sourceFont.getUnderline())
                .setTypeOffset(sourceFont.getTypeOffset())
                .get();
    }

    public static Font applyFont(Workbook workbook, cn.kerninventor.excel.core.user.elements.style.Font font) {
        return applyFont(workbook.createFont(), font);
    }

    public static Font applyFont(Font targetFont, cn.kerninventor.excel.core.user.elements.style.Font font) {
        return newInstance(targetFont)
                .setFontColor(font.color())
                .setFontName(font.name())
                .setFontSize(font.size())
                .setCharSet(font.charset())
                .setBold(font.bold())
                .setItalic(font.italic())
                .setStrikeout(font.strikeout())
                .setUnderline(font.underline())
                .setTypeOffset(font.typeOffset())
                .get();
    }

    public static FontBuilder newInstance(Workbook workbook) {
        return newInstance(workbook.createFont());
    }

    public static FontBuilder newInstance(Font font) {
        return new FontBuilder(font);
    }

    /**
     * 设置字体名称
     * @param fontName 字体名称
     * @return builder
     */
    public FontBuilder setFontName(String fontName) {
        font.setFontName(fontName);
        return this;
    }

    /**
     * 设置字体大小
     * @param fontSize 字体大小
     * @return builder
     */
    public FontBuilder setFontSize(int fontSize) {
        font.setFontHeightInPoints((short) fontSize);
        return this;
    }

    /**
     * 设置字体颜色
     * @param fontColor 字体颜色
     * @return builder
     */
    public FontBuilder setFontColor(HSSFColor.HSSFColorPredefined fontColor) {
        font.setColor(fontColor.getIndex());
        return this;
    }

    /**
     * 设置字体颜色
     * @param fontColorIndex 字体颜色下标
     * @return builder
     */
    public FontBuilder setFontColor(short fontColorIndex) {
        font.setColor(fontColorIndex);
        return this;
    }

    /**
     * 设置字体倾斜
     * @param italic 是否倾斜
     * @return builder
     */
    public FontBuilder setItalic(boolean italic) {
        font.setItalic(italic);
        return this;
    }

    /**
     * 设置删除线
     * @param strikeout 是否设置删除线
     * @return builder
     */
    public FontBuilder setStrikeout(boolean strikeout) {
        font.setStrikeout(strikeout);
        return this;
    }

    /**
     * 设置加粗
     * @param bold 是否加粗
     * @return builder
     */
    public FontBuilder setBold(boolean bold) {
        font.setBold(bold);
        return this;
    }

    /**
     * 设置下划线
     * @param fontUnderline 是否设置下划线
     * @return builder
     */
    public FontBuilder setUnderline(FontUnderline fontUnderline) {
        font.setUnderline(fontUnderline.getByteValue());
        return this;
    }

    /**
     * 设置下划线
     * @param fontUnderlineByte 是否设置下划线
     * @return builder
     */
    public FontBuilder setUnderline(byte fontUnderlineByte) {
        font.setUnderline(fontUnderlineByte);
        return this;
    }

    /**
     * 设置编码格式
     * @param fontCharset 编码格式
     * @return builder
     */
    public FontBuilder setCharSet(FontCharset fontCharset) {
        font.setCharSet(fontCharset.getNativeId());
        return this;
    }

    /**
     * 设置编码格式
     * @param fontCharsetNativeId 编码格式id
     * @return builder
     */
    public FontBuilder setCharSet(int fontCharsetNativeId) {
        font.setCharSet(fontCharsetNativeId);
        return this;
    }

    /**
     * 设置类型偏移量
     * @param typeOffset 类型偏移量
     * @return builder
     */
    public FontBuilder setTypeOffset(short typeOffset) {
        font.setTypeOffset(typeOffset);
        return this;
    }

    /**
     * 获取字体
     * @return 字体
     */
    public Font get(){
        return font;
    }

}
