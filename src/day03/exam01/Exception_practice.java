package day03.exam01;

import java.util.Scanner;

public class Exception_practice {
    public static void main(String[] args) {
        System.out.println("x,y = ");
        int x, y, result = 0;
        try {
            x = new Scanner(System.in).nextInt();
            y = new Scanner(System.in).nextInt();
            result = x / y ; // 문제 발생 소지 있는 코드
        } catch (Exception e) {  // 예외를 나타내는 객체 e
            System.out.println("0으로 나눌수 없습니다."); // user message
            System.out.println(e.getMessage());  // error message 출력
            e.printStackTrace();  // 어떤 예외가 발생했고 몇번쨰 줄에서 발생했는지 단계적으로 출력
        } // try end

    }

}


/*
public class Exception_practice {
    public static void main(String[] args) {
        int x = 30, y = 0;
        int result = 0;
        if ( y==0){
            System.out.println("0으로 나눌수 없습니다.");
            return;
        } else {
            result = x / y; // 예외발생
        }
        System.out.println(result);
    }
}

 */
/*
public class Exception_practice {
    public static void main(String[] args) {
        int x = 30, y=0;   //error 뜸 0 으로 나눌수 없어서
        int result  = x/y;
        System.out.println(result);
    }
}
*/

/*
Exception(예외처리)
Java는 의무적(반드시) 으로 예외처리를 해야하는 상황들이 있음
-- 네트워크 , 데이터베이스(JDBC), Thread, IO(입출력), File,…...

형식>
Try {
	정상코드(또는 예외발생예측코드);
} catch(Exception e) {
	예외 발생시 처리할 코드;
}

	1) try ~ catch : 직접처리 <----권장
	2) Throws : 위임
	3) Throw : 예외 던지기

 */