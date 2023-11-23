package day04.exam03;

public class Break_Continue1 {
    public static void main(String[] args) {
        for(int i=1; i <11; i++){  //for문은 조건을 만나면 증감처리
            if(i ==7) break; // 1~6까지만 출력
            System.out.println(i);
        }
        System.out.println("====================");
        for(int i=1; i <11; i++) {
            if (i == 7) continue; // 1~10까지 출력되지만 7만 출력이 되지 않는다.  조건을만나면 시작점으로 돌아감.
            System.out.println(i);
        }
        System.out.println("====================");
        for (int i = 1; i <11; i++){
            if (i % 2 !=0) continue; // 홀수는 건너뛰고 출력
            System.out.println(i);
        }

    }
}
