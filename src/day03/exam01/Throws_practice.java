package day03.exam01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Throws_practice {
    public static void main(String[] args) throws ArithmeticException, InputMismatchException { // 예외처리 위임 throws Exception만 써도 상관은 없음
        System.out.println("x,y = ");
        int x, y, result = 0;
        x = new Scanner(System.in).nextInt();
        y = new Scanner(System.in).nextInt();

        result = x / y ; // 문제 발생 소지 있는 코드
        System.out.println(x + "/" + y +"=" + result);
    }
}
