package development_Quiz;
public class Score_dev1_Method_FriendsPower {
}
/*
package ex01;

import java.util.Scanner;

public class ScoreMethod {

	//성적
	public static void stu_score() {
		Scanner sc = new Scanner(System.in);

		System.out.print("name = ");
		String name = sc.next();
		System.out.print("국어 점수를 입력하세요(0~100) = ");
		int kor = sc.nextInt();
		System.out.print("영어 점수를 입력하세요(0~100) = ");
		int eng = sc.nextInt();
		System.out.print("전산 점수를 입력하세요(0~100) = ");
		int com = sc.nextInt();

		int total = total(kor, eng, com);

		double avg = avg(total);

		char grade = grade(avg);

		System.out.println();
		print_score(name, kor, eng, com, total, avg, grade);
	}

	public static int total(int kor, int eng, int com) {
		int total = kor + eng + com;
		return total;
	}

	public static double avg(int total) {
		double avg = total / 3.0;
		return avg;
	}

	public static char grade(double avg) {
		if(avg >= 90) {
			return  'A';
		}else if(avg >= 80) {
			return  'B';
		}else if(avg >= 70) {
			return  'C';
		}else if(avg >= 60) {
			return  'D';
		}else {
			return  'F';
		}
	}

	public static void print_score(String name, int kor, int eng, int com, int total, double avg, char grade) {
		System.out.println(name + "님의 성적표 *****");
		System.out.println("국어 : " + kor + " 영어 : " + eng + " 전산 : " + com);
		System.out.println("총점 : " + total + " 평균 : " + avg + " 학점 : " + grade);
	}

	public static void main(String[] args) {
		stu_score();
	}

}
 */

/*
package ex05.method_overload;
​
import java.util.Scanner;
​
public class ScoreEx1 {
	public static int[] input() {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[3];

		for (int i=0;i<3;i++) {
			a[i] = sc.nextInt();
		}
		return a;
	}

	public static String input(String name) {
		return name;
	}

	public static int total(int...a) {
		int sum = 0;
		for (int i=0;i<a.length;i++) {
			sum += a[i];
		}
		return sum;
	}

	public static double average(int...a) {
		double avg = total(a) / a.length;
		return avg;
	}

	public static char grade(int...a) {
		double avg = average(a);
		char grd;

		switch ((int)(avg/10)) {
		case 10:
		case 9:
			grd = 'A';
			break;
		case 8:
			grd = 'B';
			break;
		case 7:
			grd = 'C';
			break;
		case 6:
			grd = 'D';
			break;
		default:
			grd = 'F';
			break;
		}
		return grd;
	}

	public static void output() {
		int[] a = input();
		String name = input("park");

		System.out.println("이름: "+name);
		System.out.println("총점: "+total(a));
		System.out.println("평균: "+average(a));
		System.out.println("학점: "+grade(a));
	}

	public static void main(String[] args) {
		output();
	}
}
 */
/*
package day6.method;

import java.util.Scanner;

public class MethodQuiz05 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String name = "";

        int kor = 0;
        int eng = 0;
        int math = 0;

        name = inputName(sc);
        System.out.print("국어 ");
        kor = input(sc);
        System.out.print("영어 ");
        eng = input(sc);
        System.out.print("전산 ");
        math = input(sc);

        output(name,kor,eng,math);

    }

    // 성적 입력 메소드
    public static int input(Scanner sc){
        int score = 0;

        System.out.print("점수 입력 : ");
        score = sc.nextInt();

        return score;
    }

    public static String inputName(Scanner sc){
        String name = "";

        System.out.print("이름 입력 : ");
        name = sc.next();

        return name;
    }

    // 총점 구하는 메소드
    public static int getTotal(int kor, int eng, int math){
        return kor+eng+math;
    }

    // 평균 구하는 메소드
    public static double getAvg(int num, double total){
        return total/num;
    }

    // 학점 구하는 메소드
    public static char getGrade(double avg){
        if(avg > 90){
            return 'A';
        }
        else if(avg>80){
            return 'B';
        }
        else if(avg>70){
            return 'C';
        }
        else if(avg>60){
            return 'D';
        }
        else{
            return 'F';
        }
    }

    public static void output(String name, int kor, int eng, int math){
        int total = getTotal(kor,eng,math);
        double avg = getAvg(3,total);
        char grade = getGrade(avg);

        System.out.println("====== 성적표 ======");
        System.out.println("이름 : " + name);
        System.out.println("국어 : " + kor + " / " + "영어 : " + eng + " / " + "전산 : " + math);
        System.out.println("총점 : " + total);
        System.out.printf("평균 : %.2f\n", avg);
        System.out.println("학점 : " + grade);
    }
}
 */

