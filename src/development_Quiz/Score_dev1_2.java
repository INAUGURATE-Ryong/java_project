package development_Quiz;

import java.util.Scanner;

//3과목 입력 받고, 총점, 평균, 학점(if or switch) 구하기
// do ~ while 을 이용해서 점수를 0~ 100점 까지만 입력할 수 있게 기능 추가
// ??명의 ??과목 입력받고, 총점, 평균, 학점 을 구하는데 배열을 활용하기(2차원배열)
public class Score_dev1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // 객체 생성, 메모리에 할당, 생성자 함수 자동 호출
        System.out.println("성적을 입력할 인원수 및 과목수를 입력하세요.");
        int people = sc.nextInt(); //인원수 입력
        int subject = sc.nextInt(); // 과목
        int [][] list = new int[people][subject+1]; // 인원수, 과목수, 총점
        int total = 0;
        double[] avg = new double[people];
        String[] name = new String[people];

        //input & process(처리/계산)
        for (int i = 0; i < people; i++) {
            System.out.print(((i + 1) + "번째 학생 이름을 입력하세요"));
            name[i] = sc.next();
            for (int j = 0; j < subject; j++) {
                System.out.print(name[i] + "의" +(j+1)+"번째 성적을 입력하세요.");
                list[i][j] = sc.nextInt();
                total += list[i][j];
            }
            list[i][subject] = total;
            total = 0;
            avg[i] = (double) list[i][subject] / subject;
        }
        char [] result = new char[people];
        for (int i = 0; i < people; i++) {

            if (avg[i] <= 100 && avg[i] >= 90) {
                result[i] = 'A';
           } else if (avg[i] >= 80) {
              result[i] = 'B';
            } else if (avg[i] >= 70) {
             result[i] = 'C';
            } else if (avg[i] >= 60) {
                result[i] = 'D';
           } else {
                result[i] = 'F';
            }

       }
        for (int i = 0; i < people; i++) {
            System.out.println(name[i] + "님의 성적표 *****");
            for (int j = 0; j < people; j++) {
                System.out.print((j+1)+"번째 과목 점수 : "+list[i][j]+"\t");

            }
            System.out.printf("총점 : %d  평균 : %.2f  학점 : %c", list[i][subject], avg[i], result[i]);
           System.out.println();
        }

    }
}

