package Itmo.lesson5.Ex5;

public class Main {
    public static void main(String[] args) {

        System.out.println("Исходный текст:");
        String text = "Sample Output:\n" +
                "The given string is: This is a test string\n" +
                "The string reversed word by word is:\n" +
                "sihT si a tset gnirts\n";
        System.out.println(text);
        System.out.println(" ");

        wi(text);
    }

    public static void wi(String text)
    {
        text = text.replace(",", "");
        text = text.replace(".", "");
        text = text.replace(":", "");
        text = text.trim();
        text = text.toLowerCase();

        System.out.println("Инвертированный текст:");

        for (String newText : text.split(" ")) {
            System.out.print(new StringBuilder(newText).reverse().toString());
            System.out.print(" ");
        }
    }
}