package day10.API_UtilPackage;

import java.util.StringTokenizer;

public class StringTokenizerEx1 {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("this is a test");
        StringTokenizer st2 = new StringTokenizer("김/인/아/에/이","/");

        while (st.hasMoreTokens()) { //  다음 요소가 있으면 true 리턴  split 이랑 비슷함.
            System.out.println(st.nextToken());
        }

        while (st2.hasMoreTokens()){
            System.out.println(st2.nextToken());
        }

        System.out.println("===========================");
        String[] result = "this is a test".split("\\s");  // \\s는 공백
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);

        }
    }
}
