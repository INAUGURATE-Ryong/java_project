package day16.Lambda;
interface Message1{
    int something(); // int 형태
}

class Person1{
    public void greeting(Message1 msg){
        int su =  msg.something();
        System.out.println("Number is : " + su);
    }
}
public class LambdaMain {
    public static void main(String[] args) {
        Person1 p = new Person1();
        p.greeting(new Message1() {  // 일반 상태 (return 타입)
            @Override
            public int something() {
                System.out.println("good morning");
                System.out.println("열.공.");
                return 300;
            }
        });
        System.out.println("=================================");
        p.greeting(()->{  // Lambda식 () -> {}
            System.out.println("Lambda good morning");
            System.out.println("Lambda 열.공.");
            return 50;
        });
    }
}
