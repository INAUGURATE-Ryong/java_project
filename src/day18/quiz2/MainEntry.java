package day18.quiz2;

import day18.JDBC_MVC.ModelGiftDTO;

import java.sql.SQLException;

public class MainEntry {
    public static void main(String[] args) throws SQLException {
        ModelDeptDTO dto = new ModelDeptDTO();
        ControllerDept.connect();
        ControllerDept.selectAll(dto.getClassName());
    }

}
