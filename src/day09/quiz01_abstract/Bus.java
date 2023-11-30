package day09.quiz01_abstract;

public class Bus extends Trans{
    @Override
    public void show() {
        System.out.println("버스를 선택하셨습니다.");
        timetable();
        start();
        stop();

    }

    @Override
    public void timetable() {
        System.out.println("버스 배차 간격은 10분입니다.");
    }

    @Override
    public void start() {
        System.out.println("버스가 출발할 예정입니다. 금액을 지불하세요.");
        charge(1400);

    }

    @Override
    public void charge(int pay) {
        System.out.println("금액은" + pay +"입니다. 돈이 없으면 내려주세요.");

    }

    @Override
    public void stop() {
        System.out.println("목적지에 도착했습니다. 모두 내려주세요.");
    }
}
