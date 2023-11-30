package day09.interface3;

import day09.abstract2.Shape;
import day09.interface2.IDraw;

public class MultiClass extends Shape implements Test, IDraw {
    String name = "이순신";
    @Override
    public double calc(double x) {
        System.out.println("Shape abstract class method");
        return 0;
    }

    @Override
    public void show(String name) {
        System.out.println("Shape abstract class method");
        System.out.println(name + "hi!!!!!");

    }

    @Override
    public void draw() {
        System.out.println("IDraw interface method");


    }

    @Override
    public void tshow(String name) {
        System.out.println("Test interface method");

    }
}
