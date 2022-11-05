package Itmo.Lesson4.Part2.Ex1;

import java.util.Arrays;

public class ArrayS {
    public static class SortArray {
        public static void main(String[] arg) {
            int[] array = new int[6];

            array[0] = 1;
            array[1] = 5;
            array[2] = 9;
            array[3] = 20;
            array[4] = 44;
            array[5] = 55;

            System.out.println(Arrays.toString(array));

            boolean sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    sorted = false;
                    break;
                }
            }
            if (sorted) {
                System.out.println("OK");
            } else System.out.println("Please, try again");
        }
    }
}
