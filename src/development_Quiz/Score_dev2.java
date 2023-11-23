package development_Quiz;

import java.util.Scanner;

//3과목 입력 받고, 총점, 평균, 학점(if or switch) 구하기
// do ~ while 을 이용해서 점수를 0~ 100점 까지만 입력할 수 있게 기능 추가
// 한명이 아닌 여러명의 성적표를 기입해서 출력하는 기능 추가
public class Score_dev2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // 객체 생성, 메모리에 할당, 생성자 함수 자동 호출

        int kor, eng, com, total = 0;
        double avg = 0;
        String name = null;

        while (true) {

            System.out.print("이름을 입력하세요");
            name = sc.next();

            do {
                System.out.println("국어 점수를 입력하세요(0~100) = ");
                kor = sc.nextInt();
            } while (kor < 0 || kor > 100);
            do {
                System.out.println("영어 점수를 입력하세요(0~100) = ");
                eng = sc.nextInt();
            } while (eng < 0 || eng > 100);
            do {
                System.out.println("전산 점수를 입력하세요(0~100) = ");
                com = sc.nextInt();
            } while (com < 0 || com > 100);

            total = kor + eng + com;
            avg = total / 3.0;

            char result = ' ';


            if (avg <= 100 && avg >= 90) {
                result = 'A';
            } else if (avg >= 80) {
                result = 'B';
            } else if (avg >= 70) {
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
            System.out.println("국어 : " + kor + "  영어 : " + eng + "  전산 : " + com);
            System.out.printf("총점 : %d  평균 : %.2f  학점 : %c", total, avg, result);
            System.out.println();
            System.out.println("학생 성적을 더 입력하시겠습니까(y/n)");
            char yesno = new Scanner(System.in).next().charAt(0);
            if (yesno == 'n' || yesno == 'N') break; //탈출구문

        }

    }
}

/*

만일 y/n를 char가 아닌 String으로 할 때 코드
String flag = ""; //위에 선언
flag = sc.next(); // String

if (flag.equls("n") || flag.equls("N")) break;
if (flag.equalsIgnoreCase("n")) break;  // 대소문자 무시
if (toUpperCase().equals("N")) break;  //대문자로 바꿔서 비교
if (toLowerCase().equals("n")) break;  // 소문자로 바꿔서 비교
*/
