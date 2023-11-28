package day07.exam01;

public class ArrayMethod {
    public static void main(String[] args) {
        int x = 3, y = 5;
        int result = methodEx(x, y);
        System.out.println(result);
        int[] arrResult = methodEx2();
        for (int i = 0; i < arrResult.length; i++) {
            System.out.println(arrResult[i] + "\t");
        }

        for (int item : arrResult) {
            System.out.print(item + " ");
        }
        System.out.println();
        System.out.println("+++++++++++++");
        int[][] resultArr = methodEx3();
        int sum = 0;
        for (int i =0;i<resultArr.length;i++){
            for (int j=0;j<resultArr[i].length;j++){
                System.out.print(resultArr[i][j] + "\t");
                sum += resultArr[i][j];
            }
            System.out.println();
        }
        System.out.println(sum);
        System.out.println("++++++foreach문+++++++++");
        for (int[] item : resultArr){
            for(int arrItem : item){
                System.out.print(arrItem + "  ");
            }
            System.out.println();
        }

        System.out.println("================================");
        int index = 0;
        for (int[] item : resultArr
             ) {
            System.out.println("index : " + index++);
            System.out.println(item); // 데이터 들어있는 주소 출력됨
            System.out.println(item.hashCode()); // 메모리상의 주소(16진수형태)를 10진수 형태 메모리 주소로 보여줌

        }
    }

    private static int[][] methodEx3() {
        int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}};
        return arr;
    }



    public static int[] methodEx2() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        return arr;
    }

    public static int methodEx(int x, int y) {
        return x + y;
    }
}
