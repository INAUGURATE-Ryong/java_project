package day02.exam01;

public class Operator03 {
    public static void main(String[] args) {
        //대입(배정)연산자 : =, +=, -=, *=, /=, >>=, <<=, %=....
        int x =3, y=5,result;
        result = x+y;
        System.out.println(result);

        x = x*y;  // x+=y 로 치환가능
        x = x*y; // x*=y

        x = x+1;  //  x +=1; ,   x ++; 셋 다 같은말.



    }
}


/*
package day02.exam01.operator;

public class Operator03 {
    public static void main(String[] args) {
        //삼항(조건) 연산자 :  (조건) ? 참 : 거짓;
        int x = 20, y = 10;
        String msg = null; //msg = ""

        msg = (x != y) ? "not same" : "same";
        System.out.println(msg);

        int a = 10, b = 20, c=30, result;
        result = (a > b)? a: (b>c) ? b: c;
        System.out.println(result);
    }
}
*/
