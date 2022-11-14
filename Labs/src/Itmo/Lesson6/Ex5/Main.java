package Itmo.Lesson6.Ex5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Age parentScanner = new Age();
        Name customScanner = new Name();
        parentScanner.getUserInfo();
        customScanner.getUserInfo();
    }
}
