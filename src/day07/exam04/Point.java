package day07.exam04;

public class Point {
    private int x,y; // 멤버변수
    //생성자 함수 2개 -자동화  getter /setter 처럼 알트 인서트 누르고 constructor

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(int x) {
        this.x = x;
    }
    //멤버함수

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void display(){
        System.out.println(x+", "+y);
    }
}
