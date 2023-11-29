package day08.quiz01_inheritance;

public class Sales extends Regular{



    public Sales() {
        super.input();
        if(dept.equals("영업")) {
            pay = pay * 1.1;
        }
    }

    public void disp(){

        super.disp();
    }
}
