package day09.quiz01_abstract;

public class Bicycle extends Trans {
    @Override
    public void show() {
        System.out.println("자전거를 선택하셨습니다.");
        timetable();
        start();
        stop();

    }

    @Override
    public void timetable() {
        System.out.println("자전거는 대여시간은 1시간 입니다.");
    }

    @Override
    public void start() {
        System.out.println("자전거 대여 해드립니다. 금액을 지불하세요.");
        charge(5000);

    }

    @Override
    public void charge(int pay) {
        System.out.println("금액은" + pay +"이며 대여시간은 1시간입니다.");

    }

    @Override
    public void stop() {
        System.out.println("자전거 대여시간 종료입니다. 반납하세요");

    }
}
