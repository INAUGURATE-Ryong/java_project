package day08.quiz01_inheritance;

import java.util.Scanner;

/*
       Employee <--------   Regular <--------  Sales
사번,이름,부서,연락처     정규직 급여          커미션
알바(P) = 근무일수 x 시급
 */
public class Employee {  //super class
    protected String empno = "";
    protected String ename = "";
    protected String dept = "";
    protected String tel = "";
    Scanner sc = new Scanner(System.in);

    public Employee() {
        // input();

    }
    public void input(){
        String ename,empno,dept,tel;
        System.out.println("사번을 입력하세요.");  this.empno = sc.next();
        System.out.println("이름을 입력하세요.");  this.ename = sc.next();
        System.out.println("부서를 입력하세요.");  this.dept = sc.next();
        System.out.println("전화번호를 입력하세요.(-으로 구분)"); this.tel = sc.next();


    }

    public Employee(String empno, String ename, String deptno, String tel) {
        this.empno = empno;
        this.ename = ename;
        this.dept = deptno;
        this.tel = tel;
    }

    public String getEmpno() {
        return empno;
    }

    public void setEmpno(String empno) {
        this.empno = empno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getDeptno() {
        return dept;
    }

    public void setDeptno(String deptno) {
        this.dept = deptno;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
    public void disp(){
        System.out.println("사번 : " + empno +" 이름 : "+ ename +" 부서 : " + dept+" 연락처 : "+tel);
    }
}