/*  [전역변수 활용]
import java.util.Scanner;

public class Score_dev1_Method {

    private static String name;
    private static int kor, eng, com;

    public static void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("성적을 입력할 학생 이름을 입력하세요.");
        name = sc.next();

        do {
            System.out.print("국어 점수를 입력하세요(0~100) = ");
            kor = sc.nextInt();
        } while (kor < 0 || kor > 100);

        do {
            System.out.print("영어 점수를 입력하세요(0~100) = ");
            eng = sc.nextInt();
        } while (eng < 0 || eng > 100);

        do {
            System.out.print("전산 점수를 입력하세요(0~100) = ");
            com = sc.nextInt();
        } while (com < 0 || com > 100);
    }

    public static int total() {
        return kor + eng + com;
    }

    public static double average() {
        Scanner sc = new Scanner(System.in);
        System.out.println("과목수를 입력하세요");
        int c = sc.nextInt();
        return (double) total() / c;
    }

    public static char grade() {
        char result = ' ';

        if (average() <= 100 && average() >= 90) {
            result = 'A';
        } else if (average() >= 80) {
            result = 'B';
        } else if (average() >= 70) {
            result = 'C';
        } else if (average() >= 60) {
            result = 'D';
        } else {
            result = 'F';
        }
        return result;
    }

    public static void output() {
        System.out.println("이름: " + name);
        System.out.println("총점: " + total());
        System.out.println("평균: " + average());
        System.out.println("학점: " + grade());
    }

    public static void main(String[] args) {
        input();
        output();
    }
}


 */

/*
package javaclass.scoreGrade;

import java.util.Scanner;

public class scoreFunction1 {
    //입력함수(이름, 국어, 영어, 전산점수)
    public static int inputScore(Scanner sc){
        int score = 0;

        System.out.print("점수 입력 : ");
        score = sc.nextInt();

        return score;
    }

    public static String inputName(Scanner sc){
        String name;
        System.out.println("이름입력: ");
        name = sc.next();
        return name;
    }

    public static int scoreTotal(int x, int y, int z)
    {
    int total = x+y+z;
    return total;
    }

    public static double ScoreAverage(int x,int y, int z)
    {
        double avg = scoreTotal(x, y, z)/3;
        return avg;
    }
    public static char scoreGrade(int num)
    {
        char grade = ' ';
        switch ( (int) num / 10 ) {	//switch ( total / 30 ) {
            case 10:
            case 9: grade = 'A';	break;
            case 8: grade = 'B';	break;
            case 7: grade = 'C';	break;
            case 6: grade = 'D';	break;
            default: grade= 'F';
        } // end switch
        return grade;
    }
    public static void scoreOutput(String name, int kor,int eng, int math)
    {
        System.out.println("\n"+name+"학생의 성적표입니다.--------------------");
        System.out.println("총점은"+scoreTotal(kor, eng, math)+
                "이고 평균은 "+ScoreAverage(kor, eng, math)+"이고 평점은 "+scoreGrade(scoreTotal(kor, eng, math))+"입니다");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int kor, eng, math;
       String name;
       name = inputName(sc);
       kor=inputScore(sc);
       eng=inputScore(sc);
       math= inputScore(sc);

       scoreOutput(name, kor, eng, math);

    }
 */

