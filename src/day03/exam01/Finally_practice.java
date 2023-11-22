package day03.exam01;

import java.util.Scanner;

public class Finally_practice {
    public static void main(String[] args) {
        System.out.println("x,y = ");
        int x, y, result = 0;
        try {
            x = new Scanner(System.in).nextInt();
            y = new Scanner(System.in).nextInt();
            result = x / y ; // 문제 발생 소지 있는 코드
        } catch (ArithmeticException e) {  // 예외를 나타내는 객체 e
            System.out.println("ArithmeticException "); // user message
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Exception");
            e.printStackTrace();
        } finally {
            System.out.println("finally 무조건 처리됨!");
        }
    }
}
