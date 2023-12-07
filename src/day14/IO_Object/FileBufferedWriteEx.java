package day14.IO_Object;

import java.io.*;
import java.util.Date;

public class FileBufferedWriteEx {
    public static void main(String[] args) throws IOException {
        String str, file;
        Date date = new Date();
        str = "파일 생성 시간 \r\n" + date + "\r\n";

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("파일 이름 입력 요망 : ");
        file = br.readLine();
        System.out.println("저장할 문자열 입력 요망 : ");
        str += br.readLine();

        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);
        

        bw.write(str);
        bw.close();
        System.out.println(file + "파일을 성공적으로 저장 했습니다.");

    }
}
