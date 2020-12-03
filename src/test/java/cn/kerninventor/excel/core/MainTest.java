package cn.kerninventor.excel.core;

import cn.kerninventor.excel.core.constants.DocumentType;
import cn.kerninventor.excel.core.user.elements.Element;
import cn.kerninventor.excel.core.user.elements.RangeElement;
import cn.kerninventor.excel.core.user.interfaces.RangeElementParser;
import org.apache.poi.ss.formula.functions.T;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Sheet;

/**
 * <p>一句话描述</p>
 *
 * @author Kern
 */
public class MainTest {

    public static void main(String[] args) {

        /**
         * 关于读写器的想法
         * 1. 提供chain 式的接口，类builder格式，自由转换
         * 2. ExcelKit主要提供读写接口，是读写对象的工厂类，类似风格和字体的在封装工具另外提供
         * 3. 读写步骤， 解析 Class对象， 根据传入的 Supervisor类进行运行时的配置
         * 4. Supervisor应该分为 影响主流程的受限制操作 和 不影响主流程的孤立读写任务
         * 5. 对于受限操作应该由Supervisor类提供API接口以支持操作
         * 6. 理清读写时所需要的操作。
         *
         * 写入
         * 主体为两层嵌套的 For-each 循环，外层循环列， 内层循环行， 主要操作表头以及单元格
         * 主体又分为多个阶段
         * 取风格，对风格的操作，写风格，取值，对值的操作，写值
         *
         * 其余独立阶段， 包括对合并区域的写入， 文本框的写入， 图片的写入等
         * 其中合并区域的写入将影响主体写入区域的起始行列下标
         *
         * 读取
         * 读取需要综合所有的配置项获取数据区域的起始行列下标
         * 主体也是为两层嵌套的 For-each 循环， 外层循环行， 内层循环列， 主要工作是匹配表头和数据行列的读取
         * 主体分为多个阶段
         * 获取表头行下标，验证表头行下标是否正确
         * 初始化Bean实例， 获取数据行起始下标，读取原始数据， 操作原始数据， 根据列下标读取数据并赋值到对应Bean实例中
         */
        ExcelKit.callWriter(MainTest.class).overwrite(true).output(Appender.of(""))
        .resume(Object.class, DocumentType.XLS).convert().breakOff();



    }

    public void test(Sheet sheet, int startRow, int endRow, String... columnNames) {

        //外层列，内层行
        for (int j = 0; j < columnNames.length ; j++) {

            String head = columnNames[j];
            CellStyle headStyle;



            for (int i = startRow ; i < endRow ; i++) {

            }
        }
    }
}
