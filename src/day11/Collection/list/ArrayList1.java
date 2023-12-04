package day11.Collection.list;

import java.util.ArrayList;
import java.util.Collections;

//List : 순서 있고, 중복하용한다.
public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(5); //index 0
        list.add(4); //index 1
        list.add(0); //index 2
        list.add(2); //index 3
        list.add(1); //index 4
        list.add(3); //index 5

        ArrayList list2 = new ArrayList(list.subList(1,4)); // 인덱스 번호 1번부터 3번까지??
        // list2.add(200);
        print(list,list2); // 출력하는 메소드 만들어줌

        list.sort(null);
        Collections.sort(list2);
        print(list,list2);

        System.out.println("list.containsAll(list2) : " + list.containsAll(list2)); // list에 list2 값들이 다 들어 있으면 true출력
        System.out.println("list.contains(list2) : " + list.contains(2)); // list에 list2 값들이 다 들어 있으면 true출력
        list2.add("B");
        list2.add("C");
        print(list,list2);

        list2.set(3,"김연아"); // 추가는 add 교체는 set
        list2.add(2,"ddd");
        print(list,list2);
    }

    public static void print(ArrayList list, ArrayList list2) {
        System.out.println("list : " + list);
        System.out.println("list2 : " + list2);
        System.out.println();
    }
}
