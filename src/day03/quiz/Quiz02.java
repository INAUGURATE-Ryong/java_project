package day03.quiz;

import java.util.Scanner;

public class Quiz02 {  // 아래 스위치로 한 문제를  if문으로 변경
    public static void main(String[] args) {
        System.out.println("점수를 입력하세요(국어, 영어, 전산) = ");
        Scanner sc = new Scanner(System.in);
        int kor = sc.nextInt(), eng = sc.nextInt(), com = sc.nextInt();
        int total = (kor + eng + com);
        double avg = (double)total / 3;
        char grade = ' ';  // 초기값 설정

        if (avg <=100 && avg >= 90){
            grade = 'A';
        } else if (avg >= 80) {
            grade = 'B';
        } else if (avg >= 70) {
            grade = 'C';
        } else if (avg >=60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("총점은" + total+"이고"+ "평균은"+ avg+ "이고"+ "학점은"+ grade+ "입니다.");
    }
}

/*
package day03.quiz;

import java.util.Scanner;

public class Quiz02 {
    public static void main(String[] args) {
        System.out.println("점수를 입력하세요(국어, 영어, 전산) = ");
        Scanner sc = new Scanner(System.in);
        int kor = sc.nextInt(), eng = sc.nextInt(), com = sc.nextInt();
        int total = (kor + eng + com);
        double avg = (double)total / 3;
        char grade = ' ';  // 초기값 설정

        switch (total / 30){  // switch((int)avg / 10)
            case 10:
            case 9: grade = 'A'; break;
            case 8: grade = 'B'; break;
            case 7: grade = 'C'; break;
            case 6: grade = 'D'; break;
        }
        System.out.println("\n\n"+total+"===>"+grade +"학점");
    }
}
 */
