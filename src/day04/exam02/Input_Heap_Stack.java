package day04.exam02;

import java.util.Scanner;

public class Input_Heap_Stack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("name, str input :");
//        String name1 = sc.next();  // 공백을 인식 못해서 만약 안 우 용 이라 입력하면 '안'만 출력
//        System.out.println(name1);
//        String name2 = sc.nextLine();
//        System.out.println(name2); // 공백까지 인식을 하여 안 우 용 이라 입력하면 안 우 용 출력
//        String name = sc.nextLine();
//        int su = sc.nextInt();
//        System.out.println(su + "," + name);  // 출력이 잘 됨. (문자 먼저 받고 숫자 받으면)
        int su2 = sc.nextInt();
        String name2 = sc.nextLine(); // next()는 됨.
        System.out.println(su2 + "," + name2);  // 숫자를 먼저 받으면 문자를 받기 전에 출력이 되어 버림.
        // 버퍼에 숫자와 화이트스페이스가 있는데, 화이트스페이스도 문자로 인식받아서 화이트스페이스가 영역에 올라가서 출력이 되는거임.


/*        System.out.println("정수 데이터 입력 요망 :");
        Scanner sc = new Scanner(System.in); // 객체생성, 메모리할당, 생성자함수 자동호출

        System.out.println("int, double, char date input:");
        int x = sc.nextInt();
        double y = sc.nextDouble();
        char ch = sc.next().charAt(0);

        System.out.println(x + "," +y+","+ch);*/


     /*   int x = 3, y =3 ;
        if(x==y) System.out.println("same");
        else System.out.println("not same");

        // == 는 스택영역(실제 데이터 있는) 비교,
        // String자체는 new 라는 스택영역에 들어가지만
        // String으로 변수를 받으면 힙영역에는 문자열이 있고 스택영역에는 주소값이 있어서 == 로 하면 값이 다르다고 나옴.
        // 그래서 비교해주는 함수를 밑에처럼 써야 함.


        String s1 = new String("Korea");
        String s2 = new String("Korea");

        if(s1.equals(s2)) System.out.println("same"); //if(s1 == s2) System.out.println("same");
        // if(s1.equalsIgnoreCase(s2)) System.out.println("same"); // 대소문자 비교 안함
        else System.out.println("not same");*/
    }
}
