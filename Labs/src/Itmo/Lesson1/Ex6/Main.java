package Itmo.Lesson1.Ex6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.print("Введите число: ");

        Scanner scanner1 = new Scanner(System.in);
        int b = scanner1.nextInt();
        if (b % 2 == 0) {

            if (b > 100) {
                System.out.println("Выход за пределы диапозона.");
            } else {
                System.out.println("Вы ввели четное число");
            }

        } else System.out.println("Нечетеное ");


    }
}
