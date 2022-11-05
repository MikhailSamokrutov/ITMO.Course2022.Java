package Itmo.Lesson4.Part1.Ex5;

import java.util.Arrays;

public class Main {
    public static void main(String[] arg) {
        int[] array = new int[5];
        array[0] = 3;
        array[1] = 12;
        array[2] = 49;
        array[3] = 36;
        array[4] = 9;

        System.out.println(Arrays.toString(array));

        boolean mb;
        if (mb = (3 == array[0] || 3 == array[array.length - 1]))
            System.out.println("true");
        else System.out.println("false");
    }
}
