package day11.quiz;

import java.util.ArrayList;

// 문제] Customers class를 만들어서 name,address, tel 의 필드 생성자함수, set/get method
import java.util.Scanner;
public class Customers {
    String name;
    String address;
    String tel;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getTel() {
        return tel;
    }
    public void setTel(String tel) {
        this.tel = tel;
    }

    public Customers() {
        this.name = "무명";
        this.address = "저승";
        this.tel = "000-444-4444";
    }

    @Override
    public String toString() {
        return "Customers [name=" + name + ", address=" + address + ", tel=" + tel + "]";
    }

    public Customers(String name, String address, String tel) {
        this.name = name;
        this.address = address;
        this.tel = tel;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름: ");
        this.name = sc.next();
        System.out.print("주소: ");
        this.address = sc.next();
        System.out.print("전화번호: ");
        this.tel = sc.next();
    }
}