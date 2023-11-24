package day05.exam03;

import java.util.Random;

public class Random1 {
    public static void main(String[] args) {
        System.out.println(Math.random()); // 0.0 ~1.0미만 사이값
        System.out.println(Math.random() *5); // 0 ~4

        for (int i=0;i <5;i++){
            System.out.print((int)(Math.random() * 45)+1 +"\t");  // random은 double로 나와서 int를 뽑으려면 형변환 필수!
        }

        System.out.println("==========================");
        Random rand = new Random();
        System.out.println(rand.nextInt()); // 정수 범위에서의 랜덤
        System.out.println(rand.nextInt(5)); // 0~4사이 값만
        System.out.println(rand.nextInt(10)+2); // 2~ 11까지.
        System.out.println("==========================");

        for (int i=0; i<6;i++ ){
            System.out.print(rand.nextInt(45)+1);
        }
    }
}
