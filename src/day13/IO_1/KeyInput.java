package day13.IO_1;

public class KeyInput {
    public static void main(String[] args) throws Exception {
        int su1 = 0;

        System.out.println("데이터 입력 끝은 ctrl + z 누르세요");

        while ((su1 = System.in.read()) != -1){
//            System.out.print(su1 + "\t");
            System.out.print((char)su1 +"\t");  // 이러면 문자로 출력됨.
        }
        System.out.println();
    }
}
