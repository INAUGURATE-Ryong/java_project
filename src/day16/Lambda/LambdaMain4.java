package day16.Lambda;
//타입을 써야 할 상황
interface Message4{
    void something(int x,int y); // int 형태, parameter
//    void good(int x);
}
interface Talk{
    void something(String x, String y);  // functional interface
}

class Person4{
    public void greeting(Message4 msg){
        msg.something(1,2);
    }
    public void greeting(Talk msg){
        msg.something("Hello","world");
    }
}
public class LambdaMain4 {
    public static void main(String[] args) {
        Person4 p = new Person4();
        p.greeting(new Message4() {  // 일반 상태 (return 타입)
            @Override
            public void something(int x,int y) {
                System.out.println("parameter value : " + x+" ,"+y);
            }
        });
        System.out.println("=================================");
        char ch = 'A';
//        p.greeting((int x,int y)->{  // Lambda식 () -> {}
        p.greeting( (String x, String y) -> {
            System.out.println("parameter value : " + x+" ,"+y);
            System.out.println(ch);

//            ch = 'B'; // 람다는 값 변경 불가.
            num = 2222;
            System.out.println(num); // static 변수값은 변경 가능.
        });
    }
    static int num = 30;
}
