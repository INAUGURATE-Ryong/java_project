package day09.quiz02_interface;

public class MainEntry {
    public static void main(String[] args) {
        Trans ta = new Subway();
        ta.start();
        ta.stop();
    }
}
