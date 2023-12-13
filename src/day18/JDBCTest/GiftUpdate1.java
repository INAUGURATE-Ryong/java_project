package day18.JDBCTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class GiftUpdate1 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Scanner sc = new Scanner(System.in);
        Class.forName("org.mariadb.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/encore","root","maria");
        System.out.println("Gift Table change : gname,g_start,g_end update number : gno = ");
//        System.out.println("Gift Table Update number : gno = ");
        String sql = "UPDATE gift SET gname = ?, g_start = ?, g_end = ? WHERE gno = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1,sc.next());
        pstmt.setInt(2,sc.nextInt());
        pstmt.setInt(3,sc.nextInt());
        pstmt.setInt(4,sc.nextInt());
        int result = pstmt.executeUpdate();
        System.out.println(result + " 개 데이터 업데이트 성공함");
        conn.commit();

        pstmt.close();
        conn.close();


    }
}
