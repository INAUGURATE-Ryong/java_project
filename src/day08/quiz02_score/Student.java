package day08.quiz02_score;

public class Student extends Person {
    private int jumsu;

    public Student() {

    }
    public void input(){
        super.input();
        System.out.println("점수을 입력하세요.");  this.jumsu = sc.nextInt();

    }

    public Student(String name, String gender, int age, int jumsu) {
        super(name, gender, age);
        this.jumsu = jumsu;
    }

    public int getJumsu() {
        return jumsu;
    }

    public void setJumsu(int jumsu) {
        this.jumsu = jumsu;
    }
    public void disp(){
        super.disp();
        System.out.println("\n점수 : " + jumsu);
    }
}
