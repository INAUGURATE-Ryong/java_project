package day12.Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// key / value 한쌍으로 처리.(set + list)  딕셔너리 타입, 순서x, 키값이 같으면 나중에 들어간 값으로 덮어쓴다.
public class HashMap4 {
    public static void main(String[] args) {
        String[] data = {"A","K","A","K","D","K","A","K","K","K","Z","D"};
        HashMap map = new HashMap(); //<TypeParameter> wrapper class type만 들어간다.

        for (int i = 0; i < data.length; i++) {
            if(map.containsKey(data[i])){
                Integer value = (Integer) map.get(data[i]);
                map.put(data[i],new Integer(value.intValue()+1));
            }else {
                map.put(data[i],new Integer(1));
            }
        }
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()){
            Map.Entry entry = (Map.Entry)it.next();
            int value = ((Integer)entry.getValue()).intValue();
            System.out.println(entry.getKey()+" : "+ printBar('#',value)+" "+value);
        }
    }

    private static Object printBar(char ch, int value) {
        char[] bar = new char[value];
        for (int i = 0; i < bar.length; i++) {
            bar[i] = ch;
        }
        return new String(bar);  // String(char[] chArr)
    }
}
