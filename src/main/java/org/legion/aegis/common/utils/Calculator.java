package org.legion.aegis.common.utils;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class Calculator {

    public static final RoundingMode HALF_UP = RoundingMode.HALF_UP;
    public static final RoundingMode HALF_EVEN = RoundingMode.HALF_EVEN;
    public static final RoundingMode HALF_DOWN = RoundingMode.HALF_DOWN;
    public static final RoundingMode ROUND_UP = RoundingMode.UP;
    public static final RoundingMode ROUND_DOWN = RoundingMode.DOWN;
    public static final int DEFAULT_SCALE = 2;

    public static double add(double a, double b, int scale, RoundingMode roundingMode) {
        BigDecimal a1 = BigDecimal.valueOf(a);
        BigDecimal b1 = BigDecimal.valueOf(b);
        BigDecimal result = a1.add(b1).setScale(scale, roundingMode);
        return result.doubleValue();
    }

    public static double add(double a, double b, int scale) {
        return add(a, b, scale, HALF_UP);
    }

    public static double add(double a, double b) {
        return add(a, b, DEFAULT_SCALE, HALF_UP);
    }

    public static double subtract(double a, double b, int scale, RoundingMode roundingMode) {
        BigDecimal a1 = BigDecimal.valueOf(a);
        BigDecimal b1 = BigDecimal.valueOf(b);
        BigDecimal result = a1.subtract(b1).setScale(scale, roundingMode);
        return result.doubleValue();
    }

    public static double subtract(double a, double b, int scale) {
        return subtract(a, b, scale, HALF_UP);
    }

    public static double subtract(double a, double b) {
        return subtract(a, b, DEFAULT_SCALE, HALF_UP);
    }

    public static double multiply(double a, double b, int scale, RoundingMode roundingMode) {
        BigDecimal a1 = BigDecimal.valueOf(a);
        BigDecimal b1 = BigDecimal.valueOf(b);
        BigDecimal result = a1.multiply(b1).setScale(scale, roundingMode);
        return result.doubleValue();
    }

    public static double multiply(double a, double b, int scale) {
        return multiply(a, b, scale, HALF_UP);
    }

    public static double multiply(double a, double b) {
        return multiply(a, b, DEFAULT_SCALE, HALF_UP);
    }

    public static double divide(double a, double b, int scale, RoundingMode roundingMode) {
        BigDecimal a1 = BigDecimal.valueOf(a);
        BigDecimal b1 = BigDecimal.valueOf(b);
        BigDecimal result = a1.divide(b1, scale, roundingMode);
        return result.doubleValue();
    }

    public static double divide(double a, double b, int scale) {
        return divide(a, b, scale, HALF_UP);
    }

    public static double divide(double a, double b) {
        return divide(a, b, DEFAULT_SCALE, HALF_UP);
    }
}
