package day06.exam03;
//가변길이 함수(매개변수가 늘어날때 활용  (데이터 타입이 같아야만 쓸 수 있다.
public class Method_Overload3 {
    public static void plus(int...x){ // 가변길이 배열
        int sum = 0;
        for(int i =0;i<x.length;i++){
            sum+=x[i];
        }
        System.out.println(sum);

    }
//    public static void plus(int x, int y){
//        int hap = x+y;
//        System.out.println(hap);
//
//    }
//    public static void plus(int x, int y,int z){
//        int hap = x+y+z;
//        System.out.println(hap);
//
//    }
//    public static void plus(int x, int y,int b , int c){
//        int hap = x+y+c+b;
//        System.out.println(hap);
//
//    }
    public static void main(String[] args) {
        plus(1,2,3,4,56);

    }
}
