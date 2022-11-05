package Itmo.Lesson4.Part2.Ex3;

import java.util.Arrays;

public class ArrayN {
    public static void main(String[] arg) {
        int[] array = new int[5];

        array[0] = 3;
        array[1] = 5;
        array[2] = 6;
        array[3] = 7;
        array[4] = 8;

        System.out.println("Array 1: " + Arrays.toString(array));

        GetArray(array);

        System.out.println("Array 2: " + Arrays.toString(array));
    }

    public static void GetArray(int[] array) {
        int a = array[0];
        int b = array[array.length - 1];

        int[] array1 = new int[5];
        array[0] = b;
        array[array.length - 1] = a;
    }
}
