package day12.Collection;

import java.util.*;

public class TreeMap1 {
    public static void main(String[] args) {
        TreeMap<String,Integer> tm = new TreeMap<>();

        tm.put("zz",1000);
        tm.put("bb",1000);
        tm.put("aa",1000);
        tm.put("kk",10);
        tm.put("dd",1000);

        System.out.println("name : " + tm.get("aa")); // aa라는 key값에 해당하는 value 꺼내기
        System.out.println(tm); // 자동정렬된다. -key값 기준으로

        TreeSet set = new TreeSet();
        for (int i = 0; i < 6; i++) {
            set.add((int)(Math.random()*50)+1);

        }

        List list = new LinkedList(set);
        System.out.println(set);
    }
}
