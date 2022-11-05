package Itmo.Lesson2.Ex1;

public class Main {

    // Сумма

    private double sum(double x, double y) {
        return (double) (x + y);
    }

    private long sum(long x, long y) {
        return (long) (x + y);
    }

    private int sum(int x, int y) {
        return x + y;
    }

    // Деление
    private double div(double x, double y) {
        checkZero((long) y);
        return (double) (x / y);
    }

    private long div(long x, long y) {
        checkZero(y);
        return (long) (x / y);
    }

    private int div(int x, int y) {
        checkZero((long) y);
        return x / y;
    }

    private void checkZero(long number) {
        if (number == 0) {
            System.err.println("Второе число не должно быть 0!");
            throw new ArithmeticException();
        }
    }

    // Умножение
    private double multipl(double x, double y) {
        return (double) (x * y);
    }

    private long multipl(long x, long y) {
        return (long) (x * y);
    }

    private int multipl(int x, int y) {
        return x * y;
    }

    // Вычитание
    private double subtraction(double x, double y) {
        return (double) (x - y);
    }

    private long subtraction(long x, long y) {
        return (long) (x - y);
    }

    private int subtraction(int x, int y) {
        return x - y;
    }
}
