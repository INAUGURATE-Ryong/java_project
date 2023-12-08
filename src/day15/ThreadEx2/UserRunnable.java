package day15.ThreadEx2;

public class UserRunnable implements Runnable{
    String name;
    public UserRunnable(String name){
        this.name = name;
    }
    @Override
    public void run() {
//        System.out.println("runnable run() call~~");
        for (int i = 1; i < 11; i++) {
            if(i==4) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
                    e.printStackTrace();
                }
                System.out.println(name);
            }
            System.out.println(i);
        }

    }
}
