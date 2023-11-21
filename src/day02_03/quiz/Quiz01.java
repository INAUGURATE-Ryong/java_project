package day02_03.quiz;

import java.util.Scanner;

// 숫자 2개 입력 받아서 큰수 출력하는 프로그램 작성
public class Quiz01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a값을 입력하세요.");
        int a = sc.nextInt();
        System.out.print("b값을 입력하세요.");
        int b = sc.nextInt();

        if (a > b) {
            System.out.println("a와 b중 큰 값은" + a+" 입니다.");
        } else if(a <b ) {
            System.out.println("a와 b중 큰 값은" + b+" 입니다.");
        } else {
            System.out.println("두 값은 같습니다.");
        }
    }

}
