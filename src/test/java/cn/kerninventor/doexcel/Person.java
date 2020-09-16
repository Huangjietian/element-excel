package cn.kerninventor.doexcel;

import cn.kerninventor.doexcel.elements.ExcelColumn;
import cn.kerninventor.doexcel.elements.ExcelTabulation;
import cn.kerninventor.doexcel.elements.caption.HeadLine;
import cn.kerninventor.doexcel.elements.caption.Line;
import cn.kerninventor.doexcel.elements.caption.MultiLine;
import cn.kerninventor.doexcel.elements.caption.Section;

/**
 * <p>一句话描述</p>
 *
 * @author Kern
 */

@MultiLine(value = {
        @Line(
                value = {
                    @Section(value = "日期: ", colEnd = 2),
                    @Section(value = "%d{yyyy-MM-dd}", colEnd = 5),
                    @Section(value = "单位： ", colEnd = 7),
                    @Section(value = "XXX公司财务部", colEnd = 10),
                    @Section(value = "主管签字:", colEnd = 12),
                    @Section(value = "           ", colEnd = 15)
                },
                styleSubs = 1
        ),
        @Line
})
@HeadLine(value = "大标题", rowNumber = 2)
@ExcelTabulation
public class Person {

    private Long id;

    @ExcelColumn(value = "姓名")
    private String name;

    @ExcelColumn(value = "年龄")
    private int age;

}
