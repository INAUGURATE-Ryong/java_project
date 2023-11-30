package day09.abstract2;

public class MainEntry {
    public static void main(String[] args) {
        //3, 배열 이용한 형태
        Shape[] ss = new Shape[3];  // 배열 선언 및 생성
        ss[0] = new Circle();
        ss[1] = new Rectangle();
        ss[2] = new Triangle();
        String[] name = {"서클아","사각형아","삼각형아"};
        for (int i = 0; i<ss.length;i++) {
            ss[i].show(name[i]);
        }

        System.out.println("***********************");
        //2. Shape 부모 추상클래스를 이용해서 객체 생성
        Shape sh = new Circle();
        sh.show("원원원");
        sh = new Rectangle();
        sh.show("사사각각형형");
        sh = new Triangle();
        sh.show("삼삼각각형형");

        System.out.println("***********************");
        //1. 각자의 클래스로 객체 생성 형태
        new Circle().show("원");
        new Rectangle().show("사각형");
        new Triangle().show("삼각형");
    }
}
