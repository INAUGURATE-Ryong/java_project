package day10.API_Wrapper;
class Poiont{  }
public class MainEntry {
    public static void main(String[] args) {
        Integer ia = new Integer(9);
        Integer ib = new Integer("9");
        String su ="30";
        int x = 10;
        Poiont pt = new Poiont();

        System.out.println(pt); //주소 출력
        System.out.println(pt.toString());
        System.out.println(pt.hashCode());
        System.out.println();

        System.out.println(ia);  // 실제 가지고 있는 데이터 출력
        System.out.println(ia.hashCode());
        System.out.println(ia.getClass().getName()+'@'+Integer.toHexString(ia.hashCode()));

        // Boxing vs UnBoxing
        int y =5;
        double d =3.3;
//        d=y; //  묵시적 형변환
        y =(int)d; // 명시적 형변환  에러뜨니까 d앞에 int 붙여줘야함
        int c = ia.intValue();  // 힙영역에 있던 ia를 스택영역에 넣는다. 버전4 이전엔 이렇게 메소드를 활용해서 넣어야 한다.
        int e  =ia; // 버전 5 이후에는 메소드를 따로 쓰지 않아도 됨. autoboxing, unboxing 가능
        int num = Integer.parseInt(su);  // 문자를 숫자로 변환

        System.out.println(c+num);
        System.out.println(c+e);
        System.out.println(ia.MAX_VALUE);
        System.out.println(ia.MIN_VALUE);

        Double dd = new Double(12.34);
        System.out.println(dd.MAX_VALUE);
        System.out.println(dd.MIN_VALUE);

        System.out.println(Float.MAX_VALUE);
        System.out.println(Float.MIN_VALUE);

        c = (int)dd.doubleValue();
        System.out.println("형변환한 c의 값은? " + c);  // 소수점 사라짐.

        int f = Integer.parseInt("123");  // 문자를 숫자로
        int g = Integer.parseInt("1111111",2);  // 이진수 문자열을 10진수 정수로 변환
        System.out.println(f);
        System.out.println(g);

        int h = 3; // stack memory
        Integer i =new Integer(3); // heap memory

        System.out.println(Integer.toOctalString(10));  // 10진수를 8진수로
        System.out.println(Integer.toHexString(10));  // 10진수를 16진수로
        System.out.println(Integer.toBinaryString(10)); // 10진수를 2진수로
    }
}

/*
Wraper class : 기본 자료형에 대응되는 클래스형 자료형
   기본 자료형    클래스형(레퍼런스 또는 참조형)자료형
    int 			Integer
    float			Float
    char			Character
    double		    Double
    ....			....
 */