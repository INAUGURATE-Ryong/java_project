package day05.quiz;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz02 {

    public static void main(String[] args) {
        // 임의의 숫자 2차원배열에 담고 총합 구하기
       Scanner sc = new Scanner(System.in);
//        int [][] a = new int[2][3];
//        int sum = 0;
//
//        for (int i =0; i < a.length; i++){
//            for(int j=0; j<a[i].length;j++){
//                System.out.println((i+1)+"행"+(j+1)+"열 숫자를 입력하세요.");
//                a[i][j] = sc.nextInt();
//                sum+=a[i][j];
//            }
//
//        }
//        System.out.println(sum);
        // 3행 4열짜리 2차원배열을 만드는데 1행 1열과 2행1열의 값의 합을 3행1열에 넣어라.

        int[][] b = new int[3][4];
        for (int i = 0; i < b.length ; i++) {
            for (int j = 0; j < b[i].length; j++) {
                if(i==2){
                    b[2][j] = b[0][j] +b[1][j];
                } else {
                    System.out.println((i + 1) + "행" + (j + 1) + "열 숫자를 입력하세요.");
                    b[i][j] = sc.nextInt();
                }
            }
        }
        System.out.println();
        //output
        System.out.println("------------------------------------");
        for (int i = 0; i < b.length; i++) { // row
            for (int j = 0; j < b[i].length; j++) { // col
                System.out.print(b[i][j] + "\t");
            }
            System.out.println();
        }

        // 3행 4열짜리 2차원배열을 만드는데 1행 1열, 1행2열,1행3열의 값의 곱을 1행 4열에 넣어라.
    }
}
/* 민우님 코드
package day05_array.quiz;
import java.util.Scanner;
public class QuizEx4 {
	public static void main(String[] args) {
//		int[][] a = new int[][]{{7,2,1,3},{10,8,9,7},{0,0,0,0}};
		int[][] a = new int[3][4];
		Scanner sc = new Scanner(System.in);

		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[0].length; j++) {
				if(i != a.length - 1) a[i][j] = sc.nextInt();
				else {
					for(int k = 0; k < a.length - 1; k++) {
						a[i][j] += a[k][j];
					}
				}
			}
		}
		for(int[] i : a) {
			for(int j : i) {
				System.out.printf("%3d", j);
			}
			System.out.println("");
		}
	}
}

 */

/* 옆으로 채워지기
package day05_array.quiz;
import java.util.Scanner;
public class QuizEx4 {
	public static void main(String[] args) {
//		int[][] a = new int[][]{{7,2,1,3},{10,8,9,7},{0,0,0,0}};
		int[][] a = new int[3][4];
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[0].length - 1; j++) {
				System.out.printf("input a[%d][%d] = ", i, j);
				a[i][j] = sc.nextInt();
				sum += a[i][j];
			}
			a[i][a[0].length - 1] = sum;
			sum = 0;
		}

		for(int[] i : a) {
			for(int j : i) {
				System.out.printf("%3d", j);
			}
			System.out.println("");
		}
	}
}
 */