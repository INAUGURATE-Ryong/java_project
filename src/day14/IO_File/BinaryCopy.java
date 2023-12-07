package day14.IO_File;

import java.io.*;

//해당파일을 다른 폴더로 복사하여 저장
public class BinaryCopy {
    public static void main(String[] args) {
//        File src = new File("C:\\Windows\\explorer.exe");
//        File dist = new File("C:\\Users\\awya5\\Desktop\\수업자료\\4_Java\\workspace\\java-project\\expCopy.dat");

        File src = new File("C:\\Users\\awya5\\Pictures\\Screenshots\\ccc.png");
        File dist = new File("C:\\Users\\awya5\\Desktop\\수업자료\\4_Java\\workspace\\java-project\\ccCopy.png");

        FileInputStream fis = null;
        FileOutputStream fos = null;
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        int c;

        try {
            fis = new FileInputStream(src); // 파일입력바이트 스트림 연결
            fos = new FileOutputStream(dist); // 파일출력바이트 스트림 연결
            bis = new BufferedInputStream(fis);  // 버퍼 입력스트림 연결
            bos = new BufferedOutputStream(fos); // 버퍼 출력스트림 연결

            while ((c=bis.read())!=-1){
                bos.write((char)c);
            }
            System.out.println("파일 복사 성공!!");
            bis.close();
            bos.close();
            fis.close();
            fos.close();
        }catch (Exception e){
            System.out.println("파일 복사 오류 발생!");

        }


    }
}
