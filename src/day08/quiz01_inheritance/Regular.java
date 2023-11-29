package day08.quiz01_inheritance;

public class Regular extends Employee {
    protected double pay;

    public Regular() {
      //  input();

    }

    public void input() {
        super.input();
        System.out.println("급여를 입력하세요.");
        pay = sc.nextInt();
    }

    public Regular(String empno, String ename, String dept, String tel, double pay) {
        super(empno, ename, dept, tel);
        this.pay = pay;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(int pay) {
        this.pay = pay;
    }

    public void disp() {
        super.disp();
        System.out.println("급여 : " + pay);
    }
}
