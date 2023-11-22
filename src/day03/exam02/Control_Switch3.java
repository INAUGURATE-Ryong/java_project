package day03.exam02;
import java.util.Scanner;

public class Control_Switch3 {
    public static void main(String[] args) {
        System.out.println("point = ");
        int point = new Scanner(System.in).nextInt();
        switch (point) { // 조건 - 문자형, 정수형(long 형 제외), 실수형 안됨
            case 1:
                System.out.println("집 "); //break;  누적해서 상품을 주려는 경우에는 break를 안쓰면된다. 1누르면 집 피아노 우산 다나옴
            case 2 :
                System.out.println("피아노 "); //break;
            case 3:
                System.out.println("우산 "); //break;
        }  //swith end
        System.out.println("상품에 당첨 되셨습니다. 축하.");
    }
}



/* package day03.exma02;
import java.util.Scanner;

public class Control_Switch3 {
    public static void main(String[] args) {
        System.out.println("도시를 선택하세요 (s,d,b,j) = ");
        String ch = new Scanner(System.in).next();

        switch (ch) { // 조건 - 문자형, 정수형(long 형 제외), 실수형 안됨
            case "s" :
                System.out.println("서울"); //break;
            case "d":
                System.out.println("대구"); //break;
            case "b":
                System.out.println("부산"); //break;
            case "j":
                System.out.println("제주"); //break;
        }  //swith end
        System.out.println("를(을) 선택하셨습니다.");
    }
}
 */