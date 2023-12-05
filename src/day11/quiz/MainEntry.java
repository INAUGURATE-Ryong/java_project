package day11.quiz;

import java.util.ArrayList;
import java.util.Scanner;

/*
고객 추가(add) / 삭제(remove) / 고객 리스트 출력(get,elements등) / 수정(set) / 프로그램 종료(exit) 프로그램 작성
 */
public class MainEntry {
    public static void main(String[] args) {
        ArrayList<Customers> list = new ArrayList();

        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print("동작할 시스템의 옵션을 고르세요\n"
                    + "1. 고객 추가\n"
                    + "2. 고객 삭제\n"
                    + "3. 고객 리스트 출력\n"
                    + "4. 고객 정보 수정\n"
                    + "5. 프로그램 종료 \n"
                    + "선택지 입력(숫자): ");
            int num = sc.nextInt();

            switch(num) {
                case 1:
                    c_add(list);
                    break;
                case 2:
                    c_delete(list);
                    break;
                case 3:
                    c_print(list);
                    break;
                case 4:
                    c_set(list);
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("올바른 선택지를 고르세요!!!");
            }
        }
    }
    public static ArrayList c_add(ArrayList list) {
        Customers c1 = new Customers();
        c1.input();
        list.add(c1);
        return list;
    }

    public static ArrayList c_delete(ArrayList list) {
        Scanner sc = new Scanner(System.in);
        System.out.print("몇 번째 고객을 삭제하시겠습니까? ");
        int num;
        num = sc.nextInt();
        list.remove(num);

        return list;
    }

    private static void c_print(ArrayList list) {
        System.out.println("list: " + list);
        System.out.println();
    }

    public static ArrayList c_set(ArrayList list) {
        Scanner sc = new Scanner(System.in);
        System.out.print("몇 번째 고객을 수정하시겠습니까? ");
        int num;
        num = sc.nextInt();
        Customers c1 = new Customers();
        c1.input();
        list.set(num, c1);
        return list;
    }
}
