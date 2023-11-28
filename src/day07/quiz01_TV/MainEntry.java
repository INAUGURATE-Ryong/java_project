package day07.quiz01_TV;

public class MainEntry {
    public static void main(String[] args) {
        TV tv = new TV();
        tv.display();
        tv.setChannel(2);
        tv.setColor("노란색");
        tv.display();
    }
}
