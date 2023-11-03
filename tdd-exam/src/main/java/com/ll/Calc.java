package com.ll;

public class Calc {
    public static int run(String exp) {
        if(exp.isBlank()) return 0;

        final boolean isPlus = exp.contains("+");

        // +도 정규표현식이라 앞에 역슬래쉬 두개 붙여야함.
        final String divideSign = isPlus ? "\\+" : "-";

        final String[] expBits = exp.split(" " + divideSign + " " );

        final int num1 = Integer.parseInt(expBits[0]);
        final int num2 = Integer.parseInt(expBits[1]);

        if (isPlus) {

            return num1 + num2;
        }
        else {
            return num1 - num2;
        }

    }
}
