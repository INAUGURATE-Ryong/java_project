package day08.inheritance1;

public class MainEntry {
    public static void main(String[] args) {
//        Circle c = new Circle();
//        c.disp();  // 부모 클래스를 먼저 부른 뒤 자식이 불러짐
        new Circle().disp();
        new Circle(1,2,3);
        new Rectangle(1,2,3,4).disp();
        new Rectangle().disp();

    }
}
