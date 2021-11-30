package cn.kerninventor.excel.core.user.elements.style;

import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.FontUnderline;

/**
 * <p>
 *     字体生成器，基于POI提供的{@link Font}接口提供流式编程范式
 * </p>
 * @author Kern
 */
public final class FontBuilder {

    private final Font font;

    public FontBuilder(Font font) {
        this.font = font;
    }

    /**
     * 获取字体
     * @return
     */
    public Font get(){
        return font;
    }

    /**
     * 设置字体名称
     * @param fontName
     * @return
     */
    public FontBuilder setFontName(String fontName) {
        font.setFontName(fontName);
        return this;
    }

    /**
     * 设置字体大小
     * @param fontSize
     * @return
     */
    public FontBuilder setFontSize(int fontSize) {
        font.setFontHeightInPoints((short) fontSize);
        return this;
    }

    /**
     * 设置字体颜色
     * @param fontColor
     * @return
     */
    public FontBuilder setFontColor(HSSFColor.HSSFColorPredefined fontColor) {
        font.setColor(fontColor.getIndex());
        return this;
    }

    /**
     * 设置字体倾斜
     * @param italic
     * @return
     */
    public FontBuilder setItalic(boolean italic) {
        font.setItalic(italic);
        return this;
    }

    /**
     * 设置删除线
     * @param strikeout
     * @return
     */
    public FontBuilder setStrikeout(boolean strikeout) {
        font.setStrikeout(strikeout);
        return this;
    }

    /**
     * 设置加粗
     * @param bold
     * @return
     */
    public FontBuilder setBold(boolean bold) {
        font.setBold(bold);
        return this;
    }

    /**
     * 设置下划线
     * @param fontUnderline
     * @return
     */
    public FontBuilder setUnderline(FontUnderline fontUnderline) {
        font.setUnderline(fontUnderline.getByteValue());
        return this;
    }

    /**
     * 设置编码格式
     * @param fontCharset
     * @return
     */
    public FontBuilder setCharSet(byte fontCharset) {
        font.setCharSet(fontCharset);
        return this;
    }
}
