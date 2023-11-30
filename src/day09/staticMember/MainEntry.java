package day09.staticMember;

class Atm{
    int count; //instance menber
    static int total; //static member  객체가 새로 생겨도 초기화 하지 않고 이전 값을 공유

    public Atm(int amount){ //constructor
        count += amount;
        total += amount;
    }

    public static void view(){ //static method 에서는 stactic만 사용가능 (일반 멤버변수(instance menber)는 사용할 수 없다)
       // count+=100;
        total+=100;
    }
    public void show(int count, int total){
        this.count = count;
      //  this.total = total;  //static member에는 this를 사용할 수 없다
    }
    public void display(){  // instance method 에서는 static member/instance menber 둘다 사용 가능.
        count = count + 200;
        total = total +200;
        System.out.println("count = " + count);
        System.out.println("total = " + total);
    }

} //atm class end

public class MainEntry {
    public static void main(String[] args) {
        Atm at = new Atm(1000);
        at.display();  // count 1000, total 1000
        Atm at2 = new Atm(1000);
        at.display(); // count 1000, totla 2000
        Atm at3 = new Atm(1000);
        at.display(); // count 1000, totla 3000

        System.out.println(Atm.total); // instance method는 안보임 객체 생성해서 해야함.

    }
}
