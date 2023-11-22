package day03.exam03;
//2중 for문
/*public class Control_For2 {
    public static void main(String[] args) {
        for(int i=1;i <=2;i++){
            for(int j=1; j <=3; j++){
                System.out.print((j + "\t"));
            } // j end
            System.out.println();
        } // i end
    }
}*/
// *을 5행 5열로 찍기
public class Control_For2 {
    public static void main(String[] args) {
        for(int i=1;i <=5 ;i++){
            for(int j=1; j <=5; j++){
                System.out.print("*");
            } // j end
            System.out.println("*");
        } // i end
    }
}