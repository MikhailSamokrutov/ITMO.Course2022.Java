package Itmo.Lesson6.Ex5;

import java.util.Scanner;

public class Name extends Age {

    @Override
    public void getUserInfo() {
        System.out.println("Enter your name:");
        System.out.printf("User name is %s \n", super.scanner.nextLine());
    }
}
