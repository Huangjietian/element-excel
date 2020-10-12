package cn.kerninventor.doexcel;

import cn.kerninventor.doexcel.elements.ExcelColumn;
import cn.kerninventor.doexcel.elements.ExcelTabulation;

/**
 * <p>一句话描述</p>
 *
 * @author Kern
 */


@ExcelTabulation
public class Person {

    private Long id;

    @ExcelColumn(value = "姓名")
    private String name;

    @ExcelColumn(value = "年龄")
    private int age;

}
