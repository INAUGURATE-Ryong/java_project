package day02.exma03;

import java.util.Scanner;

public class Control_If1 {
    public static void main(String[] args) {
        // 비교문(if ~ else)
        System.out.print("값을 입력하세요");
        int su = new Scanner(System.in).nextInt();

        //짝,홀수 판정
        if(su % 2 ==0) {
            System.out.println(su + " : 짝수");
        } else {
            System.out.println(su + " : 홀수");
        }

        /*
        if(su % 2 ==0) System.out.println(su + " : 짝수");
        else System.out.println(su + " : 홀수");  //프린트값이 한줄이면 {} 생략가능
         */
    }
}
