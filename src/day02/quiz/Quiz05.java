package day02.quiz;

import java.util.Scanner;

// 다른방법
public class Quiz05 {
    public static void main(String[] args) {
        System.out.println("year = ");
        int year = new Scanner(System.in).nextInt();
        String result = null;
        boolean flag = false;

      /*  밑에 if문 간단히
      if (( year % 4 == 0) && ( year % 100 == 0 || year % 400 == 0 ) ) {
            flag = true;
        }  */


        if (year % 4 == 0 ) {
            if ( year % 100 == 0 || year % 400 == 0 ) {
                flag = true;
            }// if end
        } // if end

        result = (flag == true) ? "윤년" : "평년";
        System.out.println(year + "연도" + result);
    }
}



/*import java.util.Scanner;

// 년도 입력받아서 윤/평년 판정 프로그램 작성
// 년도를 4,100,400 으로 나누었을 떄 0이아니어야 윤년
public class Quiz02 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("년도를 입력하세요");
        int year = sc.nextInt();

        if (year %4 ==0) {
            if(year %100 ==0 && year % 400==0 ){
                System.out.println("윤년입니다.");
            } else if (year %100 ==0 && year % 400 !=0) {
                System.out.println("평년입니다.");
                } else {
                System.out.println("윤년입니다.");
            }
        } else {
            System.out.println("평년입니다.");
               }
        }
    }*/

/*  하드코딩
import java.util.Scanner;

public class Quiz02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("년도를 입력하세요: ");
        int year = sc.nextInt();

        if (year % 4 == 0) {
            if ((year % 100 != 0) || (year % 400 == 0)) {
                System.out.println("윤년입니다.");
            } else {
                System.out.println("평년입니다.");
            }
        } else {
            System.out.println("평년입니다.");
        }
    }
}

 */


