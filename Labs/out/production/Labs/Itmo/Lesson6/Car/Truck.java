package Itmo.Lesson6.Car;


public class Truck extends Car {

    private int numberWheels;
    private int maxWeight;

    public Truck(int weight, String model, char color, float speed, int numberWheels, int maxWeight){
        super(weight, model, color, speed);
        this.numberWheels = numberWheels;
        this.maxWeight = maxWeight;
    }

    public void newWheels()
    {
        this.numberWheels = numberWheels;
        System.out.println("NewWheels: количество колес - " + numberWheels);
        System.out.println(" ");
    }

    @Override
    public void outPut() {
        System.out.println("Вес " + model + " составляет " + weight + " кг.");
        System.out.println("Цвет машины - " + color + " и её скорость - " + speed);
        System.out.println("количество колес - " + numberWheels + " и максимальный вес - " + maxWeight);
    }
}
