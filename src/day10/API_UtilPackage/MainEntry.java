package day10.API_UtilPackage;

import java.util.Calendar;
import java.util.Date;

public class MainEntry {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance(); // system이 갖고 있는 날짜 얻어옴
        System.out.println(c.get(Calendar.YEAR)+ "년");
        System.out.println((c.get(Calendar.MONTH)+1)+ "월"); // 월은 0부터 시작해서 +1을 해야함
        System.out.println(c.get(Calendar.DATE)+ "일");

        Date date = new Date();
        int h = date.getHours();
        int m = date.getMinutes();
        int s = date.getSeconds();
        System.out.println("현재 시간은 " + h +" : "+m+" : " +s);

        Calendar c1 = Calendar.getInstance();
        Calendar c2 = Calendar.getInstance();

        c2.set(2022,12,20,0,0);

        if(c1.after(c2)){  // c1의 날짜와 시간이 c2보다 늦다면
            System.out.println('O');
        }else if(c1.before(c2)){  // c1의 날짜와 시간이 c2보다 이른다
            System.out.println("X");
        } else if ((c1.equals(c2))) { // c1의 날짜와 시간이 c2와 같다
            System.out.println("==");

        }

    }
}
