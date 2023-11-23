package day04.exam01;

import java.util.Scanner;

public class Control_While3 {
    public static void main(String[] args) {
        int su;
        while (true){  // 무한루프
            do{
                System.out.println("국어 점수를 입력하세요(0~100) = ");
                su = new Scanner(System.in).nextInt();
            }while (su <0 || su > 100);

            System.out.println("점수 더 입력 받으시겠습니까(y/n)? ");
            char yesno = new Scanner(System.in).next().charAt(0);
            if (yesno == 'n' || yesno == 'N') break; //탈출구문
        }
    }
}
