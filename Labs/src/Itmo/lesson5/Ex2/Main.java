package Itmo.lesson5.Ex2;
public class Main {

    public static void main(String[] args) {
        String str = "Боб";

        System.out.printf("Is word [%s] palindrome? %b", str, isPalindrome(str));
    }

    private static boolean isPalindrome(String str) {
        String reverseStr = new StringBuilder(str).reverse().toString();
        return str.equalsIgnoreCase(reverseStr);
    }
}

