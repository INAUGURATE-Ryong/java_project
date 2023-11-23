package day04.quiz;

import java.util.Scanner;

public class Quiz01 {
    public static void main(String[] args) {
        // while 문으로 원하는 단 입력 받아서 구구단 출력하기
        System.out.println("원하는 구구단을 입력하세요");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int i = 1;
        while (i<=9){
            System.out.println(a+"*"+i+"="+(a*i));
            i++;
        }
        // do ~ while 문으로 원하는 단 입력 받아서 구구단 출력하기
        System.out.println("==================================");
        i = 1;
        do{
            System.out.println(a+"*"+i+"="+(a*i));
            i++;
        } while (i<=9);


    }
}
