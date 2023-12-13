package dept_mvc.view;

import java.sql.SQLException;

import dept_mvc.controller.DeptController;

public class MainEntry {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		DeptController.connect();
		DeptController.menu();
	}
}
