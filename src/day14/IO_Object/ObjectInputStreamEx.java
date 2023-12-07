package day14.IO_Object;

import java.io.*;

public class ObjectInputStreamEx {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        InputStream is = new FileInputStream("grade.dat");
        ObjectInputStream ois = new ObjectInputStream(is);
        Grade dto = (Grade) ois.readObject();
        System.out.println("result output : " + dto);
        ois.close();
    }
}
