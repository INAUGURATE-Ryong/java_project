package day11.Collection.set;

import java.util.HashSet;
import java.util.Set;

// set :  순서업속, 중복허용하지 않음.
public class HashSet2 {
    public static void main(String[] args) {
        Object[] objArr = {"1", new Integer(1),"2","3","4","4","4"};
        Set set = new HashSet();

        for (int i = 0; i < objArr.length; i++) {
            set.add(objArr[i]);

        }

        System.out.println(set);  //자료형이 틀리면 다른데이터로 인식하여, 1 1 2 3 4 출력
    }
}
