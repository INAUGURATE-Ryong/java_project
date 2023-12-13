package day18.JDBC_MVC;

import java.sql.SQLException;

public class ViewGift {  // view
    public static void main(String[] args) throws SQLException {
        ControllerGift.connect();
        ControllerGift.menu();

    }
}
