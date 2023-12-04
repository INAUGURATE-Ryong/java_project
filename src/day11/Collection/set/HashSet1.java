package day11.Collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

// set :  순서업속, 중복허용하지 않음.
public class HashSet1 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();  // new HashSet<>();
        hs.add("키보드");
        hs.add("컵");
        hs.add("마우스");
        hs.add("핸드폰");
        hs.add("키보드");
        System.out.println("요소 개수 : " + hs.size());  // 중복허용이 되지 않아 4 출력
        Iterator it = hs.iterator();  // 데이터 꺼내기
        while (it.hasNext()) {// 다음요소가 있다면
            System.out.println(it.next());  // 들어간 순서 없이 출력
        }

        HashSet<Integer> hs2 = new HashSet<>(); // int로 쓸 수 없다. 객체타입만 와야 함.
        hs2.add(200);
        hs2.add(1000);
        hs2.add(3);
        hs2.add(11);
        hs2.add(23);
        System.out.println("---------------------------------");

        for (Integer item : hs2) {
            System.out.println(item);
        }
        System.out.println("---------------------------------");
        for(String item : hs){
            System.out.println(item);
        }
        System.out.println("---------------------------------");
        for(Object item : hs){
            System.out.println(item);
        }
        System.out.println("---------------------------------");
        it = hs2.iterator();
        while (it.hasNext()){  // 다음요소가 있으면  true, 없으면 false 출력
            System.out.println(it.next()); // 값을 꺼내와서 출력
        }
    }
}
