package Itmo.Lesson4.Part1.Ex2;

public class Main {
    public static void main(String[] arg) {
        int a;
        for (a = 1; a < 101; a++) {
            if ((a % 3 == 0 && a % 5 == 0)) {
                System.out.println(a + " делится и на 3 и на 5");
            } else if (a % 3 == 0) {
                System.out.println(a + " делится на 3");
            } else if (a % 5 == 0) {
                System.out.println(a + " делится на 5");
            }
        }
    }

}