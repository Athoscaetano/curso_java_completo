package utils;

public class Calculator {
    public static final double PI = 3.14159;

    public static double circunference(double radius) {
        return 2 * Calculator.PI * radius;
    }

    public static double volume(double radius) {
        return 4 * Calculator.PI * radius * radius * radius / 3.0;
    }
}
