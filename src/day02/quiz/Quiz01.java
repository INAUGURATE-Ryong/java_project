package day02.quiz;
/*  문제1]
pay = 567890;
result :
만원 :  56장
천원 : 7장
백원 : 8개
십원 : 9개 나오도록 출력
*/
public class Quiz01 {
    public static void main(String[] args) {
        int pay = 567890;
        int result1,result2,result3,result4;
        result1 = pay / 10000;
        result2 = (pay % 10000) / 1000;
        result3 = (pay % 1000) / 100;
        result4 = (pay %100) / 10;

        System.out.println("만원 :" + result1 +"장" );
        System.out.println("천원 :" + result2+"장" );
        System.out.println("백원 :" + result3 +"개");
        System.out.println("십원 :" + result4 +"개");
    }
}
