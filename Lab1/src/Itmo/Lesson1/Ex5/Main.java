package Itmo.Lesson1.Ex5;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {


        System.out.print("Условие x + (y * z)\n" +
                "Введите число x: ");

        Scanner scanner1 = new Scanner(System.in);
        int numberx = scanner1.nextInt();

        System.out.print("Введите число y: ");
        Scanner scanner2 = new Scanner(System.in);
        int numbery = scanner2.nextInt();

        System.out.print("Введите число z: ");
        Scanner scanner3 = new Scanner(System.in);
        int numberz = scanner3.nextInt();


        System.out.println(numberx + (numbery * numberz));


    }




}