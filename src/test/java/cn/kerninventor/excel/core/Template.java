package cn.kerninventor.excel.core;

import cn.kerninventor.excel.core.user.elements.Column;
import cn.kerninventor.excel.core.user.elements.Tabulation;
import cn.kerninventor.excel.core.user.elements.range.HeadLine;
import cn.kerninventor.excel.core.user.elements.range.Row;
import cn.kerninventor.excel.core.user.elements.range.Section;

import java.time.LocalDate;

/**
 * <p>
 *     模板
 * </p>
 *
 * @author Kern
 */

@HeadLine("组织员工信息表")
@Row
@Row
@Tabulation(


)
public class Template {


    @Section("组织信息")
    @Column("组织编码")
    private Long orgCode;

    @Column("组织名称")
    private String orgName;

    @Column("组织创建日期")
    private LocalDate creationDate;

    @Section("员工信息")
    @Column("员工编码")
    private String staffCode;

    @Column("员工名称")
    private String staffName;

    @Column("员工身份证")
    private String staffIdentity;

}
