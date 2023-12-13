package day17.JDBCTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MainEntry {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        //1. Driver load ... exception 발생
        Class.forName("org.mariadb.jdbc.Driver");
        System.out.println("driver load success!!!");

        //2. Connection & Open
                       // driver:IP:portNumber/DB명
        String url = "jdbc:mariadb://localhost:3306/encore";
        String uid = "root";
        String pwd = "maria";

        Connection conn = DriverManager.getConnection(url,uid,pwd);
        System.out.println("connection success!!");

        //3. 사용 (DM 명령어)

        //4. 닫기(자원 변환)
    }
}
