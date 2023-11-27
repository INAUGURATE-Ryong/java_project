package day06.exam03;

public class Method_Overload2 {
    public static void line(){
        System.out.println("---------------");
    }
    public static void line(String str, int n){
        for(int i=1;i<n;i++){
            System.out.print(str);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        line();
        line("*",10);
    }
}
