package day18.JDBCTest;

import java.sql.*;

public class GiftInsert2 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("org.mariadb.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/encore","root","maria");

        //3.사용(DML - Insert) - Statement / Prepared
        String sql = "INSERT INTO gift VALUES(?,?,?,?)"; // 직접넣기
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1,15);
        pstmt.setString(2,"사탕세트");
        pstmt.setInt(3,50);
        pstmt.setInt(4,500);
        int result = pstmt.executeUpdate(); // 반환값이 없는 경우 - insert, update,delete
        System.out.println(result + " 개 데이터 추가 성공함");
        conn.commit();

        // 4. 닫기
        pstmt.close();
        conn.close();
    }
}
