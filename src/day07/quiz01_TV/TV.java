package day07.quiz01_TV;

public class TV {
    //color, channel;
    // getter / setter method
    private String color =  "";
    private int  channel =0;
    public TV() { //default constructor    //생성자 함수
        color = "gray";
        channel = 11;
    }  // 이렇게 선언해놓으면 set으로 값 설정안하고 불러오면 gray,11이 출력
    // default constructor 갖고 있음(단 사용자가  생성자함수 재정의 하면 디폴트 생성자함수 기능 상실
    public TV(String color){//생성자 함수
        this.color = color;
    }
    public TV(int channel){//생성자 함수
        this.channel = channel;
    }
    public TV(String color,int channel){//생성자 함수
        this.color = color;
        this.channel = channel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }
    //output
    public void display(){
        System.out.println(channel+"번 채널짱 \n" +color+"도 짱.");
    }
}
