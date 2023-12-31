package day13.quiz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//두개 정수 입력받고, 1개의 연산자 입력 받아서 사칙연산 프로그램 작성하기(IO로)
public class Quiz_IO {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
        System.out.print("숫자두개를 입력하세요");
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        System.out.println("부호를 입력하세요");
        String str = br.readLine();

        switch (str){
            case "+":
                System.out.println(a+b); break;
            case "-":
                System.out.println(a-b); break;
            case "*":
                System.out.println(a*b); break;
            case "/":
                while (b==0){
                    System.out.println("0으로 나눌 수 없습니다. 다시 입력하세요.");
                    System.out.println("b값을 다시 입력하세요.");
                    b = Integer.parseInt(br.readLine());
                }
                System.out.println((double)a/b); break;
            default:
                System.out.println("올바른 부호를 입력하세요.");

        }
    }
}
