package Itmo.Lesson6.Ex4;

public class HeirClass extends BaseClass {

    public HeirClass(int sup)
    {
        super(sup);
    }

    @Override
    public void toScreen() {
        System.out.println("Переопределенный метод базового класса в классе наследнике: sup = " + sup);
    }

    public void toScreen1 ()
    {
        int b = super.sup;
        System.out.println("Собсвенный метод класса наследника: sup = " + b);
    }
}
