package day09.interface1;

import day09.abstract2.Shape;

interface A{
    int x=9; //interface - abstract method, final member 만 가질 수 있다. // 변수값 변경 불가
    // 기울여진건 스태틱과 파이널을 가지고 있단 뜻
    public void show();
    public abstract void disp();
    public int plus(int x , int y);
}// A end
interface B{
    void bView();
}
interface C{
    String name = "happy";  // 변수값 변경 불가 final이 붙어있기에 여기선 우선 생략되어있음.
    // final은 초기겂을 선언 안하면 안된다.
    public void draw();
}
interface D extends B{ // interface 간에 상속에서도 extends씀
    void dView();
}

class Rect implements C{

    @Override
    public void draw() {
        System.out.println(name + "님 반갑습니다.");

    }
}

class Multi extends Shape implements B,C,A{

    @Override
    public double calc(double x) {  //Shape class
        return 5.3;
    }

    @Override
    public void show(String name) {//Shape class
        System.out.println("show call" + name);

    }

    @Override
    public void show() { //A
        System.out.println("A");

    }

    @Override
    public void disp() {//A
        System.out.println("A");

    }

    @Override
    public int plus(int x, int y) { //A
        return 222;
    }

    @Override
    public void bView() {  //B
        System.out.println("B");

    }

    @Override
    public void draw() { //C
        System.out.println("C");

    }
} // Multi class end
public class MainEntry {
    String name ;
    int x, y;
    public static void main(String[] args) {
//        MainEntry me = new MainEntry();
//        System.out.println(me.name);
//        System.out.println(me.x);
//        System.out.println(me.y);
        Rect r = new Rect();
        r.draw();
        C rr = new Rect(); //부모 C 인터페이스로 객체 생성
        rr.draw();

        Multi m = new Multi();
        m.bView();
        m.disp();

        Shape m2 = new Multi();  // 부모클래스를 이용해서 객체 생성
        m2.calc(3);
        m2.view();

        B m3 = new Multi();  // 부모 인터페이스를 이용해서 자손클래스 객체 생성 가능
        m3.bView();

        A m4 = new Multi();
        m4.plus(1,2);
        m4.show();

    }
    // A a = new A() 에러뜸 클래스가 아니라서 객체생성  x



}
/*
  > interface
  － 클래스가 아님（객체 생성 안됨 ）
  － implements
  － 추상메소드,상수만 가질 수 있다.(abstract, final 생략 가능)
  － 다중 상속 구현, ….
 */