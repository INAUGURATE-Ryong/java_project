package day03.exam02;

import java.util.Scanner;

public class Control_Switch1 {
    public static void main(String[] args) {
        System.out.print("당신의 포인트 점수는?(1~3점) input : ");
        int point  = new Scanner(System.in).nextInt();
        switch ((int)point){  // 조건 - 문자형, 정수형(long 형 제외), 실수형 안됨
            case 1: //숫자, '문자', "문자열"
                System.out.println("포인트 점수는 1점입니다.");
                break;
            case 2:
                System.out.println("포인트 점수는 2점입니다.");
                break;
            case 3:
                System.out.println("포인트 점수는 3점입니다.");
                break;
            default:
                System.out.println("없는 점수 입니다. 1~3까지만 입력하세요!");
        }
    }
}
