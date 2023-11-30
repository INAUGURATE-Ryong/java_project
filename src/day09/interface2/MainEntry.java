package day09.interface2;

public class MainEntry {
    public static void main(String[] args) {
        //1.
        BB b = new BB();
        b.draw();
        b.show();

        //2.
        IDraw bb = new BB();  // 부모의 인스턴스로 객체 생성하면 부모꺼만 보임. 자식껀 보이지 않음.
        bb.draw();

    }
}
