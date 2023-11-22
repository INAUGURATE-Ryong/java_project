package day03.exam03;
// ***** 출력
public class Control_For1 {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++){
            System.out.print("*");
        }
    }
}

/*
public class Control_For1 {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++){
            System.out.println("Hi~~~~");
        }  // {}이 닫히는 순간 메모리가 초기화 되어 같은 변수i를 써도 상관없음

        for (int i = 1;i <101; i++){
            System.out.print(i + "\t");
            if(i % 10 ==0) System.out.println();
        }
    }
}
*/