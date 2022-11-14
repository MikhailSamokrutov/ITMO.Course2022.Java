package Itmo.Lesson6.Ex5;

import java.util.Scanner;

public class Age {
    protected final Scanner scanner = new Scanner(System.in);

    public void getUserInfo() {
        System.out.println("Enter your age:");
        System.out.printf("User age is %d \n", scanner.nextInt());
    }
}
