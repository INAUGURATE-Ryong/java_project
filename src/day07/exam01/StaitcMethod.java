package day07.exam01;
/*
static method : 객체 생성 없이 바로 사용 가능함
objectName.methodName():
ClassName.methodName();
 */

class  A{
    int x,y;
    // static method
    public static void setData(int xx , int yy){
        System.out.println(xx+","+yy);
    }
}
public class StaitcMethod {
    public static void main(String[] args) {
        A.setData(3,5);
        A obj  = new A(); // 객체생성, 메모리에 핧당, 생성자함수 자동호출
        obj.x = 9; // A라는 클래스 안에 x라는 값에 9 넣기
        System.out.println(obj.x);
        obj.setData(1,2);

    }
}
