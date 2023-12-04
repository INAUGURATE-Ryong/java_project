package day11.Collection.set;

import java.util.TreeSet;

public class TreeSet1 {
    public static void main(String[] args) {
        TreeSet set = new TreeSet();  // TreeSet<Type> Type을 안쓰면 어떤 데이터도 받아올 수 있다.
        int[] score = {22,31,28,99,53,67,89,12,100,50};
        for (int i = 0; i < score.length; i++) {
            set.add(new Integer(score[i]));
           // set.add(score[i]);  이렇게도 가능

        }
        System.out.println(set);  // 자동정렬이 되어 출력이 됨.(hashset과의 차이점임!)

        System.out.println("50보다 작은 값 : "+set.headSet(new Integer(50))); // 50 미만
        System.out.println("50보다 작은 값 : "+set.headSet(50)); // 50 미만
        System.out.println("50보다 같거나 큰 값 : "+set.tailSet(50)); // 50 이상
        System.out.println("50보다 작은 값 : "+set.tailSet(new Integer(50))); // 50 미만
        System.out.println(set.first()); // 최솟값
        System.out.println(set.last());  // 최댓값


    }
}
