package day15.ThreadEx3;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class GraphicThread extends JFrame implements Runnable {
         // Frame : window
    int num,x,y;
    Color color;
    Random random;

    public GraphicThread(int num) { // 생성자함수 - 초기화
        this.num = num;
        color  = Color.BLUE;
        random = new Random();
        setSize(500,400); // 프레인(화면)크기 - 너비, 높이
        setVisible(true); // 화면보여주기
        setLocation(300,150); // 컴퓨터는 0,0좌표가 좌측위모서리 이며 x는 오른쪽가는게 + y는 내려가는게 +
        // 창 뜨는 위치를 오른쪽으로 300 아래로 150 만큼 내려서 뜨게 하기.
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // 닫기
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(color);
        g.fillRect(x,y,3,3);  //(x, y)를 시작점으로 하고, 가로세로 각각 3픽셀 크기의 사각형을 그림
//        g.fillOval(x,y,10,10);  //(x, y)를 시작점으로 하고, 가로세로 각각 3픽셀 크기의 사각형을 그림
    }

    @Override
    public void run() {
        Rectangle rect = getBounds(); // 부드라운 사각형
        for (int i = 0; i < num; i++) {
            x= random.nextInt(rect.width); // 랜던값이 너비를 벗어나지 않게
            y= random.nextInt(rect.height); // 랜던값이 높이를 벗어나지 않게

            repaint(); // 그린 그림을 남기고 다시 불러서 그려라.
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public static void main(String[] args) {
        //1.
//        GraphicThread gt = new GraphicThread(100);
//        Thread t1 = new Thread(gt);
//        t1.start();

        //2.
        new Thread(new GraphicThread(200)).start();
    }
}
