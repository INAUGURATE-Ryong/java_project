package day07.exam04;
// getter , setter 자동화는 알트 인서트 누르고 하면댐  , 아니면 오른쪽 클릭 제너럴에 있음
public class Circle {
    private int x,y, r;

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

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public void display(){
        System.out.println(x+", "+y+", "+r);
    }
}
