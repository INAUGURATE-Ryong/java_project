package day08.quiz02_score;

import java.util.Scanner;

public class Person {
    protected String name, gender;
    protected int age;
    Scanner sc = new Scanner(System.in);

    public Person() {
    }
    public void input(){
        System.out.println("이름을 입력하세요."); this.name = sc.next();
        System.out.println("성별를 입력하세요."); this.gender = sc.next();
        System.out.println("나이를 입력하세요."); this.age = sc.nextInt();
    }

    public Person(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void disp(){
        System.out.println("이름 : " +name + "\t성별 : " + gender + "\t나이 : "+age);
    }
}
