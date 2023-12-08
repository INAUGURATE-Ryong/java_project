package day15.ThreadEx3;

public class MainEntry {
    public static void main(String[] args) {

        long id = Thread.currentThread().getId(); // 현재 쓰레드의 ID
        String name = Thread.currentThread().getName(); // 현재 쓰레드의 이름
        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
        Thread.currentThread().setPriority(Thread.MIN_PRIORITY);

        int priority  = Thread.currentThread().getPriority();
        Thread.State state = Thread.currentThread().getState();

        System.out.println("현재 스레드 ID : "+ id); // main의  ID ( 메인도 쓰레드.)
        System.out.println("현재 스레드 이름 : "+ name);
        System.out.println("현재 스레드 우선순위(Priority) : "+ priority);
        System.out.println("현재 스레드 State(상태값) : "+ state);

    }
}
