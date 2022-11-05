package Itmo.Lesson3.Ex3;

public class House {
    private int numberOfFloors;
    private int date;
    private String name;

    public House(int numberOfFloors,int date, String name) {
        this.numberOfFloors = numberOfFloors;
        this.date = date;
        this.name = name;

    }
    public void setHouse(int numberOfFloors, int yearOfConst, String name) {
        this.numberOfFloors = numberOfFloors;
        this.date = yearOfConst;
        this.name = name;


    }
    public int getNumberOfFloors() {
        return numberOfFloors;
    }
    public int getdate() {
        return date;
    }
    public String getName() {
        return name;
    }
    public String toString() {
        return "House{" +
                "numberOfFloors=" + numberOfFloors +
                ", date=" + date +
                ", name='" + name + '\'' +
                '}';
    }
    public static int houseAge() {
        int thisYear;
        thisYear = 2022;
        return thisYear;
    }

}

