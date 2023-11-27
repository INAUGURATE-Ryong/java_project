package day06.quiz;

//3차원 배열에 임의적인 데이터 넣기
public class Quiz01 {
    public static void main(String[] args) {
        int[][][] a = new int[2][2][3];  //[면크기][행크기][열크기]

        for (int i = 0; i < a.length; i++) { //면
            for (int j = 0; j < a.length; j++) {
                for (int k = 0; k < a[i][j].length; k++) {
                    a[i][j][k] = (int)(Math.random()*50);
                    // a[i][j][k] = x++ *5; x초기값을 1로 잡고 이렇게 출력하면 5씩 늘어난 상태로 넣어짐
                }
            }

        }

        for (int i = 0; i < a.length; i++) { //면
            for (int j = 0; j < a.length; j++) {
                for (int k = 0; k < a[i][j].length; k++) {
                    System.out.print(a[i][j][k] + "\t");
                }//k end
                System.out.println();

            } //j end
            System.out.println();
        }
    }
}