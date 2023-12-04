package day11.Collection.set;

import java.util.Set;
import java.util.TreeSet;

// 로또 프로그램
public class TreeSet3 {
    public static void main(String[] args) {
        TreeSet set = new TreeSet();
        String from = "A";
        String to = "d";
        set.add("abc");
        set.add("alien");
        set.add("bat");
        set.add("car");
        set.add("Car");
        set.add("dZZZ");
        set.add("dzzz");
        set.add("elephant");
        set.add("elevator");
        set.add("fan");
        set.add("flower");
        System.out.println(set);
        System.out.println("range search : from " +from + " to  " +to);
        System.out.println("result : " +set.subSet(from,to)); // from포함 to 미포함 인 a~c로 시작하는 단어만 출력 대문자 미포함
        System.out.println("result : " +set.subSet(from,to +"i"));  // 우선순위가 대문자 > 소문자 범위에 to 포함하려면 뒤에 아무 글자를 쓰면됨.

    }
}
