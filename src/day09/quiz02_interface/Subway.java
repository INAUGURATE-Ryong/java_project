package day09.quiz02_interface;

public class Subway implements Trans{
    String name = "지하철";
    int pay = 1500;
    @Override
    public void start() {
        timetable();
        charge(1500);
        System.out.println(pay+"원 확인했습니다~"+name + "출발합니데이");
    }

    @Override
    public void stop() {
        System.out.println(name + "멈췄습니데이");

    }

    @Override
    public void charge(int pay) {
        System.out.println("금액은" + pay +"입니데이!");

    }

    @Override
    public void timetable() {
        System.out.println(name+"배차간격은 10분입니다.");

    }
}
