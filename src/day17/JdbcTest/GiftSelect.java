package day17.JdbcTest;

import javax.xml.transform.Result;
import java.sql.*;

public class GiftSelect {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //1. Driver load ... exception 발생
        Class.forName("org.mariadb.jdbc.Driver");

        //2. Connection & Open
        // driver:IP:portNumber/DB명
        Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/encore","root","maria");

        //3. 사용 (DML - Select)
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM GIFT");

        System.out.println("상품번호\t상품명\t최저가\t최고가");
        while (rs.next()){
            int gno = rs.getInt(1);  //DB인덱스는 1부터 시작. 인덱스번호 or "필드명" 넣을 수 있음.
            String gname = rs.getString("gname");
            int g_s = rs.getInt(3);
            int g_e = rs.getInt("g_end");
            System.out.println(gno+"\t"+gname+"\t"+g_s+"\t"+g_e);
        }

        //4. 닫기(자원 변환) - 작은 것 부터 닫기
        rs.close();
        stmt.close();
        conn.close();
    }
}
