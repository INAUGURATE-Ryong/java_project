package day09.abstract1;

abstract class Shape { // abstract class, super class
    double result = 0;

    public abstract double calc();  // abstract 메소드

    public abstract void draw();

    public void show() {  // 일반메소드
        System.out.println("Super class Shape");
    }
}  // Shape end

class Circle extends Shape { // sub class
    double r = 5.0;

    @Override
    public double calc() {
        result = r * r * Math.PI;
        return result;
    }

    @Override
    public void draw() {
        calc();
        System.out.println("원의 넓이 : " + result + "인 원을 그렸습니다.");

    }

}
class Triangle extends Shape {
    int w =3, h=5;

    @Override
    public double calc() {
        result = (w*h) /2;
        return result;
    }

    @Override
    public void draw() {
        calc();
        System.out.println("삼각형의 넓이 : " + result + "인 삼각형을 그렸습니다.");

    }
}
class Rectangle extends Shape {
    int a=5,b=8;

    @Override
    public double calc() {
        result = a*b;
        return result;
    }

    @Override
    public void draw() {
        calc();
        System.out.println("직사각형의 넓이 : " + result + "인 직사각형을 그렸습니다.");

    }
}

public class MainEntry {
    /*
    > abstract class (추상클래스)
     - 미완성 클래스 <----- 자체적으로 객체 생성할 수 없다. ( 단, 상속 받은 자손 클래스로는 객체 생성 할 수 없다.)나
     - 추상메소드를 갖고 있다.
     - abstract
      public void disp(){} // 일반메소드
      public abstract void disp(); // 추상메소드 - 몸체(블록 {} ) 를 갖지 않는다.

       형식>
        public abstract class Point {  // 부모 추상 클래스
            void disp() {   }
            abstract void show(); // 추상메소드
        }

        class Sub extends Super {  // 자손(서브) 클래스
        추상메소드 오버라이드해야한다.
        }

     */
    public static void main(String[] args) {

        Shape sh = new Circle();
        sh.draw(); // circle의 draw임
        System.out.println("======================");

        sh = new Rectangle();
        sh.draw(); // Rectangle의 draw
        System.out.println("======================");
        // Shape sh = new Shape();  // 자체적으로 객체를 생성할 수 없다.
        new Triangle().draw();
        new Rectangle().draw();
        Circle c = new Circle();
        c.draw();


    }
}
