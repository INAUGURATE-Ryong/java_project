package day10.API_String;

public class StringMain {
    public static void main(String[] args) {
        String s1 = "happy";
        String s2 = "SEOUL";

        System.out.println("s1 = "+s1 +","+ "s2 = "+s2);
        System.out.println(s1.concat(s2)); // 문자 결합
        System.out.println(s1+s2);// 문자 결합
        System.out.println(s2.replace("EO","korea")); // EO라는 단어를 korea로 바꿔서 출력
        // 원래 값에는 변화가 없음
        System.out.println("s1 = "+s1 +","+ "s2 = "+s2);
//        s2 = s2.replace("EO","korea"); // 원래 값 바꾸기 위해서는 바꾸고 담아야 한다.

        String s3 = new String("         ab         cd      ");
        System.out.println(s3);
        System.out.println("length = " + s3.length()); // 문자열 길이
        s3 = s3.trim();//공백제거
        System.out.println("length = " + s3.length());
        System.out.println(s3);

//        String s4 = new String("abc asdgasdkl asd123 12zx;   kfjszdl;fkjd as");
        String s4 = new String("abc/asdgasdkl/asd123/12zx;/kfjszdl/fkjd as");
//        String[] s5 = s4.split(" ");
        String[] s5 = s4.split("/");
        for (int i = 0; i < s5.length; i++) {
            System.out.println("분리된" + i+"번째 문자열 : "+s5[i]);

        }
        System.out.println("============================");

        String s6 = "123-4567-890";
        s5 = s6.split("-");
        for (int i = 0; i < s5.length; i++) {
            System.out.println("분리된" + i+"번째 문자열 : "+s5[i]);

        }

        String s7 = "1234567890abcdef    34567    78f88f8 string";
        char ch = s7.charAt(15);
        System.out.println(ch);
        System.out.println(s7.indexOf('f'));  // index값 찾기.
        System.out.println(s7.lastIndexOf('f')); // 문자열의 맨 마지막 f의 인덱스 값


        System.out.println(s7.substring(3)); // index 3부터 끝까지
        System.out.println(s7.substring(5,7));

        System.out.println("소문자 출력 toLowerCase() : " + s2.toLowerCase()); // 소문자로 변환
        System.out.println("대문자 출력 toUpperCase() : " + s1.toUpperCase()); // 대문자로 변환

    }
}
