package day11.Collection.set;

import java.util.Set;
import java.util.TreeSet;
// 로또 프로그램
public class TreeSet2 {
    public static void main(String[] args) {
        Set set = new TreeSet();  // TreeSet<Type> Type을 안쓰면 어떤 데이터도 받아올 수 있다.
        for (int i = 0; set.size() < 6; i++) {
            int num = (int)(Math.random() * 45) + 1;
            set.add(num);

        }
        System.out.println(set);

    }
}
