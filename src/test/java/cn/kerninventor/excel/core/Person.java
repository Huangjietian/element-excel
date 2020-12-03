package cn.kerninventor.excel.core;

import cn.kerninventor.excel.core.user.elements.Column;
import cn.kerninventor.excel.core.user.elements.Tabulation;
import org.hibernate.validator.constraints.Range;

/**
 * <p>一句话描述</p>
 *
 * @author Kern
 */


@Tabulation
public class Person {

    private Long id;

    @Column(value = {"信息", "姓名"})
    private String name;

    @Column(value = {"信息", "年龄"})
    private Integer age;

}
