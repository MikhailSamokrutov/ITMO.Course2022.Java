package Itmo.Lesson6.Ex4;

public class BaseClass {

    int sup;

    public BaseClass(int sup) // конструктор
    {
        this.sup = sup;
    }

    public void toScreen() {
        System.out.println("Основной метод базового класса: sup = " + sup);
    }
}
