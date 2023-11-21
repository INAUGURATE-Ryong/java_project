package day02.quiz;
/*  문제2]
int = 12345;
시 : 분 : 초 로 출력
*/
public class Quiz02 {
    public static void main(String[] args) {
        int su = 12345;
        int hour,minute,second;
        hour = su / 3600;
        minute =(su % 3600) / 60;
        second = su % 60;
        System.out.println(hour + ":"+ minute+ ":"+second);

    }
}
