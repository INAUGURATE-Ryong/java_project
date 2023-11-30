package day09.abstract2;

public class Rectangle extends Shape{
    double y =6;

    @Override
    public double calc(double x) {
        result = x*y;
        return result;
    }

    @Override
    public void show(String name) {
        calc(5);
//        y = 6;
        System.out.println(result + "크기의" + name + "그려졌습니다.");
    }
}
