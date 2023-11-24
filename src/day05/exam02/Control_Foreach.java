package day05.exam02;

public class Control_Foreach {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        for (int i =0; i<arr.length;i++){
            System.out.println(arr[i]);

        }
        System.out.println("==================");
        //for(자료형 변수명 : 배열명 또는 컬렉션명) {  }
        for (int item : arr){  // 중간에 멈출수가 없음. 멈추고 싶으면 다른 변수를 잡고, 조건을 넣어줘서 멈춰야 한다.
            System.out.println(item);
        }
        //아래 점수의 총합을 foreach문으로 구하기
        int[] score = {78,70,88,99,58};
        int total_sum =0;
        for(int sum : score){
            total_sum+=sum;
        }
        System.out.println(total_sum);
    }
}

/*
for(자료형 변수명 : 컬렉션명 or 배열명) {
반복구문;
}
 */