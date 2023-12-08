package day15.ThreadEx1;

public class UserThread extends Thread{
    String name;
    public UserThread(String name){
        this.name = name;
    }
    @Override
    public void run() {  //  아무일도 안하기에 내 입맛에 맞게 바꿔야 한다. 스레드 실행부(중요)
        for (int i = 1; i <=10; i++) {
            if(i ==7){
                try {
                    sleep(3000);  // 예외발생, 1/1000 은 1초
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(name);
            }
            System.out.println(i);

        }
//        super.run(); // 부모가 갖고 있는 run호출
    }
}
