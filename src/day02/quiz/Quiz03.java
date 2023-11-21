package day02.quiz;
import java.util.Scanner;
// import java.lang.*; // java.lang package는 자동 임포트
/*
성적표 출력하는데 입력값 받아서 출력
국어 : 90점, 영어 : 88점, 전산 : 100점
총점 : 278점 , 평균 : 92.67점
*/
public class Quiz03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        double  avg = 0;
        System.out.print("이름을 입력하세요");
        String name = sc.next();
        System.out.print("국어점수를 입력하세요");
        int a = sc.nextInt();
        System.out.print("영어점수를 입력하세요");
        int b = sc.nextInt();
        System.out.print("수학점수를 입력하세요");
        int c = sc.nextInt();

        sum = a+b+c;
        avg = sum /3.0;  //  avg = (double)sum / 3;

        System.out.println(name+"님의 성적표 *****");
        System.out.println("국어 : "+ a+" 영어 : "+b+" 수학 : "+c);
        System.out.printf("총점 : %d, 평균 : %.2f ",sum,avg);  // %.2f 는 소수점 둘쨰자리까지 반환
    }
}



/*
package day02.quiz;

// import java.lang.*; // java.lang package는 자동 임포트
*/
/*
성적표 출력
국어 : 90점, 영어 : 88점, 전산 : 100점
총점 : 278점 , 평균 : 92.67점
*//*

public class Quiz03 {
    public static void main(String[] args) {
        int a= 90, b=88, c=100, sum=0;
        double  avg = 0;
        sum = a+b+c;
        avg = sum /3.0;  //  avg = (double)sum / 3;
        System.out.println("OOO님의 성적표 *****");
        System.out.println("국어 : "+ a+"영어 : "+b+"전산 : "+c);
        System.out.printf("총점 : %d, 평균 : %.2f ",sum,avg);  // %.2f 는 소수점 둘쨰자리까지 반환
    }
}
*/


