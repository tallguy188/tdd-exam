package com.ll;

public class Calc {
    public static int run(String exp) {
        if (exp.isBlank()) return 0;


        exp = stripOuterParentheses(exp);


        final String[] expBits = exp.split(" ");
        final String sign = expBits[1];
        final int num1 = Integer.parseInt(expBits[0]);
        final int num2 = Integer.parseInt(expBits[2]);


        final int rs = switch (sign) {
            case "+":
                yield num1 + num2;
            case "-":
                yield  num1 - num2;
            case "/" :
                yield  num1 / num2;
            default:
                yield  num1 * num2;
        };
        return rs;
    }

    private static String stripOuterParentheses(String exp) {

        if(exp.startsWith("(") && exp.endsWith(")")) {
            exp = exp.substring(1, exp.length() -1);
        }

        return exp;
    }
}
