package cn.kerninventor.excel.core.utils;

import org.apache.poi.ss.formula.functions.FreeRefFunction;
import org.apache.poi.ss.formula.udf.AggregatingUDFFinder;
import org.apache.poi.ss.formula.udf.DefaultUDFFinder;
import org.apache.poi.ss.formula.udf.UDFFinder;
import org.apache.poi.ss.usermodel.Workbook;

/**
 * <p>
 *     自定义函数库
 * </p>
 *
 * @author Kern
 */
@Deprecated
public class CustomFunctionLibRegister {

    public void register(Workbook workbook) {
        String[] functionNames = {"nameKeySubstitute"};
        FreeRefFunction[] freeRefFunctions = {new NameKeySubstituteFunc()};
        UDFFinder udfFinder = new DefaultUDFFinder(functionNames, freeRefFunctions);
        UDFFinder udfToolPack = new AggregatingUDFFinder(udfFinder);

        workbook.addToolPack(udfToolPack);

    }
}
