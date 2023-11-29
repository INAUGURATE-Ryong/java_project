package day07.exam04;

public class MainEntry {
    public static void main(String[] args) {
        Point pt = new Point();
//        pt.display();
        pt.setX(10);
        pt.setY(20);
        pt.display();
        System.out.println(pt); //pt가 가지고 있는 주소값(16진수)  - toString이 생략되어있음.
        System.out.println(pt.toString()); //pt가 가지고 있는 주소값(16진수)
        System.out.println(pt.hashCode()); //pt가 가지고 있는 주소값(10진수)

//        System.out.println("Circle odject");
//        Circle cc = new Circle();
//        cc.setX(50);
//        cc.setY(60);
//        cc.setR(20);
//        cc.display();
    }
}
