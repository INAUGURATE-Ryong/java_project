package development_Quiz.quizScore;

import java.util.Scanner;
// 주석 되어있는것들끼리 짝꿍 get,set 활용없이 함수들 여러개 생성해서 할때.
// 주석 풀려있는건 get, set 활용해서 진행할 떄!
public class MainEntry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Score score = new Score(30,40,50,"ddd");  // 이건 생성자 함수에 make도 넣거나 make를 빼고 main에서 make를 선언해야함.
//        score.name();
//        score.scores();
//        score.total();
//        score.average();
//        score.grade();
//        score.result();
//        System.out.println("이름을 입력하세요");
//        score.setName(sc.next());
//        System.out.println("국어점수를 입력하세요");
//        score.setKor(sc.nextInt());
//        System.out.println("영어점수를 입력하세요");
//        score.setEng(sc.nextInt());
//        System.out.println("전산점수를 입력하세요");
//        score.setCom(sc.nextInt());
//
     //   score.make();
        score.result();




    }
}
