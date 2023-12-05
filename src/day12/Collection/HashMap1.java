package day12.Collection;

import java.util.HashMap;
import java.util.Scanner;

// key / value 한쌍으로 처리.(set + list)  딕셔너리 타입, 순서x, 키값이 같으면 나중에 들어간 값으로 덮어쓴다.
public class HashMap1 {
    public static void main(String[] args) {
        HashMap map = new HashMap();

        map.put("encore", "1234");
        map.put("kosa", "1111");
        map.put("kiwi", "1234");
        map.put("encore", "1004");   // 키값은 같으면 중복해서 들어가지 않고 덮어쓴다.

        System.out.println(map);
        System.out.println("요소갯수 : " + map.size()); // key 중복 허용 x

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("id와 password를 입력해주세요.");
            System.out.print("id는 : ");
            String id = sc.nextLine().trim();
            System.out.print("password는 : ");
            String pwd = sc.nextLine().trim();
            System.out.println();

            if (!map.containsKey(id)) {  //(회원가입 시 ID중복) 그 값이 잇는지 확인.
                System.out.println("입력하신 id는 존재하지 않는다. 다시 입력해주세요");
                continue;
            } else {
                if(!(map.get(id).equals(pwd))){
                    System.out.println("비밀번호가 일치하지 않습니다.");
                } else {
                    //System.out.println("id와 password가 일치합니다. ");
                    System.out.println(id+"님 반갑습니다.");
                    break;
                }

            }
        }

    }
}
