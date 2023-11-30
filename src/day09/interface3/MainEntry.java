package day09.interface3;

import day09.abstract2.Shape;
import day09.interface2.IDraw;

public class MainEntry {
    public static void main(String[] args) {
        MultiClass mc = new MultiClass();

        mc.draw();
        mc.tshow("강감찬");
        mc.show("광개토");
        System.out.println("===================");
        IDraw i = new MultiClass();
        i.draw();
        System.out.println(i.su);

        System.out.println("=================");
        Shape s = new MultiClass();
        System.out.println(s.calc(3.3));
        s.show("김희선");

    }
}
