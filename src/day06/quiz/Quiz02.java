package day06.quiz;

import java.util.Arrays;

public class Quiz02 {
    public static void main(String[] args) {
        int  [][] score = { { 98, 98, 90, 92, 99 },
                            { 81, 82, 83, 84, 85 },
                            { 71, 73, 75, 77, 79 },
                            { 60, 65, 60, 65, 69 },
                            { 77, 74, 79, 78, 72 } };
        int sum = 0;
        double avg = 9;
        for (int i=0;i<score.length;i++){
            for(int j=0;j<score[0].length;j++){
                sum+=score[i][j];

            }
        }
        avg = (double) sum /( score.length * score[0].length);
        System.out.println("합계 : "+sum);
        System.out.printf("평균 : %.2f",avg);
    }
}
