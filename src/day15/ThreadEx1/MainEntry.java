package day15.ThreadEx1;

public class MainEntry {
    public static void main(String[] args) {

        Thread t1 = new UserThread("t1");
        UserThread t2 = new UserThread("t2");
        Thread t3 = new UserThread("t3");
//        t1.run();  // run으로는 할 수 없다.
        t1.start(); // run()을 유도한다.
        t2.start();
        t3.start();
    }
}
