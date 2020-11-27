package cn.kerninventor.excel.core;

import java.util.Map;
import java.util.Objects;

/**
 * <p>
 *     表达式解析器
 * </p>
 *
 * @author Kern
 */
public class ExprInterpreter {

    private Map<String, String> keyValueMatcher;

    public String interpret(String expression) {
        expression = Objects.requireNonNull(expression,"Expression is null!").trim();
        if (expression.startsWith("#{")) {
            expression = expression.substring(2, expression.indexOf("}"));
            return keyValueMatcher.get(expression);
        } else if (expression.startsWith("%")) {

        }
        return null;
    }

    public static void main(String[] args) {
        String expr = "#{354321";

        expr = expr.substring(2, expr.indexOf("}"));
        System.out.println(expr);
    }


}
