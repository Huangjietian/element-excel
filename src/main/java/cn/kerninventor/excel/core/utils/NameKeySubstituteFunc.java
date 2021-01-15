package cn.kerninventor.excel.core.utils;

import org.apache.poi.ss.formula.OperationEvaluationContext;
import org.apache.poi.ss.formula.eval.EvaluationException;
import org.apache.poi.ss.formula.eval.OperandResolver;
import org.apache.poi.ss.formula.eval.StringEval;
import org.apache.poi.ss.formula.eval.ValueEval;
import org.apache.poi.ss.formula.functions.FreeRefFunction;

/**
 * <p>
 *     名称管理器键函数
 * </p>
 *
 * @author Kern
 */
@Deprecated
public class NameKeySubstituteFunc implements FreeRefFunction {

    @Override
    public ValueEval evaluate(ValueEval[] args, OperationEvaluationContext ec) {
        String nameKey = "";
        try {
            ValueEval valueEval = OperandResolver.getSingleValue(args[0], ec.getRowIndex(), ec.getColumnIndex());
            nameKey = OperandResolver.coerceValueToString(valueEval);
            //替换掉除数字字母和汉字外的所有字符
            nameKey = "_" + nameKey.replaceAll("[^\\u4e00-\\u9fa5a-zA-Z0-9]", nameKey);

        } catch (EvaluationException e) {
            e.printStackTrace();
        }
        return new StringEval(nameKey);
    }
}
