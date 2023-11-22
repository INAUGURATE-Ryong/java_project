package day02.exma03;
import java.util.Scanner;
public class Control_If3 {
    public static void main(String[] args) {
        System.out.print("값을 입력하세요");
        int su = new Scanner(System.in).nextInt();

        if(su % 2 ==0) {
            System.out.println(su + " : 짝수");
            if(su > 0) {
                System.out.println(su + " : 양수");
            } else if (su < 0 ) {
                System.out.println(su + " : 음수");
            } else {
                System.out.println(su + " : 0이다.");
            }
        } else {
            System.out.println(su + " : 홀수");
            if(su > 0) {
                System.out.println(su + " : 양수");
            } else if (su < 0 ) {
                System.out.println(su + " : 음수");
            } else {
                System.out.println(su + " : 0이다.");

            }
        }
    }
}

