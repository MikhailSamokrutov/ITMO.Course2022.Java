package Itmo.lesson5.Ex3;

public class Main {
    public static void main(String[] args) {

        System.out.println("Исходный текст:");
        String text = "Напишите метод, заменяющий в тексте все вхождения слова бяка на [вырезано цензурой]";
        System.out.println(text);
        System.out.println(" ");
        String B = "бяка";
        String noB = "[вырезано цензурой]";

        wrc(text, B, noB);
    }

    public static void wrc(String text, String B, String noB)
    {
        text = text.replace(",", "");
        text = text.replace(".", "");
        text = text.trim();
        text = text.toLowerCase();
        System.out.println("Форматированный текст:");
        System.out.println(text);
        System.out.println(" ");

        String[] array = text.split(" ");
        StringBuilder newText = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(B)) {
                array[i] = noB;
            }
            newText.append(array[i]);
            newText.append(" ");
        }
        System.out.println(newText);

    }
}