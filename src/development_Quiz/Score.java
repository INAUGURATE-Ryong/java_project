package development_Quiz;

import java.util.Scanner;

//3과목 입력 받고, 총점, 평균, 학점(if or switch) 구하기
public class Score {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // 객체 생성, 메모리에 할당, 생성자 함수 자동 호출

        System.out.print("이름을 입력하세요");
        String name = sc.next();

        System.out.println("3과목의 점수를 입력하시오");
        int kor = sc.nextInt();
        int eng = sc.nextInt();
        int com = sc.nextInt();
        int total = kor + eng + com;
        double avg = total / 3.0;
        char result = ' ';

        if (avg <= 100 && avg >= 90){
            result = 'A';
        } else if (avg >= 80) {
            result = 'B';
        } else if (avg >= 70 ) {
            result = 'C';
        } else if (avg >= 60) {
            result = 'D';
        } else {
            result = 'F';

/*
        switch (total / 30){  // switch((int)avg / 10)
            case 10:
            case 9: grade = 'A'; break;
            case 8: grade = 'B'; break;
            case 7: grade = 'C'; break;
            case 6: grade = 'D'; break;
            */
        }
        System.out.println(name + "님의 성적표 *****");
        System.out.println("국어 : " + kor +"  영어 : " + eng + "  전산 : " + com );
        System.out.printf("총점 : %d  평균 : %.2f  학점 : %c",total,avg,result);
    }
}
