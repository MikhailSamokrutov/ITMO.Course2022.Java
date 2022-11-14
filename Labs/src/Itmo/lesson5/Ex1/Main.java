package Itmo.lesson5.Ex1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String text = "  Напи.сат,ь Метод. НеобХОдимыЙ.. для п.оИска самОГО длиНн.ого сло.ва в ТеКсте . ";
        System.out.println(text);

        longWord(text);
    }

    public static void longWord(String text)
    {
        text = text.replace(",", "");
        text = text.replace(".", "");
        text = text.trim();
        text = text.toLowerCase();
        String[] array = text.split(" ");

        System.out.println(Arrays.toString(array));
        System.out.println("Массив содержит " + array.length + " элементов");

        String longWord = array[0];
        for (int i = 0; i <= array.length - 1; i++) {
            if (array[i].length() > longWord.length()) {
                longWord = array[i];
            }
        }
        System.out.println("Самое длинное слово - " + longWord);
    }
}

