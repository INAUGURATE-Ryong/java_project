package day06.quiz;

import java.util.Scanner;

public class Quiz03 {
    //문제1] info() { 이름, 연락, 주소 출력 함수}
    //문제2] abs(int x) { 절대값 구하는 함수 }
    //문재3] max() { 정수 2개 입력 받아수 큰수 출력 함수}
    public static void info(){
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        String phone = sc.next();
        String address = sc.next();
        System.out.println("이름 : " + name+"  연락처 : " +phone+"  주소 : "+address);
    }
    public static void abs(int x){
        if (x>0){
            System.out.println(x);
        } else {
            System.out.println(-x);
        }

    }
    public static void max(int a,int b){
        if(a>b){
            System.out.println(a);
        }else {
            System.out.println(b);
        }
    }
    public  static void max(){
        Scanner sc = new Scanner(System.in);
        System.out.println("x,y = ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        int result = (x>y) ? x:y;
        System.out.println("둘중 큰값은" + result);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        info();
        abs(-1);
        abs(10);
//        max(5,7);
//        max(9,7);
        abs(0);
        max(sc.nextInt(),sc.nextInt());


    }
}
/*
public static void info() {
		Scanner sc = new Scanner(System.in);
		System.out.println("name, phone, address = ");
		String name = sc.next();
		String phone = sc.next();
		String address = sc.next();
		System.out.println(name+"님의 연락처 : "+phone+", 주소는 : "+ address+"에 살고 계시군요.");
	}
	//문제2] abs(int x) { 절대값 구하는 함수   }
	public static void abs(int x) {
		if( x < 0 ) x = -x;
		else x = x;
		System.out.println("절대값 : " + x );
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		info();
		System.out.println("정수 데이터 입력 : ");
		int su = sc.nextInt();
		abs(su);
		max();
		System.out.println("2수 입력 : ");
		max(sc.nextInt(), sc.nextInt());
	}

	//문제3] max(){  정수2개 입력 받아서 큰수 출력 함수  }
	public static void max() {
		Scanner sc = new Scanner(System.in);
		System.out.println("x , y = ");
		int x = sc.nextInt();
		int y = sc.nextInt();

		int result = ( x > y ) ? x : y;
		System.out.println(x+"와 "+y+" 중에서 max = " +result);
	}

	public static void max(int x, int y) {
		int result = ( x > y ) ? x : y;
		System.out.println(x+"와 "+y+" 중에서 max = " +result);
	}
}
 */
