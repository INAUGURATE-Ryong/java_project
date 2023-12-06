package day13.IO_2.BufferedReader;

import java.io.*;

public class BufferedReaderEx {
    public static void main(String[] args) throws IOException { // 예외처리 위임 -JVM
        /*
        InputStream is = System.in; // 표준입력
        Reader reader = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(reader);
        */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("charator input : ");
        int str = Integer.parseInt(br.readLine());  // 입력받으면서 int로 형변환
        int str1 = Integer.parseInt(br.readLine());
//        String str = br.readLine(); // 예외발생, 여러개 데이터 읽기
//        String str2 = br.readLine(); // 예외발생
//        int su1 = Integer.parseInt(str);  // 문자를 숫자로 형변환
//        int su2 = Integer.parseInt(str2); // 문자를 숫자로 형변환
//
//        System.out.println(su1 + su2);
        System.out.println(str+str1);

    }
}
