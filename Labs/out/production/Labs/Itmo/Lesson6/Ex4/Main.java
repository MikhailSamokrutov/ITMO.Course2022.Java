package Itmo.Lesson6.Ex4;

public class Main {
    public static void main(String[] args) {

        int group = 233;

        BaseClass baseClass = new BaseClass(group);
        baseClass.toScreen();

        HeirClass heirClass = new HeirClass(group);
        heirClass.toScreen();
        heirClass.toScreen1();
    }
}
