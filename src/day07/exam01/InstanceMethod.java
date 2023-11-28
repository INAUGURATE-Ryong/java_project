package day07.exam01;
/*
instance method : 객체생성하고 사용해야함 ex) Scanner
static 없이 생성.
 */
class  B{
    int x,y;
    public void setData(int xx, int yy){
        System.out.println(xx+","+yy);
    }

} //
public class InstanceMethod {
    public static void main(String[] args) {
        B b = new B(); // 객체생성, 메모리에 할당, 생성자함수 자동호출
        b.setData(100,200);

    }
}
