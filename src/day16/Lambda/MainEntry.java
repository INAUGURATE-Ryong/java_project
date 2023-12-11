package day16.Lambda;

interface Message{
    void something();
}

class Person{
    public void greeting(Message msg){
        msg.something();
    }
}
public class MainEntry {
    public static void main(String[] args) {
        Person p = new Person();
        p.greeting(new Message() {  // 일반 상태
            @Override
            public void something() {
                System.out.println("good morning");
                System.out.println("열.공.");
            }
        });
        System.out.println("=================================");
        p.greeting(()->{  // Lambda식 () -> {}
            System.out.println("Lambda good morning");
            System.out.println("Lambda 열.공.");
        });
    }
}
