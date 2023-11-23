package day04.exam03;

public class Break_Continue2 {
    public static void main(String[] args) {
        for (int i =1;i < 6; i ++ ){
            for (int j = 1; j<6;j ++){
                System.out.println("i : " +i+", j : "+ j);
            } // j end
        } // i end

        System.out.println("++++++++++++++++++++++++++++++++");

        for (int i =1;i < 6; i ++ ){
            for (int j = 1; j<6;j ++){
                if(j==3) break; // j가 3이 되는 순간 블럭을 빠져나와 위 for문으로감.
                System.out.println("i : " +i+", j : "+ j);
            } // j end
        } // i end
        System.out.println("++++++++++++++++++++++++++++++++");

        lable : // 식별자
        for (int i =1;i < 6; i ++ ){
            for (int j = 1; j<6;j ++){
                if(j==3) break lable;  // lable 까지 가서 멈춰라.
                System.out.println("i : " +i+", j : "+ j);
            } // j end
        } // i end
        System.out.println("++++++++++++++++++++++++++++++++");
        for (int i =1;i < 6; i ++ ){
            for (int j = 1; j<6;j ++){
                if(j==3) continue;
                System.out.println("i : " +i+", j : "+ j);
            } // j end
        } // i end

        System.out.println("++++++++++++++++++++++++++++++++");

        lable :
        for (int i =1;i < 6; i ++ ){
            for (int j = 1; j<6;j ++){
                if(j==3) continue lable;
                System.out.println("i : " +i+", j : "+ j);
            } // j end
        } // i end
    }
}
