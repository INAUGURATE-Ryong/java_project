package day06.exam03;

public class Method1 {
// 1. 매개변수 없고, 리턴타입 없는경우
// Public [returnType] methodName(){  }
    public static void line(){
        System.out.println("--------------------"); // 메인에서 불러줘야 출력 가능!
    }

// 2. 매개변수는 있고, 리턴타입 없는 경우
// public [return type] methodName(parameter val1,parameter val2,…){ }
    public static void  showName(String name,int age){
        System.out.println("당신의 이름은" + name+"이시군요");
        System.out.println("당신의 나이는" + age+"살");
    }
    public static void main(String[] args) {
        System.out.println("main start");
        showName("박태환",22);
        line(); // 함수 호출
        display();
        System.out.println("main end");

    }

    public static void display() {  // 함수정의부

        System.out.println("happy");
    }
}
