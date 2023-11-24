package homework;

import java.util.Scanner;

//과제1] 1 + (1 + 2) + (1 + 2 + 3) + (1 + 2 + 3 + 4) + (1 + 2 + 3 + 4 + 5) = ? 35
//과제2] (-1) + 2 + (-3) + 4 + (-5) + ... + (-9) + 10 = ?   5
//과제3] 1/2 + 2/3 + 3/4 + 4/5 + 5/6 + 6/7 + 7/8 + 9/10 = ?  7.07
//과제4] 3개 정수 입력 받아서 큰 순으로 출력하기
public class Quiz03 {
    //과제1
    public static void main(String[] args) {
        int sum1 =0;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                sum1 +=j;
            }
        }

        int result = 0, total_result=0;
        for(int i = 1;i<=5;i++){
            result +=i;
            total_result +=result;
        }
        System.out.println(total_result);
        System.out.println(sum1);
        System.out.println("++++++++++++++++++++++++++++");

        //과제2
        int sum2 =0;
        for (int i = 1; i <=10; i++){
            if (i%2 !=0){
                sum2-=i;
            } else sum2+=i;
        }
        System.out.println(sum2);
        System.out.println("++++++++++++++++++++++++++++");

        //과제3
        double sum3 = 0.0;
        for (int i=1; i<=9;i++) {
            sum3 += (double) i / (i + 1);
        }
        System.out.printf("%.2f",sum3);
        System.out.println();
        System.out.println("++++++++++++++++++++++++++++");

        //과제4
        Scanner sc = new Scanner(System.in);
// 첫 번째 숫자 입력
        System.out.print("첫 번째 숫자를 입력하세요: ");
        int num1 = sc.nextInt();

        // 두 번째 숫자 입력
        System.out.print("두 번째 숫자를 입력하세요: ");
        int num2 = sc.nextInt();

        // 세 번째 숫자 입력
        System.out.print("세 번째 숫자를 입력하세요: ");
        int num3 = sc.nextInt();

        // 큰 순서대로 출력
        if (num1 >= num2 && num1 >= num3) {
            System.out.println("가장 큰 숫자: " + num1);
            if (num2 >= num3) {
                System.out.println("두 번째로 큰 숫자: " + num2);
                System.out.println("가장 작은 숫자: " + num3);
            } else {
                System.out.println("두 번째로 큰 숫자: " + num3);
                System.out.println("가장 작은 숫자: " + num2);
            }
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("가장 큰 숫자: " + num2);
            if (num1 >= num3) {
                System.out.println("두 번째로 큰 숫자: " + num1);
                System.out.println("가장 작은 숫자: " + num3);
            } else {
                System.out.println("두 번째로 큰 숫자: " + num3);
                System.out.println("가장 작은 숫자: " + num1);
            }
        } else {
            System.out.println("가장 큰 숫자: " + num3);
            if (num1 >= num2) {
                System.out.println("두 번째로 큰 숫자: " + num1);
                System.out.println("가장 작은 숫자: " + num2);
            } else {
                System.out.println("두 번째로 큰 숫자: " + num2);
                System.out.println("가장 작은 숫자: " + num1);
            }
        }
    }
}
/* [2번문제]
	//System.out.println("num = ");
		//int num = new Scanner(System.in).nextInt();
		int num = 10;

		if (num % 2 == 1) { // note 홀수
			int return_val = -(num / 2) - 1;
			System.out.println(return_val);
		} else {
			System.out.println( num / 2 );
		}
 */


/* [4번문제]
System.out.printf("3개의 숫자를 입력하세요: ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();		int b = sc.nextInt();		int c = sc.nextInt();

		int min, max, mid;

		if(a>b)	{
			max = (a>c) ? a : c;
			min = (b>c) ? c : b;
			mid = (max!=a  && min!=a)? a :
										  (max!=b  && min!=b) ? b : c;
		} else {
			max = (b>c) ? b : c;
			min = (a>c) ? c : a;
			mid = (max!=a  && min!=a)? a : (max!=b  && min!=b) ? b : c;
		} // if end

		System.out.println( max + " > " + mid + " > " + min );
 */