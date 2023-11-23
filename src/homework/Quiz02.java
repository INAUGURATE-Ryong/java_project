package homework;

//*
//**
//***
//****
//*****  이모양 출력
public class Quiz02 {
    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++");

//*****
//****
//***
//**
//*  이모양 출력
        for (int i = 1; i <= 6; i++) {   // for(int i =5; i>=1 ; i--)   // for(int i=0;i <=5; i++
            for (int j = 6; i < j; j--) { // for(int j=1;j<=i;j++)   // for(int j=1; j <6-i; j++
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++");


//    *
//   **
//  ***
// ****
//*****

        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < 5 - i; j++) System.out.print(" ");
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++");

//*****
// ****
//  ***
//   **
//    *

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j < i; j++) System.out.print(" ");
            for (int j = 5; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}



//    *
//   ***
//  *****
// *******
//*********