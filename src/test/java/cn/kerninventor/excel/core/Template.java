package cn.kerninventor.excel.core;

import cn.kerninventor.excel.core.builder.FontBuilder;
import cn.kerninventor.excel.core.builder.StyleBuilder;
import cn.kerninventor.excel.core.user.elements.Column;
import cn.kerninventor.excel.core.user.elements.Tabulation;
import cn.kerninventor.excel.core.user.elements.functionality.MergeColumn;
import cn.kerninventor.excel.core.user.elements.functionality.Profile;
import cn.kerninventor.excel.core.user.elements.range.HeadLine;
import cn.kerninventor.excel.core.user.elements.range.Row;
import cn.kerninventor.excel.core.user.elements.range.Section;
import cn.kerninventor.excel.core.user.elements.restrict.RestrictDateTime;
import cn.kerninventor.excel.core.user.elements.style.Font;
import cn.kerninventor.excel.core.user.elements.style.Style;
import cn.kerninventor.excel.core.user.elements.style.StyleDefine;
import cn.kerninventor.excel.core.user.elements.style.DefaultStyleIndex;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Workbook;

import java.time.LocalDate;
import java.util.HashMap;

/**
 * <p>
 *     模板
 * </p>
 *
 * @author Kern
 */
@Style(index = DefaultStyleIndex.headline, notes = "标题风格",
        font = @Font(fontName = "微软雅黑", fontSize = 16, bold = true, color = HSSFColor.HSSFColorPredefined.WHITE),
        fillColor = HSSFColor.HSSFColorPredefined.DARK_BLUE)
@Style(index = DefaultStyleIndex.defaultRange, notes = "合并区域风格",
        font = @Font(fontName = "宋体", fontSize = 12, bold = true, color = HSSFColor.HSSFColorPredefined.WHITE),
        fillColor = HSSFColor.HSSFColorPredefined.BLUE)
@Style(index = DefaultStyleIndex.defaultColumnHead, notes = "表头风格1",
        font = @Font(fontName = "微软雅黑", fontSize = 14, color = HSSFColor.HSSFColorPredefined.WHITE),
        fillColor = HSSFColor.HSSFColorPredefined.SKY_BLUE)
@Style(index = 1, notes = "表头风格2",
        font = @Font(fontName = "微软雅黑", fontSize = 14, color = HSSFColor.HSSFColorPredefined.WHITE),
        fillColor = HSSFColor.HSSFColorPredefined.LIGHT_YELLOW)
@Style(index = DefaultStyleIndex.defaultColumnBody, notes = "表体风格",
        font = @Font(fontName = "宋体", fontSize = 12),
        fillColor = HSSFColor.HSSFColorPredefined.BLUE_GREY)
@HeadLine("组织员工信息表")
@Row
@Row
@Tabulation
public class Template {


    @Section("组织信息")


    @Column("组织编码")
    private Long orgCode;

    @Column("组织名称")
    private String orgName;

    @Column("组织创建日期")
    private LocalDate creationDate;

    @Section("员工信息")

    @RestrictDateTime
    @MergeColumn
    @Column(value = "员工编码", headStyleIndex = 1)
    private String staffCode;

    @Column(value = "员工名称", headStyleIndex = 1)
    private String staffName;

    @Column(value = "员工身份证", headStyleIndex = 1)
    private String staffIdentity;


    /**
     * 风格
     */
    private final StyleDefine styleDefine = new StyleDefine() {

        /**
         * @Style(index = 1, notes = "表头风格2",
         *      *         font = @Font(fontName = "微软雅黑", fontSize = 14, color = HSSFColor.HSSFColorPredefined.WHITE),
         *      *         fillColor = HSSFColor.HSSFColorPredefined.LIGHT_YELLOW)
         * @param workbook
         * @return
         */
        @Override
        public HashMap<Double, CellStyle> customDefine(Workbook workbook) {
            HashMap<Double, CellStyle> customStyleMap = new HashMap<>(1);
            customStyleMap.put(1.0,
                    new StyleBuilder(workbook.createCellStyle())
                        .setSurroundBorder(BorderStyle.THIN)
                        .setFillForegroundColor(HSSFColor.HSSFColorPredefined.LIGHT_YELLOW)
                        .setFont(
                                new FontBuilder(workbook.createFont())
                                    .setFontName("微软雅黑")
                                    .setFontSize(14)
                                    .setFontColor(HSSFColor.HSSFColorPredefined.WHITE)
                                    .get()
                        ).get()
                    );
            return customStyleMap;
        }

        /**
         * @Style(index = DefaultStyleIndex.headline, notes = "标题风格",
         *         font = @Font(fontName = "微软雅黑", fontSize = 16, bold = true, color = HSSFColor.HSSFColorPredefined.WHITE),
         *         fillColor = HSSFColor.HSSFColorPredefined.DARK_BLUE)
         * @param workbook
         * @return
         */
        @Override
        public CellStyle headlineStyle(Workbook workbook) {
            CellStyle cellStyle = workbook.createCellStyle();
            new StyleBuilder(cellStyle)
                    .setFillForegroundColor(HSSFColor.HSSFColorPredefined.DARK_BLUE)
                    .setSurroundBorder(BorderStyle.THIN)
                    .setFont(
                        new FontBuilder(workbook.createFont())
                            .setFontColor(HSSFColor.HSSFColorPredefined.WHITE)
                            .setFontName("微软雅黑")
                            .setFontSize(16)
                            .setBold(true)
                            .get()
                    );
            return cellStyle;
        }
    };
}
