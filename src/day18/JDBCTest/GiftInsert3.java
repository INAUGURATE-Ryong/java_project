package day18.JDBCTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class GiftInsert3 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Scanner sc = new Scanner(System.in);
        Class.forName("org.mariadb.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/encore","root","maria");

        //3.사용(DML - Insert) - Statement / Prepared
        System.out.println("Gift Table data input : 상품번호/상품명/최저가/최고가 = ");
        String sql = "INSERT INTO gift VALUES(?,?,?,?)"; // 직접넣기
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1,sc.nextInt());
        pstmt.setString(2,sc.next());
        pstmt.setInt(3,sc.nextInt());
        pstmt.setInt(4,sc.nextInt());
        int result = pstmt.executeUpdate(); // 반환값이 없는 경우 - insert, update,delete
        System.out.println(result + " 개 데이터 추가 성공함");
        conn.commit();

        // 4. 닫기
        pstmt.close();
        conn.close();
    }
}
