package Itmo.lesson5.Ex4;

public class Main {
    public static void main(String[] args) {

        System.out.println("Исходный текст:");
        String baseString = "Имеются две строки. Найти количество вхождений одной строки (являющейся подстрокой) в другую.";
        System.out.println(baseString);
        System.out.println(" ");
        String subString = "строки";

        sts(baseString, subString);
    }

    public static void sts(String baseString, String subString)
    {
        int n = 0;
        String[] array = baseString.split(" ");
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(subString)) {
                n = n + 1;
            }
        }
        System.out.println("количество вхождений подстроки " + subString + " в строку - " + n);
    }
}