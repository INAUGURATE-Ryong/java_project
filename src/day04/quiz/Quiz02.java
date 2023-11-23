package day04.quiz;

/*public class Quiz02 {
    public static void main(String[] args) {
        int a=1; //b=1;
        while (a <=2){
            int b=1;
            while (b <=3){
                System.out.print(b+"\t");
                b++;
            } // b end b는 4라는 변수를 담고 끝나있어서 a값이 2로 바뀌어도  while 조건문 성립이 되지 않아 바로 while안돌아감.
             // 따라서 b c초기화를 첫번째 while 안에 넣어야 함.
        }
        a++;
        System.out.println();
    } //a end
}*/

//전체 구구단 출력
public class Quiz02 {
    public static void main(String[] args) {
        int a=2;
        while (a<=9){
            int b=1;
            while (b<=9){
                System.out.println(a+"*"+b+"="+(a*b));
                b++;
            }
            a++;
        }
    }
}
