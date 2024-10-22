package com.chmnu_ki_123.c3;

public class Main {
    public static void main(String[] args) {
        MathCalc calc = new MathCalc();

        Double x = -3.0, a = 2.0, b = -1.0, c = 5.1;
        Double result = calc.calculate(x, a, b, c);

        System.out.printf("Result: %.5f\n", result);
    }
}
