package day18.quiz;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class GiftCRUD {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Menu();
    }


    // 연결 메소드
    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        // 드라이버 로드
        Class.forName("org.mariadb.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/encore", "root", "maria");
        return conn;
    }

    // selectAll()
    public static void selectAll() throws SQLException, ClassNotFoundException {
        Statement stmt = getConnection().createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM GIFT");


        System.out.println("상품번호\t상품명\t최저가\t최고가");
        while (rs.next()) {
            int gno = rs.getInt(1);  //DB인덱스는 1부터 시작. 인덱스번호 or "필드명" 넣을 수 있음.
            String gname = rs.getString("gname");
            int g_s = rs.getInt(3);
            int g_e = rs.getInt("g_end");
            System.out.println(gno + "\t" + gname + "\t" + g_s + "\t" + g_e);


        }
        rs.close();
        stmt.close();
        getConnection().close();
    }

    // selectByGno(int gno)
    public static void selectByGno() throws SQLException, ClassNotFoundException {
        String sql = "SELECT * FROM GIFT WHERE gno = ?";
        PreparedStatement pstmt = getConnection().prepareStatement(sql);
        pstmt.setInt(1, sc.nextInt());
        ResultSet resultSet = pstmt.executeQuery();
        while (resultSet.next()) {
            int gno = resultSet.getInt("gno");
            String gname = resultSet.getString("gname");
            int g_s = resultSet.getInt("g_start");
            int g_e = resultSet.getInt("g_end");
            System.out.println("gno: " + gno + ", gname: " + gname + ", g_start: " + g_s + ", g_end: " + g_e);

        }
        resultSet.close();
        pstmt.close();
        getConnection().close();
    }

    // update(int gno)
    public static void updateByGno() throws SQLException, ClassNotFoundException {
        System.out.println("Gift Table change : gname,g_start,g_end update number : gno = ");
        String sql = "UPDATE gift SET gname = ?, g_start = ?, g_end = ? WHERE gno = ?";
        PreparedStatement pstmt = getConnection().prepareStatement(sql);
        pstmt.setString(1, sc.next());
        pstmt.setInt(2, sc.nextInt());
        pstmt.setInt(3, sc.nextInt());
        pstmt.setInt(4, sc.nextInt());
        int result = pstmt.executeUpdate();
        System.out.println(result + " 개 데이터 업데이트 성공함");

        pstmt.close();
        getConnection().close();
    }

    // delete(int gno)
    public static void deleteByGno() throws SQLException, ClassNotFoundException {
        System.out.println("Gift Table delete number : gno = ");
        String sql = "DELETE FROM gift WHERE gno = ?";
        PreparedStatement pstmt = getConnection().prepareStatement(sql);
        pstmt.setInt(1, sc.nextInt());
        int result = pstmt.executeUpdate();
        System.out.println(result + " 개 데이터 삭제 성공함");

        pstmt.close();
        getConnection().close();

    }

    // insert()
    public static void Insert() throws SQLException, ClassNotFoundException {
        System.out.println("Gift Table data input : 상품번호/상품명/최저가/최고가 = ");
        String sql = "INSERT INTO gift VALUES(?,?,?,?)"; // 직접넣기
        PreparedStatement pstmt = getConnection().prepareStatement(sql);
        pstmt.setInt(1, sc.nextInt());
        pstmt.setString(2, sc.next());
        pstmt.setInt(3, sc.nextInt());
        pstmt.setInt(4, sc.nextInt());
        int result = pstmt.executeUpdate(); // 반환값이 없는 경우 - insert, update,delete
        System.out.println(result + " 개 데이터 추가 성공함");

        // 4. 닫기
        pstmt.close();
        getConnection().close();

    }

    // exit()
    public static void exit() throws SQLException, ClassNotFoundException {
        Connection conn = getConnection();
        System.out.print("저장하시겠습니까? (y/n) : ");
        char ch = sc.next().charAt(0);
        do {
            if (ch == 'y') {
                conn.commit();
            } else if (ch != 'n') {
                System.out.println("잘못된 입력입니다.\n");

                System.out.print("저장하시겠습니까? (y/n) : ");
                ch = sc.next().charAt(0);
            }
        } while (ch != 'y' && ch != 'n');
        conn.close();
        sc.close();
        System.out.println("종료합니다.");
        System.exit(0);
    }

    //menu()
    public static void Menu() throws SQLException, ClassNotFoundException {
        System.out.println("\n\n환영합니다!\n\n");
        while (true) {
            System.out.println("메뉴를 선택해주세요.");
            System.out.println("1. 전체 출력");
            System.out.println("2. 선택 출력");
            System.out.println("3. 수정");
            System.out.println("4. 삭제");
            System.out.println("5. 삽입");
            System.out.println("6. 종료");
            System.out.print("입력 : ");
            char ch = sc.next().charAt(0);
            switch (ch) {
                case '1':
                    selectAll();
                    break;
                case '2':
                    System.out.print("번호 : ");
                    selectByGno();
                    break;
                case '3':
                    System.out.print("번호 : ");
                    updateByGno();
                    break;
                case '4':
                    System.out.print("번호 : ");
                    deleteByGno();
                    break;
                case '5':
                    Insert();
                    break;
                case '6':
                    exit();
                    break;
                default:
                    System.out.println("\n잘못된 입력입니다.\n");
                    break;
            }
        }
    }
}