/*  배열
package quiz;
import java.util.Scanner;
public class ScoreMethod {
	public static void input(int cnt, String[] name_arr, int[][] score, String name, int... x) {
		name_arr[cnt] = name;
		for(int i = 0; i < score[0].length; i++) {
			score[cnt][i] = x[i];
		}
	}
	public static int total(int[] score) {
		int total = 0;
		for(int i = 0; i < score.length; i++) {
			total += score[i];
		}
		return total;
	}
	public static double average(int[] score) {
		return (double)total(score)/score.length;
	}
	public static char grade(int[] score) {
		double avg = average(score);
		if(avg >= 90) return 'A';
		else if (avg >= 80) return 'B';
		else if (avg >= 70) return 'C';
		else if (avg >= 60) return 'D';
		else return 'F';
	}
	public static void output(String[] name_arr, int[][] score) {
		for(int i = 0; i < name_arr.length; i++) {
			System.out.println(name_arr[i] + "님의 성적표");
			System.out.printf("국어 : %d, 영어 : %d, 전산 : %d\n총점 : %d, 평균 : %.2f, 학점 : %c\n",
					score[i][0], score[i][1], score[i][2], total(score[i]), average(score[i]), grade(score[i]));
		}

	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int INWON = 3;
		String[] subject_name = {"국어", "영어", "전산"};
		int SUBJECT_NUM = subject_name.length;
		String[] name_arr = new String[INWON];
		int[][] score = new int[INWON][SUBJECT_NUM];
		String name;
		for(int i = 0; i < INWON; i++) {
			System.out.print("이름을 입력하세요 : ");
			name = sc.next();
			int[] score_tmp = new int[SUBJECT_NUM];
			for(int j = 0; j < SUBJECT_NUM; j++) {
				System.out.printf("%s 점수 : ", subject_name[j]);
				score_tmp[j] = sc.nextInt();
			}
			input(i, name_arr, score, name, score_tmp[0], score_tmp[1], score_tmp[2]);
		}
		output(name_arr, score);
	}
}
 */

/*
public class ScoreMethod_return {

	public static void input() {
        String name = null;
        int kor,eng,com;
        Scanner score_in = new Scanner(System.in);
        System.out.print("Enter your name : ");
        Scanner name_in = new Scanner(System.in);
        name = name_in.nextLine();
        System.out.print("Enter your Korean score : ");
        kor = score_in.nextInt();
        System.out.print("Enter your English score : ");
        eng = score_in.nextInt();
        System.out.print("Enter your Computer score : ");
        com = score_in.nextInt();
        System.out.println("\n\n****  " +name +"님의 성적표 **********");
		System.out.println("국어 : " + kor + " 영어 : " + eng + " 전산 : " + com);
        total_cal(kor,eng,com);
    } // input end

    public static int total_cal(int kor, int eng, int com) {
        int total=0;
        total = kor + eng + com;

        System.out.printf("총점 : %d ", total );
        avg_cal(total);
        return total;
    } // total_cal end

    public static double avg_cal(int total) {
        double avg=0.0;
        avg = (double)total/3;

        System.out.printf("평균 : %.1f ", avg );
        grade_cal(avg);
        return avg;
    } // avg_cal end

    public static void grade_cal(double avg) {
        int avg_tmp=0;
        char grade=' ';

        switch((int)avg/10) {
	        case 10:
	        case 9:
	            grade = 'A';
	            break;
	        case 8:
	            grade = 'B';
	            break;
	        case 7:
	            grade = 'C';
	            break;
	        case 6:
	            grade = 'D';
	            break;
	        default:
	            grade = 'F';
        }
        System.out.printf("평점(학점) : %c ", grade );
    } // grade_cal end

    public static void output() {
    	input();
    }

    public static void main(String[] args) {
        output();
    } // main end
}
 */