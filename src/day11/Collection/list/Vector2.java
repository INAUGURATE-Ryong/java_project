package day11.Collection.list;

import java.util.Date;
import java.util.Enumeration;
import java.util.Vector;


//List : 순서 있고, 중복하용한다.
public class Vector2 {
    public static void main(String[] args) {
        int i;
        Date date = new Date();
        Vector v = new Vector(3,5);

        v.addElement("자바");
        v.addElement(new Double(12.34));
        v.addElement(date);

        System.out.println("------- 3개 객체 추가 ------------");
        System.out.println("size : " + v.size()+", capacity :" +v.capacity());

        for (i = 0; i < 10; i++) {
            v.addElement(new Integer(i));

        }
        System.out.println("------- 10개 객체 추가 ------------");
        System.out.println("size : " + v.size()+", capacity :" +v.capacity());

        System.out.println("---------- Vector 내용 출력 ------------");
        Enumeration enu = v.elements();

        while (enu.hasMoreElements()){
            System.out.print(enu.nextElement()+"\t");
        }
        System.out.println("\n\n---------- 객체 내용 포함 확인 -----------");
        if(v.contains("자바")) System.out.println("자바 문자열 포함되어 있음.");
        else System.out.println("없음");

        System.out.println("12.34 객체 위치는?" + v.indexOf(new Double(12.34)));
        System.out.println("입력 시간은 ? " + date);

        System.out.println(v.get(v.indexOf(date)));

        // date 삭제
        v.removeElementAt(v.lastIndexOf(date)); //뒤에서 부터있는 date인덱스 번호
        System.out.println("size : " + v.size()+", capacity :" +v.capacity());
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

        enu = v.elements();
        while (enu.hasMoreElements()){
            System.out.print(enu.nextElement()+"\t");
        }
        System.out.println("\n&&&&&&&&&&&&&&&&&&&&&&&&&");

        for (i = 0; i < v.size(); i++) {
            v.removeElementAt(i);  // 자료가 삭제되고 indexs는 떙겨진다.

        }
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&");
        System.out.println("size : " + v.size()+", capacity :" +v.capacity());

        System.out.println("\n----삭제후 남는 데이터 ------");
        for (int j = 0; j < v.size(); j++) {
            System.out.print(v.get(j)+", ");
        }
        System.out.println("\n\n*******************************");
        v.setElementAt("java",2); // 3번째 위치에 java문자열 추가

        enu = v.elements();
        while (enu.hasMoreElements()){
            System.out.print(enu.nextElement()+"\t");
        }

        System.out.println("\n\n*******************************");
        v.removeAllElements(); // 모든요소 제거
        System.out.println("size : " + v.size()+", capacity :" +v.capacity());

        v.trimToSize();
        System.out.println("size : " + v.size()+", capacity :" +v.capacity());


    }
}
