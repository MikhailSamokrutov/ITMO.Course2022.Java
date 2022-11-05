package Itmo.Lesson4.Part2.Ex2;

import java.util.Scanner;
import java.util.Arrays;

public class ArrayEx {

    public static void main(String[] arg) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите длину массива");
        int x1 = scanner.nextInt();
        int[] array = new int[x1];

        for (int i = 0; i < x1; i++) {
            System.out.println("Введите элемент массива");
            int x2 = scanner.nextInt();
            array[i] = x2;
        }
        System.out.println("Ввод массива закончен");
        System.out.println("Result " + Arrays.toString(array));
    }
}
