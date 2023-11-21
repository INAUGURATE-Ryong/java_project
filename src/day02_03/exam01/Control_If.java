package day02_03.exam01;

import java.util.Scanner;

public class Control_If {
    public static void main(String[] args) {
        System.out.print("값을 입력하세요");
        int su = new Scanner(System.in).nextInt();

        if(su % 2 ==0) {
            System.out.println(su + " : 짝수");
            if(su > 0) {
                System.out.println(su + " : 양수");
            } else if (su < 0 ) {
                System.out.println(su + " : 음수");
            } else {
                System.out.println(su + " : 0이다.");

            }
        } else {
            System.out.println(su + " : 홀수");
            if(su > 0) {
                System.out.println(su + " : 양수");
            } else if (su < 0 ) {
                System.out.println(su + " : 음수");
            } else {
                System.out.println(su + " : 0이다.");

            }
        }
    }
}


/*
package day03.exam01;

import java.util.Scanner;

public class ControlMain {
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

        */
/*
        if(su % 2 ==0) System.out.println(su + " : 짝수");
        else System.out.println(su + " : 홀수");  프린트값이 한줄이면 {} 생략가능
         *//*

    }
}
*/


/*package day03.exam01;

import java.util.Scanner;

public class Control01 {
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

        *//*
        if(su % 2 ==0) System.out.println(su + " : 짝수");
        else System.out.println(su + " : 홀수");  프린트값이 한줄이면 {} 생략가능
         *//*
    }
}*/
