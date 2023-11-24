package day05.exam01;
// 2차원 배열
public class Array2 {
    public static void main(String[] args) {
     //   int[][] a = new int[2][3];
     //   int [][] a= new int[][] {{1,2,3},{4,5,6}};
        int[][] a = {{1,2,3,},{4,5,6}};

        for(int i = 0; i<a.length; i++){ //행
            for(int j = 0; j<a[i].length;j++) {//열
                System.out.print(a[i][j]);
            } // j end
            System.out.println();
        } // i end

    }
}
