package day10.API_Object;
class Point {  }

public class MainEntry {
    public static void main(String[] args) {
        Point pt = new Point();
        System.out.println("Point pt information");
        System.out.println("class name : " + pt.getClass());  // 클래스 이름 출력
        System.out.println("hash code : " + pt.hashCode());  // 주소를 10진수로 출력
        System.out.println("Object String : " + pt.toString()); // 주소를 16진수로
        System.out.println("Object String : " + pt); // 주소를 16진수로
        System.out.printf("10wlstn %d\n",0x5ebec15);
        System.out.println("=============================");

        Point pt2 = new Point();
        System.out.println("Point pt information");
        System.out.println("class name : " + pt2.getClass());  // 클래스 이름 출력
        System.out.println("hash code : " + pt2.hashCode());  // 주소를 10진수로 출력
        System.out.println("Object String : " + pt2.toString()); // 주소를 16진수로
        System.out.println("Object String : " + pt2); // 주소를 16진수로

        System.out.println("pt.toString() : toString()의 의미 - day10.API_Object.Point@9629756 ");
        System.out.println(pt2.getClass().getName() +'@'+Integer.toHexString(pt2.hashCode()) );

        Point pt3 = new Point(); //not same
        if(pt.hashCode() == pt3.hashCode()){
            System.out.println("same");
        } else{
            System.out.println("not same");
        }

        Point pt4;
        pt4 = pt; //same
        if(pt.hashCode() == pt4.hashCode()){
            System.out.println("same");
        } else{
            System.out.println("not same");
        }

        System.out.println(pt.hashCode()+"," + pt4.hashCode());

    }

}
