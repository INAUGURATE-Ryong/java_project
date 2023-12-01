package day10.API_String;

import day08.inheritance1.Point;

public class MainEntry {
    public static void main(String[] args) {
        String str = "abc";
        System.out.println("str : " + str);
        char ch = str.charAt(0);
        System.out.println(ch);
        System.out.println(str.charAt(2)); //c


        char data[] = {'a', 'b', 'c'};
        str = new String(data);
        System.out.println("str : " + str);
        System.out.println("kbs");

        String msg = "dasdasgasdasdasd13";
        System.out.println("en-" + msg);
        System.out.println(msg);

        String str2 = "abcd".substring(2);
        ;// index 2부터 끝까지 출력
        System.out.println(str2);

        str2 = "abcdefsgsdasd".substring(2, 5); // index 2포함 index 5미포함
        System.out.println(str2);

        System.out.println(msg + ":" + str2);

        String s1 = new String("encore");  //  String 클래스는 똑같은 글자는 똑같은 주소를 가르킴.
        String s2 = new String("encore");
        System.out.println("s1.hashcode() : " + s1.hashCode());  // 힙영역의 글자가 들어있는 주소
        System.out.println("s2.hashcode() : " + s2.hashCode());

        Point p1 = new Point();
        Point p2 = new Point();
        System.out.println("p1.hashcode() : " + p1.hashCode());
        System.out.println("p2.hashcode() : " + p2.hashCode());

        String s3 = "seoul";
        String s4 = "seoul";

        if (s3 == s4) System.out.println("same");
        else System.out.println("not same");
        System.out.println("---------------------------");
        if (s1 == s2) System.out.println("same");  // 스택에 있는 s1, s2의 주소를 비교 그래서 값 비교하려면  equals써야함
        else System.out.println("not same");

    }
}