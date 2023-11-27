package development_Quiz;

import java.util.Scanner;
 //성적처리 프로그램 함수로 만들기
//   입력 함수 input()  - 이름 , 국어, 영어,전산 점수
//   총점 함수 total(~~~) - 총점 구하는 함수
//   평균 함수 average( ~~ ) - 평균 구하는 함수
//   평점(학점) grade( ~~ ) - 학점 구하는 함수
//   출력 함수 output( ) - 결과 출력하는 함수
public class Score_dev1_Method {
     public static void input() {
         Scanner sc = new Scanner(System.in);
         System.out.println("성적을 입력할 학생 이름을 입력하세요.");
         String name = sc.next();
         int kor,eng,com = 0;
         do {
             System.out.print("국어 점수를 입력하세요(0~100) = ");
             kor = sc.nextInt();
         } while (kor < 0 || kor > 100);
         do {
             System.out.print("영어 점수를 입력하세요(0~100) = ");
             eng = sc.nextInt();
         } while (eng < 0 || eng > 100);
         do {
             System.out.print("전산 점수를 입력하세요(0~100) = ");
             com = sc.nextInt();
         } while (com < 0 || com > 100);
         int total = total(kor, eng, com);
         double avg = average(total);

         char grade = grade(avg);

         System.out.println();
         print_score(name, kor, eng, com, total, avg, grade);

     }
     public static int total(int kor,int eng,int com) {
         int total = kor + eng + com;
         return total;
     }
     public static double average(int total) {
         return (double) total /3;
     }

     public static char grade(double avg) {
         if(avg >= 90) {
             return  'A';
         }else if(avg >= 80) {
             return  'B';
         }else if(avg >= 70) {
             return  'C';
         }else if(avg >= 60) {
             return  'D';
         }else {
             return  'F';
         }
     }
     public static void print_score(String name, int kor, int eng, int com, int total, double avg, char grade) {
         System.out.println(name + "님의 성적표 *****");
         System.out.println("국어 : " + kor + " 영어 : " + eng + " 전산 : " + com);
         System.out.println("총점 : " + total + " 평균 : " + avg + " 학점 : " + grade);
     }

     public static void main(String[] args) {
         input();
     }

 }