package day02.exam02;
import java.util.Scanner;  // 패키지 임포트하기 : import

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("값을 입력해주세요 : ");
        int su = sc.nextInt();
        System.out.println(su);
        System.out.print("이름을 입력해주세요 : ");
        String name = sc.next();
        System.out.println(name);

    }
}
