package homework;

import java.util.Scanner;

//사칙연산 프로그램 작성(예외처리하기)
//숫자 2개 입력 받고, 연산자(+,-,*,/) 1개 입력 받아서 <----string, char
public class Quiz01 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 두개를 입력하세요");
        int a = sc.nextInt();
        int b = sc.nextInt();
        double result = 0;

        System.out.print("계산할 사칙연산을 입력하세요");
        char oper = sc.next().charAt(0);

        switch (oper) {
            case '+':
                result = a+b; break;
            case '-' :
                result = a-b; break;
            case '*':
                result = a*b; break;
            case '/':
                if (b !=0){
                    result = (double) a/b;
                } else {
                    System.out.println("0으로 나눌 수 없습니다."); return;
                }
                break;
            default:
                System.out.println("숫자를 입력하세요");
                return;
        }
        System.out.printf("%d %c $d = %.2f",a,oper,b,result);
    }
}
