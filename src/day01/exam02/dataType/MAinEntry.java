package day01.exam02.dataType;

public class MAinEntry {
    public static void main(String[] args) { // 시작점(진입점)
        int su = 9;
        char ch = 'A'; //단일문자는 ''
        String str = "korea";
        double d = 12.34;
        float f = 12.34f;
        long num = 9;

        System.out.println(su + "," + ch + "," +str);

        System.out.println(100);  // int타입 (디폴트)
        System.out.println(100L);  // 강제로 long타입으로 변환

        System.out.println(3.5); // double 타입 (디폴트)
        System.out.println(3.5f);  // 강제로 float로 변환

        System.out.println(su);
        System.out.println(ch);
        System.out.println(str);
        System.out.println(d);

        //   int su2 지역변수는 반드시 아래처럼 초기화(초기값설정)하고 사용한다.
        int su2 = 100;

        int x =2; //기본자료형
        Integer y=2; //참조형
        x=y;




    } // end main
} // end class


/*
package ex02.basic;

public class MAinEntry {
    public static void main(String[] args) {
      //  System.out.print("hello java");
        System.out.println("hello java");
    }
}
*/
