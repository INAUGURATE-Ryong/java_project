package day09.quiz01_abstract;

import java.util.Scanner;

public class MainEntry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Trans[] transport = new Trans[4];
//        transport[0] = new Subway();
//        transport[1] = new Bus();
//        transport[2] = new Bicycle();
//        transport[3] = new Airplane();
//
//        for (int i = 0; i < transport.length; i++) {
//            transport[i].show();
//            System.out.println("=============");
//        }

        System.out.println("이용할 교통수단을 선택하세요 1. 지하철 2.버스 3.자전거 4.비행기");
//        int choice = sc.nextInt();
        while (true) {
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    Subway sw = new Subway();
                    sw.show(); return;
                case 2:
                    Bus bus = new Bus();
                    bus.show(); return;
                case 3:
                    Bicycle bicycle = new Bicycle();
                    bicycle.show(); return;
                case 4:
                    Airplane airplane = new Airplane();
                    airplane.show(); return;
                default:
                    System.out.println("번호를 잘못선택하셨습니다. 다시선택해주세요");

            }
        }
//        Subway sw = new Subway();
//        sw.show();
        //sw.stop();
    }

/*
    Trans[]  t = new Trans[4];

    Object[] name = { new BiClycle(), new Bus(), new Subway(), new Plain() };

    String[] str = { "자전거", "버스", "지하철", "비행기" };

		for (int i = 0; i < name.length; i++) {
        t[i] = (Trans)name[i];

        t[i].show(str[i]);

 */

}
