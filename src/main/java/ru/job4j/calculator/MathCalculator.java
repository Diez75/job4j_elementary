package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double sumOfSubAndDiv(double first, double second) {
        return sum(sub(first, second), div(first, second));
    }

    public static double sumOfMultiplyAndSumAndSubAndDiv(double first, double second) {
        return sum(sum(multiply(first, second), sum(first, second)),
                sum(sub(first, second), div(first, second)));
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета sumAndMultiply равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета sumOfSubAndDiv равен: " + sumOfSubAndDiv(10, 20));
        System.out.println("Результат расчета sumOfMultiplyAndSumAndSubAndDiv равен: " + sumOfMultiplyAndSumAndSubAndDiv(10, 20));
    }
}
