package day10.API_StringBuffer;

public class StringBufferMain {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("This");
        System.out.println(sb);
        sb.append(" is pencil");  // 문자열 추가
        System.out.println(sb);

        sb.insert(7," my"); //문자열 삽입
        System.out.println(sb);

        sb.replace(8,10,"your");  // 문자열 변경
        System.out.println(sb);

        //System.out.println(sb.reverse()); // 문자열 역으로 출력
        System.out.println(sb.length()); //문자열 길이 출력

        sb.setLength(5);
        System.out.println(sb); //길이 5까지 만큼 만 출력

        System.out.println(sb);
        System.out.println(sb.capacity());
    }
}
