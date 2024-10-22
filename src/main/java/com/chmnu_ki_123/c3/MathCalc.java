package com.chmnu_ki_123.c3;

import static java.lang.Math.*;

public class MathCalc {
    public Double calculate(Double x, Double a, Double b, Double c) {
        Double expAxB = Math.exp(a * x - b);
        Double log10AbsXC = Math.log10(Math.abs(x - c));

        return expAxB / log10AbsXC;
    }
}
