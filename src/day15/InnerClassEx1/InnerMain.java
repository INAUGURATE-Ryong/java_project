package day15.InnerClassEx1;

import java.awt.*;
import java.awt.event.*;

public class InnerMain {  //outer class

    public static void main(String[] args) {
        Frame frame = new Frame("이번트 처리 - 이너 클래스"); // 프레임(화면)
        Button btn = new Button("Button - Start");

        //2.
        btn.addActionListener(new ActionListener() {  // 익명 클래스, 무명클래스
            @Override
            public void actionPerformed(ActionEvent e) { // 버튼이 눌렸을 때 나올의 모든정보를 가지고 있음 event 메서드

                System.out.println("ACtionEvent 발생했습니다.");
                System.out.println(e.getActionCommand());
                System.out.println(e.getSource());
                System.out.println("이것은 지금만든 익명클래스 이벤트 처리");

            }
        }); // 버튼에 액션이벤트 추가
        frame.addWindowListener(new WindowAdapter() {  // 프레임 창 닫기 활성화 시키는 이벤트
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        frame.add(btn); // 프레임(윈도우)에 버튼 컴포넌트를 추가
        frame.setVisible(true);
        frame.setSize(300,200);
        frame.setLocation(300,150);
    }
}

/*

package day15.InnerClassEx1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InnerMain {  //outer class

    public static void main(String[] args) {
        Frame frame = new Frame("이번트 처리 - 이너 클래스"); // 프레임(화면)
        Button btn = new Button("Button - Start");

        //2.
        btn.addActionListener(new ActionListener() {  // 익명 클래스, 무명클래스
            @Override
            public void actionPerformed(ActionEvent e) { // 버튼이 눌렸을 때 나올의 모든정보를 가지고 있음 event 메서드

                    System.out.println("ACtionEvent 발생했습니다.");
                    System.out.println(e.getActionCommand());
                    System.out.println(e.getSource());
                    System.out.println("이것은 지금만든 익명클래스 이벤트 처리");

            }
        }); // 버튼에 액션이벤트 추가

        frame.add(btn); // 프레임(윈도우)에 버튼 컴포넌트를 추가
        frame.setVisible(true);
        frame.setSize(300,200);
        frame.setLocation(300,150);
    }
}
*/

/*

package day15.InnerClassEx1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InnerMain {  //outer class
    class EventHandler implements ActionListener{  // inner class
        @Override
        public void actionPerformed(ActionEvent e) {  // 버튼이 눌렸을 때 나올의 모든정보를 가지고 있음 event 메서드
            System.out.println("ACtionEvent 발생했습니다.");
            System.out.println(e.getActionCommand());
            System.out.println(e.getSource());
            System.out.println();

        }
    }
    public static void main(String[] args) {
        Frame frame = new Frame("이번트 처리 - 이너 클래스"); // 프레임(화면)
        Button btn = new Button("Button - Start");

        //1.
        EventHandler handler = new InnerMain().new EventHandler();
        btn.addActionListener(handler); // 버튼에 액션이벤트 추가

        frame.add(btn); // 프레임(윈도우)에 버튼 컴포넌트를 추가
        frame.setVisible(true);
        frame.setSize(300,200);
        frame.setLocation(300,150);
    }
}
*/