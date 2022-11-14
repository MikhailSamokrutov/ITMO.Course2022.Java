package Itmo.Lesson6.Car;

public class Main {
    public static void main(String[] args) {

        Car car = new Car(2300, "BMW", 'b', 180);
        car.outPut();

        Truck truck = new Truck(12000, "Volvo", 'w', 170, 10, 27000);
        truck.newWheels();
        truck.outPut();
    }
}
