package day13.IO_1;

import java.io.InputStream;

public class MainEnrty {
    public static void main(String[] args) {
        InputStream is = System.in; // 표준 입력
        try {
            System.out.println("단일 문자 입력 : "); //abcde 를 입력하면 단일문자만 받을 수 있기에 a에 대한 아스키코드 출력
//            int num = is.read(); // 예외발생, '0' ~ '9' : 48 ~ 57 (ASCII code)
//            int num = is.read() -48; //숫자 입력시 그 숫자 반환, 근데 0~9까지만 가능
//            int num2 = is.read() -48;
//            System.out.println(num+num2);  // 화이트스페이스 때문에 두번째 값 받지 못하고 컴파일 끝남.
            int num = is.read();
            is.read(); is.read(); // 화이트 스페이스 잡기위해 쓰는건데, 단일문자는 2바이트이기에 두번써야함.
            int num2 = is.read();
            System.out.println(num+num2);
        } catch (Exception e){
            e.printStackTrace();
        }
    }

}
