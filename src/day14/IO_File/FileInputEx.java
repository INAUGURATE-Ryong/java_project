package day14.IO_File;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class FileInputEx {  //파일명만 입력하면 파일생성은 현 프로젝트가 들어있는 폴더에 생성됨.
                            // 절대경로로 입력하면 그 경로에 파일 생성
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
//            OutputStream os = new FileOutputStream("test.txt"); //상대경로, 예외발생함
            OutputStream os = new FileOutputStream("C:\\Users\\awya5\\Desktop\\수업자료\\4_Java\\sample.txt"); //절대경로
//            OutputStream os = new FileOutputStream("C:/Users/awya5/Desktop/수업자료/4_Java/sample.txt"); //절대경로

            while (true){
                System.out.println("문자열 입력 요망 : ");
                String str = sc.nextLine() + "\r\n";  // "\r\n" \r은 맨앞이동 \n은 엔터 같이 쓰는 이유는 \n만 하면 글을쓰고
                                                     // 엔터를 쳤을 떄 마지막 글쓴 위치 밑으로 이동하기 때문.
                if(str.equalsIgnoreCase("EXIT\r\n")){
                    System.out.println(str.length() + "byte 만큼 썼습니다.");
                    break;
                }
                os.write(str.getBytes()); // 예외발생. 읽어들인 문자 str의 길이(getBytes())만큼 써주세요.
                System.out.println(str);
            }
        }catch (FileNotFoundException e){
            System.out.println("FileNotFoundException");
            e.printStackTrace();
        }catch (IOException e){
            System.out.println("IOException");
            e.printStackTrace();
        }
    }
}
