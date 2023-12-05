package day12.Collection;

import java.util.*;

// key / value 한쌍으로 처리.(set + list)  딕셔너리 타입, 순서x, 키값이 같으면 나중에 들어간 값으로 덮어쓴다.
public class HashMap2 {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        map.put("둘리",new Integer(90));
        map.put("짱구",50);
        map.put("짱아",20);
        map.put("철수",100);
        map.put("맹구",40);
        System.out.println(map);  // 딕셔너리
        Set set = map.entrySet();
        System.out.println(set);  // 배열
        Iterator it = set.iterator();
        System.out.println(it.next());
//        Set set = (Set)map.entrySet().iterator();
        while (it.hasNext()){
            Map.Entry e = (Map.Entry)it.next();
            System.out.println("Name : "+e.getKey()+"  Score : "+e.getValue());
        }

        set = map.keySet();
        System.out.println("참가자명단 : " +set);

        Collection values = map.values();
        it = values.iterator();
        int total = 0;
        while (it.hasNext()){
            Integer i = (Integer) it.next();
            total += i.intValue();
        }
        System.out.println("총점 : " + total);
        System.out.println("평균 : " + (double) total / set.size());
        System.out.println("최고점수 : " + Collections.max(values));
        System.out.println("최하점수 : " + Collections.min(values));
    }
}
