package day09.quiz01_abstract;

public class Airplane extends Trans {
    @Override
    public void show() {
        System.out.println("비행기를 선택하셨습니다.");
        timetable();
        start();
        stop();

    }

    @Override
    public void timetable() {
        System.out.println("비행기 배차 간격은 한시간입니다.");
    }

    @Override
    public void start() {
        System.out.println("비행기가 출발할 예정입니다. 티켓을 보여주세요.");
        charge(11000000);

    }

    @Override
    public void charge(int pay) {
        System.out.println("티켓은" + pay +"입니다. 돈이 없으면 다른 수단을 이용하세요.");

    }

    @Override
    public void stop() {
        System.out.println("목적지에 도착했습니다. 모두 내려주세요.");

    }
}
