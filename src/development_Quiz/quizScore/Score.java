package development_Quiz.quizScore;

import java.util.Scanner;

//3과목 입력 받고 총점, 평균, 학점(if,switch) 구하기
public class Score {
    //멤버변수
    private int kor, eng, com, total;
    private String name;
    private char grade;
    private double avg;
    //생성자 함수


    public Score() {
    }

    public Score(int total, char grade, double avg) {
        this.total = total;
        this.grade = grade;
        this.avg = avg;
    }

    public Score(int kor, int eng, int com, String name) {
        this.kor = kor;
        this.eng = eng;
        this.com = com;
        this.name = name;
        make();
    }


//getter,setter

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getCom() {
        return com;
    }

    public void setCom(int com) {
        this.com = com;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    //output
//    public void name() {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("이름을 입력하세요");
//        name = sc.next();
//    }
//    public void total() {
//        total = kor+eng+com;
//    }
//
//    public void average() {
//        avg =  (double)total / 3;
//    }
//
//    public void grade() {
//        if (avg <= 100 && avg >= 90) {
//            grade = 'A';
//        } else if (avg >= 80) {
//            grade = 'B';
//        } else if (avg >= 70) {
//            grade = 'C';
//        } else if (avg >= 60) {
//            grade = 'D';
//        } else {
//            grade = 'F';
//
//        }
//    }

//    public void scores() {
//        Scanner sc = new Scanner(System.in);
//        do {
//            System.out.println("국어 점수를 입력하세요(0~100) = ");
//            kor = sc.nextInt();
//        } while (kor < 0 || kor > 100);
//        do {
//            System.out.println("영어 점수를 입력하세요(0~100) = ");
//            eng = sc.nextInt();
//        } while (eng < 0 || eng > 100);
//        do {
//            System.out.println("전산 점수를 입력하세요(0~100) = ");
//            com = sc.nextInt();
//        } while (com < 0 || com > 100);
//    }

    public void make() {
        total = kor+eng+com;
        avg =  (double)total / 3;
        if (avg <= 100 && avg >= 90) {
            grade = 'A';
        } else if (avg >= 80) {
            grade = 'B';
        } else if (avg >= 70) {
            grade = 'C';
        } else if (avg >= 60) {
            grade = 'D';
        } else {
            grade = 'F';

        }
    }
    public void result(){
        System.out.println(name + "님의 성적표 *****");
        System.out.println("국어 : " + kor +"  영어 : " + eng + "  전산 : " + com );
        System.out.printf("총점 : %d  평균 : %.2f  학점 : %c",total,avg,grade);
    }
}
