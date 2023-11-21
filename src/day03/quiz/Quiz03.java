package day03.quiz;

import java.util.Scanner;

// 전산,영어, 국어, 점수를 입력 받아서 평균 60점이상이고, 각 과목 과락 40점 이하면 과목 불합격 프로그램
public class Quiz03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int com,eng,kor;
        System.out.println("세 과목성적을 입력하세요");
        com = sc.nextInt();
        eng = sc.nextInt();
        kor = sc.nextInt();

        double avg = (double) (com+eng+kor) / 3;
        System.out.println("평균 : " + avg);
        if (com <40 || eng<40||kor<40){
            System.out.println("불합격입니다.");
        } else{
            if(avg >= 60) {
                System.out.println("합격입니다.");
            } else {
                System.out.println("불합격입니다.");
            }
        }

    }
}
