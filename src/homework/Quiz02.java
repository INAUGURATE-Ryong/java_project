package homework;

//*
//**
//***
//****
//*****  이모양 출력
/*
public class Quiz02 {
    public static void main(String[] args) {
        for(int i=1;i<=6;i++){
            for(int j=1;j<i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
*/

//*****
//****
//***
//**
//*  이모양 출력

public class Quiz02 {
    public static void main(String[] args) {
        for(int i=1;i<=6;i++){
            for(int j=6;i<j;j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

