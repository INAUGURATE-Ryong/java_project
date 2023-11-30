package day09.abstract2;

public abstract class Shape {
    double result = 0;
    public abstract double calc(double x); // 추상메소드
    public abstract void show(String name);

    public void view() { // 일반메소드
        System.out.println("super class Shape 입니다.");

    }
}
