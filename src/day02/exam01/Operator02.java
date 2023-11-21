package day02.exam01;
public class Operator02 {
    public static void main(String[] args) {
        //논리연산자 : &(and), |(or), ^(xor) 2진 논리 ==> 결과 : 값
        int x=4,y=7;
        System.out.println(x&y);  // 4는 0100 이고  7은 0111 이기에 and 연산자하면 0100이기에 4출력
        System.out.println(x|y); //  4는 0100 이고  7은 0111 이기에 or 연산자하면 0111이기에 7출력
        System.out.println(x^y); //  4는 0100 이고  7은 0111 이기에 xor 연산자하면 0011이기에 3출력

        //논리연산자 : &&(and), ||(or), ! (not) 10 논리 ==> 결과 : 참or거짓
        int a=10,b=20,c=30;
        boolean result1 = true;
        boolean result2 = true;
        boolean result3 = true;

        result1 = (a>b) && (b>c) ; // '&&'연산은 앞에 것이 '거짓'이면 뒤는 수행x
        System.out.println("&& :" + result1);
        result1 = (a<b) && (b>c) ; //
        System.out.println("&& :" + result1);
        result2 = (a<b) || (b>c) ; // '||' 연산은 앞에 것이 '참'이면 뒤는 수행x
        System.out.println("|| :" + result2);
        System.out.println("! :" +!result3);

    }

}


/*public class Operator02 {
    public static void main(String[] args) {
        // 관계연산자 : >, <, >=, <=, ==, !=
        // 0,0.0,null 를 제외한 모든 값은 '참'이다.
        int x = 3, y = 5;
        boolean flag = true;
        System.out.println(!flag); // t ->f 로 f -> t

        if(x > y){ // 값이 같을 때  > 상황이면  else로 가고  >=이런 상황이면 true 쪽으로 간다.
            System.out.println("max:" +x);
        } else{
            System.out.println("max:" +y);

        }
    }

}*/
