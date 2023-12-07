package day14.IO_File;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
//바이트 단위 카피
public class FileCopy {
    public static void main(String[] args) throws Exception { // 예외처리 위임
        //읽기 객체 - FileInputStream
        InputStream is = new FileInputStream("ccc.png");
        //쓰기 객체 - FilesoutStream
        OutputStream os = new FileOutputStream("C:\\git-test\\c.png");

        long start = System.currentTimeMillis();  // 현재 시스템의 시간을 milliseconds(밀리초) 단위로 얻어와서 변수 start에 저장

        while (true){
            int inputData = is.read();
            if(inputData == -1)  break;
            os.write(inputData);
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start); // 복사(작업) 에 걸린 시간
        is.close();
        os.close();
        System.out.println("copy success!!");
    }
}
