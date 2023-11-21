package day02.exam01;

public class Operator01 {
    public static void main(String[] args) {
        //shift 연산자 : <<, >>, >>> ...
        int x = 8, result, result1;
        result = x <<2; //left shift
        // 8비트자리에 8을 표시하면 00001000 인데 2비트를 왼쪽으로 밀어서 00100000 32로 바뀜
        result1 = x >> 3; // right shift
        // 8비트자리에 8을 표시하면 00001000 인데 3비트를 오른쪽으로 밀어서 00000001 1로 바뀜

        System.out.println(result);
        System.out.println(result1);

    }
}

/*public class Operator {
    public static void main(String[] args) {
        int x= 10,y;
        y=~x; // 비트부정 -(원래값 +1) ==> 결과
        System.out.println("x=" + x + ", y=" + y);
    }

}*/

/*public class Operator {
    public static void main(String[] args) {
        //단항연산자 :  증감 => ++, --, ~, ...
        int x = 10, y;
        y = x++; // .후의연산 : 대입먼저,연산나중
        System.out.println("x=" + x + ", y=" + y);
    }
}*/
