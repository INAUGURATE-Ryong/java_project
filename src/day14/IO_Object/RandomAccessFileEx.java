package day14.IO_Object;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileEx {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        RandomAccessFile raf = new RandomAccessFile("sawon.txt","rw");
//        RandomAccessFile raf = new RandomAccessFile("c:\\dell\\sawon.txt","r");

        for(int i=0; i<=10;i++){
//            raf.seek(i*100);
            raf.seek(i*200); //
            String str = "hello";
            raf.writeUTF(str + i); // 문자 쓸때는 utf

//            raf.writeInt(i); // 쓰기
        }
        for (int i = 0; i <= 10; i++) {
            raf.seek(i*200);
//            System.out.println(raf.readInt());  // 읽기
            System.out.println(raf.readUTF());  // 문자 읽기

        }
        System.out.println("string print success!");
        raf.close();
    }
}
