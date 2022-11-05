package Itmo.Lesson4.Part1.Ex6;

import java.util.Arrays;

public class Main {
    public static void main(String[] arg) {
        int[] array = new int[5];

        array[0] = 0;
        array[1] = 1;
        array[2] = 0;
        array[3] = 3;
        array[4] = 0;

        System.out.println(Arrays.toString(array));

        boolean mb = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == 1 || array[i] == 3) {
                mb = false;

                break;
            }
        }
        if (mb) {
            System.out.println("массив не содержит число 1 или 3");
        } else System.out.println("массив содержит число 1 или 3");
    }
}
