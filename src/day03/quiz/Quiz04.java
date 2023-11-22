package day03.quiz;
import java.util.Scanner;
/*
// 문제] 원하는 단을 입력받아서 구구단 출력
public class Quiz04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("원하는 단을 입력하세요 :");
        int a = sc.nextInt();
        for (int i=1 ; i<=9; i++){
            System.out.println(a+"x"+i+"="+a*i);
        }
    }
}
 */
//문제] 1~100 중에 3의 배수의 합과 개수 구하는 프로그램 작성
/*public class Quiz04 {
    public static void main(String[] args) {
        int sum =0;
        int count = 0;
        for (int i =1 ; i < 101; i++){
            if(i %3 ==0) {
                sum += i;
                count++;
            }
        }
        System.out.println("sum ="+ sum + " , count = "+count);
    }
}*/

//문제] 1~100까지의 합 구하는 프로그램 작성
public class Quiz04 {
    public static void main(String[] args) {
        int sum =0;
        for(int i=1;i<101;i++){
            sum+=i;
        }
        System.out.println(sum);
    }
}
