package day12.quiz;

import java.util.Scanner;

public class MainEntry {

    static String title;
    static String category;
    static char lend;
    static String lendName;
    static String lendDate;

    public static void menu() {
        System.out.println("\n\n*-*-*-*-* 메뉴 *-*-*-*-*");
        System.out.println("1. 대여 정보 입력");
        System.out.println("2. 대여 정보 삭제");
        System.out.println("3. 대여 정보 수정");
        System.out.println("4. 모든 고객 보기");
        System.out.println("5. 종료");
        System.out.println("----------------------");
        System.out.print(" >> ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VideoManager vm = new VideoManager();
        try {
            while (true) {  //무한루프 --> 탈출구문
                menu();
                int inNum = sc.nextInt();

                try {
                    switch (inNum) {
                        case 1:
                            System.out.println("\n*-*-*-* 1. 대여 정보 입력 *-*-*-*");
                            vm.VideoAdd();
                            System.out.println("* 입력완료");
                            break;
                        case 2:
                            System.out.println("\n*-*-*-* 2. 대여 정보 삭제 *-*-*-*");
                            vm.display();
                            System.out.println("---------------------------");
                            System.out.print("삭제할 고객의 번호를 입력하세요 >> ");
                            inNum = sc.nextInt();
                            vm.VideoRmv(inNum);
                            break;
                        case 3:
                            System.out.println("\n*-*-*-* 3. 고객 정보 수정 *-*-*-*");
                            vm.display();
                            System.out.println("---------------------------");
                            System.out.print("수정할 고객의 번호를 입력하세요 >> ");
                            inNum = sc.nextInt();
                            System.out.println("수정할 고객의 정보를 입력하세요.");
                            vm.VideoAdd();
                            vm.VideoCh(inNum, title,category,lend,lendName,lendDate);
                            break;
                        case 4:
                            System.out.println("\n*-*-*-* 4. 모든 고객 보기 *-*-*-*");
                            vm.display();
                            break;
                        case 5:
                            System.out.println("\n* 프로그램을 종료합니다.");
                            System.exit(0);
                            break;
                        default:
                            System.out.println("\nerr)잘못입력하셨습니다. 다시 입력해주세요.");
                    } // switch
                } catch (Exception e) {
                    System.out.println("err) 없는 고객입니다. 다시 입력해주세요.");
                } // try catch
            } // while
        } catch (Exception e) {
            System.out.println("err) 잘못 입력하셨습니다. 프로그램을 종료합니다.");
        }//


    }
}
