package day03.exam01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_MultiCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("정수 두개 입력해주세요");
            System.out.println("integer 1 >"); int num1 = sc.nextInt();
            System.out.println("integer 2 >"); int num2 = sc.nextInt();
            System.out.println("num1 / num2= "+(num1 / num2));
        } catch (InputMismatchException  e) {
            System.out.println("InputMismatchException");
            System.out.println("올바른 숫자를 입력하세요.");  //정수형이 아닌 숫자나 문자를 넣으면 이 예외에 걸린다.
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
            System.out.println("0으로 나눌 수 없습니다."); // 0으로 나눌수 없는 상황이면 이 예외에 걸린다.
        } catch (Exception e) {
            System.out.println("Exception");
            System.out.println("0으로 나눌 수 없습니다.");
        }
    }
}
