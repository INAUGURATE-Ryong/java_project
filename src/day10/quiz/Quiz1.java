package day10.quiz;

public class Quiz1 {
    public static void main(String[] args) {
        String str = "abcDEFGHeijwEIMPYmnqr";
        //위의 str 문자열을 대문자는 소문자로 소문자는 대문자로 출력하기
        String s2 = str.substring(0, str.indexOf('D')).toUpperCase();
        String s3 = str.substring(str.indexOf('D'), str.indexOf('e')).toLowerCase();
        String s4 = str.substring(str.indexOf('e'), str.lastIndexOf('E')).toUpperCase();
        String s5 = str.substring(str.lastIndexOf('E'), str.indexOf('m')).toLowerCase();
        String s6 = str.substring(str.indexOf('m')).toUpperCase();

        System.out.println(s2 + s3 + s4 + s5 + s6);

        String result = "";
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch >='A' && ch <='Z'){
                result+=String.valueOf(ch).toLowerCase();
            }else if(ch>='a' && ch<='z'){
                result +=String.valueOf(ch).toUpperCase();
            } else {
                result +=ch;
            }
        }
        System.out.println(result);

//
//        String[] s = str.split("");
//
//
//        for (int i=0;i<str.length();i++) {
//            if (s[i].charAt(0) >= 97) {
//                System.out.println(s[i].toUpperCase());
//            } else {
//                System.out.println(s[i].toLowerCase());
//            }
//        }
//
//        String str2 = "";
//        char ch;
//
//        for(int i = 0; i < str.length(); i++) {
//            ch = str.charAt(i);
//            if(ch >= 'a' && ch <= 'z') {
//                str2 += (char)(ch + 'A' - 'a');
//            }
//            else
//                str2 += (char)(ch - 'A' + 'a');
//        }
//        System.out.println(str2);


    }
}



