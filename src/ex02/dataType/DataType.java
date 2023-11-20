package ex02.dataType;

public class DataType {
    public static void main(String[] args){
        char ch = 'A'; // ASCII code

        System.out.println(ch + ", ASCII code =" + (int)ch);
        System.out.println('B');
        System.out.println((int)'b');

        int num = 9; // 10진수
        int xNum = 0x9; // 16진수 (0x 숫자)
        int oNum = 011; // 8진수 (0 숫자)
        int bNum = 0B1010; // 2진수  (ob숫자)

        System.out.printf("%x %X \n",10,10);  // 10진수, 10진수를 16진수로
        System.out.printf("%x %o \n",10,10);  // 10진수, 10진수를 8진수로

    }
}



/*
package ex02.dataType;

public class DataType {
    public static void main(String[] args){
        short sh = -32768;
        int su = 32769;

        su = sh; // 묵시적(자동) 형변환
        sh = (short)su; // 명시적 형변환 - 데이터 손실 발생
    }
}
*/
