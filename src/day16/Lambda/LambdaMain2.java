package day16.Lambda;
interface Message2{
    int something(int x); // int 형태, parameter
}

class Person2{
    public void greeting(Message2 msg){
        int su =  msg.something(80);
        System.out.println("Number is : " + su);
    }
}
public class LambdaMain2 {
    public static void main(String[] args) {
        Person2 p = new Person2();
        p.greeting(new Message2() {  // 일반 상태 (return 타입)
            @Override
            public int something(int x) {
                System.out.println("parameter value : " + x);
                return 100;
            }
        });
        System.out.println("=================================");
//        p.greeting((x)->{  // Lambda식 () -> {}
        p.greeting(x->{  // 매게변수가 1개이면 괄호 생략 가능.
            System.out.println("parameter value : " + x);
            return x;
        });

        p.greeting(x-> 9999);
    }
}
