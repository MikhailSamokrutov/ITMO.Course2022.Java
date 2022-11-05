package Itmo.Lesson3.Ex3;

public class Main {
    public static void main(String[] arg) {
        House house1 = new House(6, 1999, "ЖК Ракета");
        House house2 = new House(18, 2017, "ЖК Эталон");



        System.out.println(house1);
        System.out.println("Возраст дома№1:");
        System.out.println(House.houseAge() - house1.getdate()); // метод из класса

        System.out.println(house2);
        System.out.println("Возраст дома№2:");
        System.out.println(House.houseAge() - house2.getdate()); // метод из класса
    }
}
