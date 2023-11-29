package day08.inheritance1;

public class Circle extends Point{ // sub class
    private int r;

    public Circle(){
        r=5;
        System.out.println("Circle default constructor call");
    }

    public Circle(int x, int y, int r) {
        super(x,y);
        this.r = r;
        System.out.println("Circle 3개 default constructor call");
    }

    public Circle(int r) {
        super();
        this.r = r;
        System.out.println("Circle 1개 default constructor call");
    }
    public void disp(){
        super.disp(); // super class 멤버에 접근
        System.out.println(", " + r );
    }
}
