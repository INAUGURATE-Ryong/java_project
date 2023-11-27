package development_Quiz;

import java.util.Scanner;

//3과목 입력 받고, 총점, 평균, 학점(if or switch) 구하기
// do ~ while 을 이용해서 점수를 0~ 100점 까지만 입력할 수 있게 기능 추가
// 7명의 3과목 입력받고, 총점, 평균, 학점 을 구하는데 배열을 활용하기(1차원배열)
public class Score_dev1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // 객체 생성, 메모리에 할당, 생성자 함수 자동 호출
        System.out.println("성적을 입력할 인원수를 입력하세요.");
        int people = sc.nextInt();
        int[] kor = new int[people];
        int[] eng = new int[people];
        int[] com = new int[people];
        int[] total = new int[people];
        double[] avg = new double[people];


        String[] name = new String[people];
        for(int i =0;i<people;i++){
            System.out.print(((i+1)+"번째 학생 이름을 입력하세요"));
            name[i]= sc.next();
            System.out.print(name[i]+"의 국어 성적을 입력하세요.");
            kor[i] = sc.nextInt();
            System.out.print(name[i]+"의 수학 성적을 입력하세요.");
            eng[i] = sc.nextInt();
            System.out.print(name[i]+"의 전산 성적을 입력하세요.");
            com[i] = sc.nextInt();
            total[i] = kor[i] + eng[i] + com[i];
            avg[i] = (double) total[i] / people;
        }
        char [] result = new char[people];
        for (int i = 0; i < people; i++) {

            if (avg[i] <= 100 && avg[i] >= 90) {
                result[i] = 'A';
            } else if (avg[i] >= 80) {
                result[i] = 'B';
            } else if (avg[i] >= 70) {
                result[i] = 'C';
            } else if (avg[i] >= 60) {
                result[i] = 'D';
            } else {
                result[i] = 'F';
            }

        }
        for (int i = 0; i < people; i++) {
            System.out.println(name[i] + "님의 성적표 *****");
            System.out.println("국어 : " + kor[i] + "  영어 : " + eng[i] + "  전산 : " + com[i]);
            System.out.printf("총점 : %d  평균 : %.2f  학점 : %c", total[i], avg[i], result[i]);
            System.out.println();
        }
    }
}

/*
 //7명의 3과목을 입력받고, 총점, 평균, 학점 구하기
        Scanner sc = new Scanner(System.in);
        int mem;
        System.out.print("학생몇명?");
        mem = sc.nextInt();

        int[] kor = new int[mem];
        int[] eng = new int[mem];
        int[] math = new int[mem];
        int[] total = new int[mem];
        double[] avg = new double[mem];

        char[] gradec = new char[mem];

        int[] grade = new int[mem];

        String[][] name = new String[mem][10];

        for (int i = 0; i < mem; i++) {
            System.out.print((i+1)+"번째 학생이름을 입력하세요");
            name[i][0] = sc.next();

            System.out.println("성적을 입력하세요");
            System.out.printf("국어 :");
            kor[i] = sc.nextInt();
            System.out.printf("영어 :");
            eng[i] = sc.nextInt();
            System.out.printf("수학 :");
            math[i] = sc.nextInt();


            total[i] = kor[i] + eng[i] + math[i];
            avg[i] = (double) total[i] / 3;

        }

        for (int i = 0; i < mem; i++) {
            if (avg[i] >= 90)
                grade[i] = 90;
            else if (avg[i] >= 80)
                grade[i] = 80;
            else if (avg[i] >= 70)
                grade[i] = 70;
            else
                grade[i] = 0;

           //  System.out.println("평균: " + avg[i] + ",등급: " + grade[i]);


            switch (grade[i]) {
                case 90:
                    gradec[i] = 'A';
                    break;
                case 80:
                    gradec[i] = 'B';
                    break;
                case 70:
                    gradec[i] = 'C';
                default:
                    gradec[i] = 'F';
            }


        }
        for (int i = 0; i < mem; i++) {
            System.out.println("****" + name[i][0] + "의 성적표****");
            System.out.printf("평균: %.2f, 등급: %c\n", avg[i], gradec[i]);
        }
 */

/*
		Scanner sc = new Scanner(System.in);
		int stu = 3;
		int[] kor = new int[stu];
		int[] eng = new int[stu];
		int[] com = new int[stu];
		int[] total = new int[stu];
		double[] avg = new double[stu];
		char[] grade = new char[stu];
		int total_sum = 0;;
		double avg_sum = 0;


		String[] name = new String[stu];

		for(int i = 0; i < stu; i++) {
			System.out.print("이름을 입력하세요 : ");
			name[i] = sc.next();

			do {
			System.out.print("국어 점수를 입력하세요(0~100) = ");
			kor[i] = sc.nextInt();
			} while ( kor[i] < 0 || kor[i] > 100 );

			do {
			System.out.print("영어 점수를 입력하세요(0~100) = ");
			eng[i] = sc.nextInt();
			} while ( eng[i] < 0 || eng[i] > 100 );

			do {
			System.out.print("전산 점수를 입력하세요(0~100) = ");
			com[i] = sc.nextInt();
			} while ( com[i] < 0 || com[i] > 100 );

			System.out.println();

			total[i] = kor[i] + eng[i] + com[i];
			avg[i] = total[i] / 3.0;

			if(avg[i] >= 90) {
				grade[i] = 'A';
			}else if(avg[i] >= 80) {
				grade[i] = 'B';
			}else if(avg[i] >= 70) {
				grade[i] = 'C';
			}else if(avg[i] >= 60) {
				grade[i] = 'D';
			}else {
				grade[i] = 'F';
			}
		}

		for(int i = 0; i < stu; i++) {
			System.out.println(name[i] + "님의 성적표 *****");
			System.out.println("국어 : " + kor[i] + " 영어 : " + eng[i] + " 전산 : " + com[i]);
			System.out.println("총점 : " + total[i] + " 평균 : " + avg[i] + " 학점 : " + grade[i]);
			System.out.println();
			total_sum += total[i];
			avg_sum += avg[i];
		}

		System.out.println("학생 전체의 총합 점수 : " + total_sum);
		System.out.println("학생 전체의 점수 평균 : " + avg_sum / stu);

		}


	}
 */