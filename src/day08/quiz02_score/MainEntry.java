package day08.quiz02_score;

import java.util.Scanner;

public class MainEntry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student sd ;
        Person ps ;
        int choice = 0;
        choice = sc.nextInt();
        switch (choice){
            case 1 :
                sd = new Student();
                sd.input();
                sd.disp();
                break;
            case 2:
                ps = new Person();
                ps.input();
                ps.disp();
                break;
        }
    }
}
