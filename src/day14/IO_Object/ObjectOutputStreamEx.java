package day14.IO_Object;

import java.io.*;

public class ObjectOutputStreamEx {
    public static void main(String[] args) throws Exception {// throws IOException {
        Grade vo = new Grade();
//        vo.setSubject("미술");
//        vo.setScore(80);
        vo.setSubject("전산");
        vo.setScore(95);
        System.out.println(vo); //화면출력

        OutputStream os = new FileOutputStream("grade.dat");
        ObjectOutputStream oos = new ObjectOutputStream(os);

        oos.writeObject(vo); // 파일 grade.dat안에 쓴다.
        oos.close();
    }
}
