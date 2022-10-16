package ru.job4j.ru.job4j.calculator;
import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double subtractionAndDivide(double first, double second) {
        return subtraction(second, first)
                + divide(first, second);
    }

    public static double sumAndMultiplyAndSubtractionAndDivide(double first, double second) {
        return subtraction(second, first)
                + divide(first, second) + sum(first, second)
                + multiply(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + subtractionAndDivide(10, 20));
        System.out.println("Результат расчета равен: " + sumAndMultiplyAndSubtractionAndDivide(10, 20));
    }
}
