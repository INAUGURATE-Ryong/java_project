package day10.API_Object;
class Rectangle{
    int x,y;
    public void display(){ // uer method
        System.out.println(x+","+y);
    }

    @Override
    public String toString() {  //toString을 자동으로 만들 수 있음.
        return "Rectangle{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
    //    @Override
//    public String toString(){
//        String str = x+","+y;
//        return str;
//    }
}
public class ToStringMain {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.display();
        System.out.println(r); // r.toString 이란 뜻 toString 은 생략가능

    }
}
