package Itmo.Lesson3.Ex2;

import java.awt.*;

public class Class
{
    private Color color;
    private String name;
    private double weight;


    public Class(Color color, String name, double weight) {
        this.color = color;
        this.name = name;
        this.weight = weight;

    }

    public Class(Color color) {
        this.color = color;
    }
    public Class(Color color,double weight) {
        this.color = color;
        this.weight = weight;
    }
    public Class() {
    }

    public String toString() {
        return "Class{" +
                "color=" + color +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}


