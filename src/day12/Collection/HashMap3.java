package day12.Collection;

import java.util.*;

// key / value 한쌍으로 처리.(set + list)  딕셔너리 타입, 순서x, 키값이 같으면 나중에 들어간 값으로 덮어쓴다.
public class HashMap3 {
    static HashMap phoneBook = new HashMap(); // 전역적으로 만듬.
    public static void main(String[] args) {
        addPhoneNo("친구","이자바","010-2356-1562");
        addPhoneNo("친구","김자바","010-6132-3456");
        addPhoneNo("친구","박자바","010-3452-6774");
        addPhoneNo("회사","김대리","010-5612-9077");
        addPhoneNo("회사","박과장","010-2356-6568");
        addPhoneNo("회사","강대리","010-5647-2152");
        addPhoneNo("세탁","010-2356-1562");

        printAll();
    }

    //그룹을 추가하는 메소드
    static void addGroup(String gropuName){  // 만약 phoneBook에 해당 그룹이 없다면, 새로운 HashMap을 생성하여 추가
        if(!phoneBook.containsKey(gropuName)){
            phoneBook.put(gropuName,new HashMap());
        }
    }

    //그룹에 전화번호를 추가하는 메소드
    public static void addPhoneNo(String groupName, String name, String tel) {
        addGroup(groupName);
        HashMap group = (HashMap) phoneBook.get(groupName);
        group.put(tel,name); // 이름은 동명이인이 가능하여 key 값으로 전화번호 지정

    }
    public static void addPhoneNo(String name, String tel) {
        addPhoneNo("기타",name,tel);

    }
    //전화번호부 전체를 출력하는 메소드
    static void printAll(){
        Set set = phoneBook.entrySet();
        Iterator it = set.iterator();
        System.out.println(set);
        while (it.hasNext()){
            Map.Entry e = (Map.Entry)it.next();
            Set subSet = ((HashMap)e.getValue()).entrySet();
            Iterator subIt = subSet.iterator();
            System.out.println("*" + e.getKey()+"["+subSet.size()+"]");
            while ((subIt.hasNext())){
                Map.Entry subE = (Map.Entry)subIt.next();
                String telNo = (String)subE.getKey();
                String name = (String) subE.getValue();
                System.out.println(name + "  " + telNo);
            }
        }
    }
}
