package day09.abstract2;

public class Circle extends Shape{

    @Override
    public double calc(double x) {
        result= x*x*Math.PI;
        return result;
    }

    @Override
    public void show(String name) {
        calc(5.5);
        System.out.println(result + "크기의" + name + "그려졌습니다.");

    }
}
