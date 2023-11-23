package day04.exam01;

import java.util.Scanner;

public class Control_While2 {
    public static void main(String[] args) {
        int su = 0;
        do{
            System.out.println("jumsu(0~100 = ? ");
            su = new Scanner(System.in).nextInt();

            System.out.println(su);
        } while (su <0 || su >100);
    }
}
