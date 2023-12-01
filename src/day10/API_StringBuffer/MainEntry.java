package day10.API_StringBuffer;

public class MainEntry {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer(); // 초기 용량 16
        System.out.println(sb.hashCode());  // 같은주소 갖는다.

        System.out.println("lenght     /    capacity");
        System.out.println(sb.length()+"         /   "+ sb.capacity());  // 길이와 용량 확인

        sb.append("encore");
        System.out.println(sb.length()+"        /   "+ sb.capacity());  // 길이와 용량 확인
        System.out.println("-----------------------------");

        sb.append("1234566776554");
        System.out.println(sb.length()+"      /   "+ sb.capacity());  // 길이와 용량 확인
        System.out.println("-----------------------------");

        sb.append("1234566776554 34562412457451234123");
        System.out.println(sb.length()+"      /   "+ sb.capacity());  // 길이와 용량 확인
        System.out.println("-----------------------------");

        sb.trimToSize(); // 자기가 가진 글자 수만큼 사이즈에 맞게 재조정
        System.out.println(sb.length()+"      /   "+ sb.capacity());  // 길이와 용량 확인
        System.out.println("-----------------------------");

        System.out.println(sb.hashCode()); // 같은주소 갖는다.

    }
}
