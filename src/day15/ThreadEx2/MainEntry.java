package day15.ThreadEx2;

public class MainEntry {
    public static void main(String[] args) {
//        Runnable t1 = new UserRunnable("u1");
//        Thread tt1 = new Thread(t1);
//        tt1.start();

        new Thread(new UserRunnable("u1")).start();
        new Thread(new UserRunnable("u2")).start();
        new Thread(new UserRunnable("u3")).start();
//        t1.run();  // 불려는 지지만 쓰레드를 활용한 건 아님.
    }
}
