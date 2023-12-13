package day18.quiz2;

import day18.JDBC_MVC_ConnUtil.CloseHelper;
import day18.JDBC_MVC_ConnUtil.ConnectionHelper;

import java.sql.*;
import java.util.Scanner;

public class ControllerDept {
    static Scanner sc = new Scanner(System.in);
    static Statement stmt = null;
    static ResultSet rs = null;
    static Connection conn = null;
    static PreparedStatement pstmt = null;

    // connect
    public static void connect() {
        try {
            conn = ConnectionHelper.getConnection("mariadb");
//            conn = ConnectionSingletonHelper.getConnection("mariadb");
            stmt = conn.createStatement();
            conn.setAutoCommit(false);   // 자동커밋 끄기
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // close
    public static void close() {
        try {
            CloseHelper.close(rs);
            CloseHelper.close(stmt);
            CloseHelper.close(pstmt);
            CloseHelper.close(conn);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void selectAll(String className) throws SQLException {
        rs = stmt.executeQuery("SELECT * FROM " + className);  // 반환값 있는 경우

        ResultSetMetaData rsmd = rs.getMetaData();
        int count = rsmd.getColumnCount();
        while (rs.next()) {
            for (int i = 1; i <= count; i++) {  // 각 타입별로 출력하기

                switch (rsmd.getColumnType(i)) {
                    case Types.NUMERIC:
                    case Types.INTEGER:
                        System.out.println(rsmd.getColumnName(i) + " : " + rs.getInt(i) + "  ");
                        break;
                    case Types.FLOAT:
                        System.out.println(rsmd.getColumnName(i) + " : " + rs.getFloat(i) + "  ");
                        break;
                    case Types.DOUBLE:
                        System.out.println(rsmd.getColumnName(i) + " : " + (int) rs.getDouble(i) + "  ");
                        break;
                    case Types.CHAR:
                        System.out.println(rsmd.getColumnName(i) + " : " + rs.getString(i) + "  ");
                        break;
                    case Types.DATE:
                        System.out.println(rsmd.getColumnName(i) + " : " + rs.getDate(i) + "  ");
                        break;
                    default:
                        System.out.println(rsmd.getColumnName(i) + " : " + rs.getString(i) + "  ");
                        break;
                } // switch end
            } // end for
            System.out.println();
        } // end while
    }
    public static void insert(){
        System.out.print("DEPT : ");	int dept = sc.nextInt();
        System.out.print("dname : ");	String dname = sc.next();
        System.out.print("loc : ");		String loc = sc.next();

        try {
            pstmt = conn.prepareStatement("INSERT INTO GIFT VALUES( ?, ?, ? )");
            pstmt.setInt(1, dept);
            pstmt.setString(2, dname);
            pstmt.setString(3, loc);
            int result = pstmt.executeUpdate();

            System.out.println(result + "개 데이터가 추가 되었습니다.");

        } catch (Exception e) {			e.printStackTrace();		}

    }
}


