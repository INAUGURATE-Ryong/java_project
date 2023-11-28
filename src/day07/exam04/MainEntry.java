package day07.exam04;

public class MainEntry {
    public static void main(String[] args) {
        Point pt = new Point();
        pt.display();
        pt.setX(100);
        pt.setY(200);
        pt.display();

        System.out.println("Circle odject");
        Circle cc = new Circle();
        cc.setX(50);
        cc.setY(60);
        cc.setR(20);
        cc.display();
    }
}
