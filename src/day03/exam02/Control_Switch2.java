package day03.exam02;

import java.util.Scanner;

public class Control_Switch2 {
    public static void main(String[] args) {
        System.out.println("도시를 선택하세요 (s,d,b,j) = "); // <=== "s"라는 문자는 s와 null로 되어있어 인덱스 0번인 s를 뽑아냄
        String ch = new Scanner(System.in).next();

        switch (ch) { // 조건 - 문자형, 정수형(long 형 제외), 실수형 안됨
            case "s" :
                System.out.println("서울"); break;
            case "d":
                System.out.println("대구"); break;
            case "b":
                System.out.println("부산"); break;
            case "j":
                System.out.println("제주"); break;
            default:
                System.out.println("잘못 선택하셨습니다. s,d,b,j 중에서만 선택하세요");
                System.exit(0); //프로그램 강제 종료
        }  //swith end

        System.out.println("를(을) 선택하셨습니다.");
    }
}

/*
public class Control_Switch2 {
    public static void main(String[] args) {
        System.out.println("도시를 선택하세요 (s,d,b,j) = "); // <=== "s"라는 문자는 s와 null로 되어있어 인덱스 0번인 s를 뽑아냄
        char ch = new Scanner(System.in).next().charAt(0);

        switch (ch) {
            case 's' :
                System.out.println("서울"); break;
            case 'd':
                System.out.println("대구"); break;
            case 'b':
                System.out.println("부산"); break;
            case 'j':
                System.out.println("제주"); break;
            default:
                System.out.println("잘못 선택하셨습니다. s,d,b,j 중에서만 선택하세요");
                System.exit(0); //프로그램 강제 종료
        }  //swith end

        System.out.println("를(을) 선택하셨습니다.");
    }
}
 */