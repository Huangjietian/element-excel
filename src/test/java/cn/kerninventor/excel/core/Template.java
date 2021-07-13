package cn.kerninventor.excel.core;

import cn.kerninventor.excel.core.user.elements.Column;
import cn.kerninventor.excel.core.user.elements.Tabulation;
import cn.kerninventor.excel.core.user.elements.functionality.MergeColumn;
import cn.kerninventor.excel.core.user.elements.range.HeadLine;
import cn.kerninventor.excel.core.user.elements.range.Row;
import cn.kerninventor.excel.core.user.elements.range.Section;
import cn.kerninventor.excel.core.user.elements.restrict.RestrictDateTime;
import cn.kerninventor.excel.core.user.elements.style.Font;
import cn.kerninventor.excel.core.user.elements.style.Style;
import cn.kerninventor.excel.core.user.elements.style.StyleDefine;
import cn.kerninventor.excel.core.user.elements.style.StyleScope;
import org.apache.poi.hssf.util.HSSFColor;

import java.time.LocalDate;

/**
 * <p>
 *     模板
 * </p>
 *
 * @author Kern
 */
@Style(index = StyleScope.headline, notes = "标题风格",
        font = @Font(fontName = "微软雅黑", fontSize = 16, bold = true, color = HSSFColor.HSSFColorPredefined.WHITE),
        fillColor = HSSFColor.HSSFColorPredefined.DARK_BLUE)
@Style(index = StyleScope.defaultRange, notes = "合并区域风格",
        font = @Font(fontName = "宋体", fontSize = 12, bold = true, color = HSSFColor.HSSFColorPredefined.WHITE),
        fillColor = HSSFColor.HSSFColorPredefined.BLUE)
@Style(index = 1, notes = "表头风格1",
        font = @Font(fontName = "微软雅黑", fontSize = 14, color = HSSFColor.HSSFColorPredefined.WHITE),
        fillColor = HSSFColor.HSSFColorPredefined.SKY_BLUE)
@Style(index = 2, notes = "表头风格2",
        font = @Font(fontName = "微软雅黑", fontSize = 14, color = HSSFColor.HSSFColorPredefined.WHITE),
        fillColor = HSSFColor.HSSFColorPredefined.LIGHT_YELLOW)
@Style(index = StyleScope.defaultColumnBody, notes = "表体风格",
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
    @Column("员工编码")
    private String staffCode;

    @Column("员工名称")
    private String staffName;

    @Column("员工身份证")
    private String staffIdentity;



    private StyleDefine styleDefine = w -> {

        return null;
    };
}
