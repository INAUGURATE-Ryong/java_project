package day05.exam01;

import java.util.Arrays;
import java.util.Scanner;

// 1차원 배열
public class Array1_2 {
    public static void main(String[] args) {
        // 배열의 합 구하기
        int[] arr = {1,2,3,4,5};
        int sum=0;
        for (int i =0; i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println(sum);

        //임의적 데이터 입력 받아서 출력하기
        int[] arr2 = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i=0;i<arr2.length;i++){
            arr2[i] = sc.nextInt();
        }
        for (int i =0;i<arr2.length;i++){
            System.out.println("arr2["+i+"] = "+arr2[i]);
        }
//        System.out.println("===============");
//        System.out.println(Arrays.toString(arr2));
    }
}
