package day02.exma03;

import java.util.Scanner;

public class Control_If2 {
    public static void main(String[] args) {
        // 비교문(if ~ else)
        System.out.print("값을 입력하세요");
        int su = new Scanner(System.in).nextInt();

        //양수, 음수 , 0 판정
        if(su > 0) {
            System.out.println(su + " : 양수");
        } else if (su < 0 ) {
            System.out.println(su + " : 음수");
        } else {
            System.out.println(su + " : 0이다.");

        }

       /*
        if(su % 2 ==0) System.out.println(su + " : 짝수");
        else System.out.println(su + " : 홀수");  프린트값이 한줄이면 {} 생략가능
         */
    }
}
