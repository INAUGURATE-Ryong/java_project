package day06.quiz;

import java.awt.*;
import java.util.Scanner;

public class Quiz04 {
    // 사친연산(+,-,*,/) 함수 - 2개 리턴타입 매개변수, 2개는 리턴타입 아닌 상태
    // plus(+), sub(-), mul(*), div( / )는 예외처리
    public static int plus(int x,int y){
        return x+y;
    }
    public static int sub(int x, int y){
        return x-y;
    }
    public static void mul(int x, int y){
        System.out.println(x*y);
    }
    public static void div(int x, int y){
        if (y != 0){
            System.out.println((double) x/y);
        } else{
            System.out.println("0으로 나눌 수 없습니다.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;

        while (true){
            System.out.println("integer data(1,2,3,4,0)=");
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("덧셈 함수 호출 : x, y = ");
                    result = plus(sc.nextInt(),sc.nextInt());
                    System.out.println(result);
                    break;
                case 2:
                    System.out.println("뺄셈 함수 호출 : x, y = ");
                    result = sub(sc.nextInt(),sc.nextInt());
                    System.out.println(result);
                    break;
                case 3:
                    System.out.println("나눗셈 함수 호출 : x, y = ");
                    div(sc.nextInt(),sc.nextInt());
                    break;
                case 4:
                    System.out.println("곱셈 함수 호출 : x, y = ");
                    mul(sc.nextInt(),sc.nextInt());
                    break;
                case 0:
                    System.out.println("프로그램 종료");
                    System.exit(0);
                default:
                    System.out.println("없는 선택 번호입니다. (1,2,3,4,0) 중에서 넣어라.");
                    break;
            }
            System.out.println("프로그램 강제 종료 됨.");
        }

    }
}
