package Itmo.Lesson4.Part1.Ex4;

import java.util.Scanner;

public class Main {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int x1 = scanner.nextInt();
        System.out.println("Введите второе число");
        int x2 = scanner.nextInt();
        System.out.println("Введите третье число");
        int x3 = scanner.nextInt();

        boolean mb;
        if (mb = (x1 < x2 && x2 < x3))
            System.out.println("true");
        else System.out.println("false");
    }
}
