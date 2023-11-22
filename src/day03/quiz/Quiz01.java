package day03.quiz;

import java.util.Scanner;

//숫자 입력 받아서 짝/홀수 판정 프로그램
public class Quiz01 {
    public static void main(String[] args) {
        System.out.print("숫자를 입력하세요 : ");
        int a = new Scanner(System.in).nextInt();
        int result = a % 2;
        switch (result) {
            case 0:
                System.out.println("짝수 입니다.");
                break;
            case 1:
                System.out.println("홀수 입니다.");
                break;
            default:
                System.out.println("숫자를 넣으세요");
        }
    }

}
