package cn.kerninventor.excel.core;

import cn.kerninventor.excel.core.user.elements.Column;
import cn.kerninventor.excel.core.user.elements.Tabulation;

/**
 * <p>一句话描述</p>
 *
 * @author Kern
 */


@Tabulation
public class Person {

    private Long id;

    @Column(value = "姓名")
    private String name;

    @Column(value = "年龄")
    private int age;

}
