package org.itstep.lesson33;

public class Calculator {

    // Метод для  максимуму з двох чисел

    public static int findMax(int a, int b) {
        return Math.max(a, b);
    }

    // Метод для  мінімуму з двох чисел
    public static int findMin(int a, int b) {
        return Math.min(a, b);
    }

    // Метод для увідсотку
    public static double findPercentage(double number, double percent) {
        return (number * percent) / 100;
    }

    // Метод для  числа до степен
    public static double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }
}

