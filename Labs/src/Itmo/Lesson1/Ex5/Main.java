package Itmo.Lesson1.Ex5;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {


        System.out.print("Введите число 42: ");

        Scanner scanner1 = new Scanner(System.in);
        int numberx = scanner1.nextInt();

        System.out.print("Введите число 100: ");
        Scanner scanner2 = new Scanner(System.in);
        int numbery = scanner2.nextInt();

        System.out.print("Введите число 125: ");
        Scanner scanner3 = new Scanner(System.in);
        int numberz = scanner3.nextInt();


        System.out.println(numberx);
        System.out.println(numbery);
        System.out.println(numberz);
    }




}