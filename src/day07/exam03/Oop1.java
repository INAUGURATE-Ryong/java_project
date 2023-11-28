package day07.exam03;
class Point{
    private int x,y;  //멤버변수(int앞에 아무것도 안쓰면 defalut 상태) 지금은 private상태
    // int - 0, double/float - 0.0 string - null로 초기화 된다.

    //멤버함수 - getter / setter method
    public void setX(int xx){x=xx;}
    public void setY(int yy){y=yy;}
    public int getX(){return x;}
    public int getY(){return y;}
    public void display(){
     //   System.out.println(x+", "+y);
        System.out.println(getX()+", "+getY());
    }

}

class Circle{
    private int x,y,r;
    //getter / setter
    public int getX(){return x;}
    public int getY(){return y;}
    public int getR(){return r;}
    public void setX(int xx){x=xx;}
    public void setY(int yy){y=yy;}
    public void setR(int rr){r=rr;}

    //output
    public void display(){
        System.out.println(getX()+", "+getY()+", "+getR());
    }

}
public class Oop1 {  // public은 한번만 써야함 주로 main이 들어가 있는 클래스에 선언
    public static void main(String[] args) {
        System.out.println("===============================");
        Point pt = new Point(); // 객체생성, 메모리에할당, 생성자함수 자동호출
        System.out.println(pt.getX()+", "+pt.getY());  //0 , 0 출력
        pt.setX(55);
        pt.setY(100);
        System.out.println(pt.getX()+", "+pt.getY());
        pt.display();
//        pt.x=3;
//        pt.y=5;
//        System.out.println(pt.x +", "+pt.y);
        Circle cc = new Circle();
        cc.setX(5);;
        cc.setY(10);
        cc.setR(5);
        cc.display();


    }
}
