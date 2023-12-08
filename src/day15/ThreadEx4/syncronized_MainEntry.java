package day15.ThreadEx4;
class Atm{
    private  int money;
    public Atm(int money) {
        this.money = money;
    }

    //입금함수
    public synchronized void deposit(int amount,String name){
        money+= amount;
        System.out.println(name+" : 입금금액" + amount);
    }

    //출금함수
    public void withdraw(int amount,String name){
        synchronized (this){  // 동기화
            if((money - amount) > 0){
//            Thread.yield(); // 다른작업이 들어오면 양보해주는 명령어
                money-=amount;
                System.out.println(name+" : 출금금액" + amount);
            }else {
                System.out.println(name+" :출금 못함(잔액부족)");
            }
        }// sychronized end

    }
    public void getMoney(){
        System.out.println("                      잔액은 : " + money);

    }
}

class UserAtm extends Thread{
    Atm obj;
    boolean flag = false;

    public UserAtm(Atm obj, String name){
        super(name);
        this.obj = obj;
    }
    @Override
    public void run() {  //스레드 실행부(구현부)
        for (int i = 0; i < 2; i++) {
            try {
                sleep(50);  // 0.05초 동안
            } catch (Exception e) {
                e.printStackTrace();
            }
            if(flag){
                obj.deposit((int)(Math.random()*10 +2)*100,getName());
            }else {
                obj.withdraw((int)(Math.random()*10 +2)*100,getName());
            }
            flag = true;
            obj.getMoney();
        }
    }
}
public class syncronized_MainEntry {
    public static void main(String[] args) {
        Atm at = new Atm(1000);
        UserAtm user1 = new UserAtm(at,"아이유");
        UserAtm user2 = new UserAtm(at,"솔라");
        UserAtm user3 = new UserAtm(at,"화사");

        user1.start();
        user2.start();
        user3.start();

    }

}
