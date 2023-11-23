package day04.exam01;

public class Control_While1 {
    public static void main(String[] args) {
        System.out.println("for--------");
        for (int i=1;i<4;i++){
            System.out.print(i+"\t");
        }

        System.out.println("\nwhile---------");
        int a = 1;
        while (a <=3){
            System.out.println(a+"\t");
            a++;  // 증감식 제외하려면 while조건문에 조건을 (a++ <= 3) 로 수정하면 증감식 없어도 됨.
        }

        System.out.println("\ndo~while---------");
        a = 1;
        do {
            System.out.print(a+"\t");
            a++;
        } while (a <=3);

    }
}
