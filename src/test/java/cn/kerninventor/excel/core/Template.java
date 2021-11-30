package cn.kerninventor.excel.core;

import cn.kerninventor.excel.core.user.elements.Tabulation;
import cn.kerninventor.excel.core.user.elements.functionality.Attached;
import cn.kerninventor.excel.core.user.elements.functionality.MergeColumn;
import cn.kerninventor.excel.core.user.elements.Column;
import cn.kerninventor.excel.core.user.elements.range.HeadLine;
import cn.kerninventor.excel.core.user.elements.range.Line;
import cn.kerninventor.excel.core.user.elements.restrict.RestrictDateTime;
import cn.kerninventor.excel.core.user.elements.style.SimpleStyleScheme;

import java.time.LocalDate;

/**
 * <p>
 *     模板
 * </p>
 *
 * @author Kern
 */
@HeadLine("组织员工信息表")
@Line(value = {"备注:", "备注:", "#{template.remark}"}, rowNumbers = 3)
@Line
@Tabulation
public class Template {

    @Attached
    private SimpleStyleScheme colorScheme;

    @Column("组织编码")
    private Long orgCode;

    @Column("组织名称")
    private String orgName;

    @Column("组织创建日期")
    private LocalDate creationDate;

    @RestrictDateTime
    @MergeColumn
    @Column(value = "员工编码")
    private String staffCode;

    @Column(value = "员工名称")
    private String staffName;

    @Column(value = "员工身份证")
    private String staffIdentity;



}
