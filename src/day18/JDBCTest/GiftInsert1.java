package day18.JDBCTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class GiftInsert1 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("org.mariadb.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/encore","root","maria");

        //3.사용(DML - Insert) - Statement / Prepared
        Statement stmt = conn.createStatement();
        // INSERT INTO gift VALUES(11,'스팸',800,1200)
        String sql = "INSERT INTO gift VALUES(12,'프랑크소세지',1000,2000)"; // 직접넣기
//        String sql = "INSERT INTO gift VALUES(" + args[0]+",'"+args[1]+"',"+args[2]+","+args[3]+")";
        int result = stmt.executeUpdate(sql);
        System.out.println(result + " 개 데이터 추가 성공함");
        conn.commit();

        // 4. 닫기
        stmt.close();
        conn.close();
    }
}
