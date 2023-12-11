package day16.Lambda;
interface Message3{
    int something(int x,int y); // int 형태, parameter
}

class Person3{
    public void greeting(Message3 msg){
        int su =  msg.something(1,2);
        System.out.println("Number is : " + su);
    }
}
public class LambdaMain3 {
    public static void main(String[] args) {
        Person3 p = new Person3();
        p.greeting(new Message3() {  // 일반 상태 (return 타입)
            @Override
            public int something(int x,int y) {
                System.out.println("parameter value : " + x+" ,"+y);
                return 33;
            }
        });
        System.out.println("=================================");
        p.greeting((x,y)->{  // Lambda식 () -> {}
            System.out.println("parameter value : " + x+" ,"+y);
            return x+y;
        });

        p.greeting((x,y) -> x+y);  // p.greeting((x,y) -> {return x+y;});
    }
}
