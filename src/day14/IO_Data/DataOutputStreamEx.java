package day14.IO_Data;

import java.io.*;

public class DataOutputStreamEx {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        File file = new File("test.txt");
        FileOutputStream fos = new FileOutputStream(file);
        DataOutputStream dos = new DataOutputStream(fos);

        dos.writeBoolean(true);
        dos.writeChar(65);
        dos.writeShort(100);
        dos.writeInt(5000);
        dos.writeLong(888888800);
        dos.writeFloat(12.34f);
        dos.writeDouble(8.8);
        dos.flush(); // buffer비우기

        System.out.println("test.txt 파일에" + dos.size() +" byte save");
        dos.close();

    }
}
