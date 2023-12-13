package day18.JDBCTest;

import java.sql.*;
import java.util.Scanner;

public class GiftDelete2 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Scanner sc = new Scanner(System.in);
        Class.forName("org.mariadb.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/encore","root","maria");
        System.out.println("Gift Table delete number : gno = ");
        String sql = "DELETE FROM gift WHERE gno = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1,sc.nextInt());
        int result = pstmt.executeUpdate();
        System.out.println(result + " 개 데이터 삭제 성공함");
        conn.commit();

        pstmt.close();
        conn.close();


    }
}
