package day18.JDBCTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class GiftDelete1 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("org.mariadb.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/encore","root","maria");
        Statement stmt = conn.createStatement();
        String sql = "DELETE FROM gift WHERE gno = 16"; // 직접넣기
        int result = stmt.executeUpdate(sql);
        System.out.println(result + " 개 데이터 삭제 성공함");
        conn.commit();

        stmt.close();
        conn.close();


    }
}
