package day05.quiz;

import java.util.Scanner;

public class Quiz01 {
    public static void main(String[] args) {
        // 7의 개수 구하기
        int[] su = {1,7,4,7,55,90,100,7,2,7,23};
        int count =0;
        int b = 7;
        for (int i = 0; i < su.length;i++){
            if(su[i]==b){
                count+=1;
            }
        }
        System.out.println("7의 개수는 : "+count);
        System.out.println("===================");

        // 11월 한달간(30일)의 강수량을 입력 받아서, 평균 구하는 프로그램 작성
        Scanner sc = new Scanner(System.in);
        System.out.println("일수를 입력하세요.");
        int a = sc.nextInt(), sum = 0;
        double avg =0;
        double [] arr = new double[a];
        for (int i=0;i<arr.length;i++){
            System.out.println((i+1)+"번쨰 강수량을 입력하세요.");
            arr[i] = sc.nextInt();
            sum+=(int)arr[i];

        }

        avg =(double)sum/arr.length;  // for문 안에 넣어도 상관은 없음.
        System.out.printf("11월 한달간 비의 평균 강수량은 %.2f입니다.", avg);
    }
}
