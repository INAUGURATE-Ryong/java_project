package day09.abstract2;

public class Triangle extends Shape {
    int h = 20;
    @Override
    public double calc(double x) {
        result = x*h/2;
        return result;
    }

    @Override
    public void show(String name) {
        calc(10);
        h =10;
        System.out.println(result + "크기의" + name + "그려졌습니다.");
    }
}
