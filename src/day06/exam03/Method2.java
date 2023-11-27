package day06.exam03;

public class Method2 {
    // 3. 매개변수는 없고, 리턴타입 있는 경우
    // Public returnType methodName(){  return value;   }
    public static String show() {
//            return "Hello String";
        String str = "Hello world";
        return str;
    }

    public static int iShow(){
        int su = 99;
        return su;
    }

// 	4. 매개변수는 있고, 리턴타입도 있는 경우
//  Public returnType methodName(parameter val1,parameter val2,…){  return value;   }
    public static int plus(int x, int y){
        int hap = x+y;
        return hap; // return x+y;
    }
    public static void main(String[] args) {
        String msg = show();
        System.out.println(msg);
        System.out.println(show());
        //plus(1,2);  // 이렇게만 하면 절대 값 안나옴
        System.out.println(plus(3,5));

        }
    }
