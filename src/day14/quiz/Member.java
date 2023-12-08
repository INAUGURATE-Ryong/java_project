package day14.quiz;

import day11.QuizTeacher.Customer;

import java.util.ArrayList;
import java.util.Scanner;

public class Member extends BMIRecord { // controller
    //
    ArrayList<BMIRecord> list = new ArrayList<BMIRecord>();


    public Member() {
        super();
    }

    public Member(String name, double height, double weight, String gender) {
        super(name, height, weight, gender);
    }

    //
    public void MemberAdd(String name, double height, double weight, String gender) { // 추가
        BMIRecord bmi = new BMIRecord(name, height,weight,gender);
        list.add(bmi);
    }

    public void MemberAdd() { // 추가2
        Scanner sc = new Scanner(System.in);
        System.out.print("이름 >> ");
        name = sc.next();
        System.out.print("키 >> ");
        height = sc.nextDouble();
        System.out.print("몸무게  >> ");
        weight = sc.nextDouble();
        System.out.print("성별  >> ");
        gender = sc.next();

        BMIRecord bmi = new BMIRecord(name,height,weight,gender );
        list.add(bmi);
    }

    public void MemberRmv(int i) { // 삭제
        System.out.println("\n\n* 삭제된 고객");
        list.get(i - 1).display();
        System.out.println("--------------");
        list.remove(i - 1);
    }

    public void CustomerCh(int i, String name, String add, String tel) { // 수정
//        Customer c = new Customer(name, add, tel);
//        list.set(i - 1, c); // 교체
    }

    public void display() {
        System.out.println("저장된 고객 수 : " + list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.println();
            System.out.println("- " + (i + 1) + "번 -");
            list.get(i).display();
        } // for
    }// display()
}// CustomerManager