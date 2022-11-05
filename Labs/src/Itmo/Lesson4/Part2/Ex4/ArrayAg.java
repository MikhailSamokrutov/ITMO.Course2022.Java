package Itmo.Lesson4.Part2.Ex4;

import java.util.Arrays;

public class ArrayAg {
    public static void main(String[] args) {

        int[] array = new int[6];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 1;
        array[4] = 2;
        array[5] = 4;

        System.out.println("Изначальный массив: " + Arrays.toString(array));
        GiveNumber(array);
    }

    public static void GiveNumber(int[] array)
    {
        for (int i = 0; i < array.length; i++) {
            boolean mb = true;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j] && i != j)
                {
                    mb = false;
                    break;
                }
            }
            if (mb)
                System.out.print("\nУникальное число: " + array[i]);
        }
    }
}
