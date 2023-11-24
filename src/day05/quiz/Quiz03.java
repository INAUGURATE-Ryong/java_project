package day05.quiz;

import java.util.Scanner;

public class Quiz03 {
    public static void main(String[] args) {
        //문제1] 업/다운 게임 프로그램 작성(난수 이용)
        //1~100 숫자 중에서 임의의 난수 추출해 놓고, 사용자는 5번의 기회를 줘서 입력 받는다.
        //그 입력 받은 숫자와 추출한 난수가 같은지를 판정하는 프로그램 작성
//        int a = (int) (Math.random() * 100 + 1);
//        Scanner sc = new Scanner(System.in);
//        for (int i = 1; i < 6; i++) {
//            System.out.println("숫자를 입력하세요");
//            int b = sc.nextInt();
//            if (a > b) {
//                System.out.println("up!");
//            } else if (a < b) {
//                System.out.println("down");
//            } else {
//                System.out.println("정답");
//            }
//        }
//        System.out.println("틀렸습니다. 정답은"+a+"입니다.");
        //1~45중에서 6개 숫자 출력
        // 같은 수 나오지 않게
        int[] lotto = new int[6];
        for (int i = 0; i < 6; i++) {
            int pick = (int) (Math.random() * 45 + 1);
            lotto[i] = pick;
            for (int j = 0; j < i; j++) {
                if (lotto[j] == pick) {
                    i--;
                    break;
                }
            }

        }
        System.out.println("------------------------------------");
        for (int i = 0; i < lotto.length; i++) { // row
            System.out.print(lotto[i] + "\t");

        }
        System.out.println();

    }
}

/*
public class RandomQuiz02 {

    public static void main(String[] args) {

        int[] lotto = new int[6];

        Random rand = new Random();

        for(int i=0;i<6;i++){
            int pick = rand.nextInt(45) + 1;
            lotto[i] = pick;
            for(int j=0;j<i;j++){
                if(lotto[j] == pick){
                    i--;
                    break;
                }
            }
        }

        for(int k: lotto)
            System.out.print(k + "\t");
        System.out.println();

    }
}
 */