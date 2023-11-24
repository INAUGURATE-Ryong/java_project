package day05.exam01;
// 1차원 배열
public class Array1_1 {
    public static void main(String[] args) {
        //1.
        char[] ch; // 배열선언
        ch = new char[4]; // 배열생성, 메모리에 할당

        //2.
        int num=3;
        char[] ch4 = new char[num]; // 이렇게 해도 되고, Scanner로 해도 됨.
        char[] ch2 = new char[4];  // 배열선언 및 생성
        //배열 초기화
        ch[0] = 'J';
        ch[1] = 'A';
        ch[2] = 'V';
        ch[3] = 'A';
        System.out.println(ch[0]); // J
        System.out.println(ch[3]); // A
        System.out.println("++++++++++++++++++++++++");
        for (int i = 0; i < 4; i++) {
            System.out.println("ch[" + i + "] = " + ch[i]);
        }

        System.out.println("+++++++++++++++++++++++++");
        //3.
        char[] ch3 = {'J', 'A', 'V', 'K', 'P'}; // char[] ch3 = new char[6];
        System.out.println("배열의 길이 : " + ch3.length); // 배열의 길이  5출력

        for (int i = 0; i < ch3.length; i++) {
            System.out.println("ch3[" + i + "] = " + ch3[i]);
        }
        System.out.println("+++++++++++++++++++++++++");

        String[] str = {"a", "keb", "cat", "dog"};
        for (int i = 0; i < str.length; i++) {
            System.out.println("str[" + i + "] = " + str[i]);
        }
        /*또 다른 초기화 방법
        char[] ch = { };
        char[] ch = new char[]{ };

         */
    }
}