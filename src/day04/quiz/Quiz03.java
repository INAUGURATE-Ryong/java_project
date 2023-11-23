package day04.quiz;
// 1~100까지 중에서 짝수의 개수 구하고 한화면에 10개씩 출력
public class Quiz03 {
    public static void main(String[] args) {
        for (int i =1; i < 101; i++){  // (int i =2; i < 101; i+=2) 하면 if 필요없음.
            if(i % 2 != 0 ) continue;
            System.out.print(i+"\t");
            if(i % 20 ==0) System.out.println();

        }

    }
}
