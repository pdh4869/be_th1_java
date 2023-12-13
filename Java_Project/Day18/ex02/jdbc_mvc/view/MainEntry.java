package ex02.jdbc_mvc.view;

import java.sql.SQLException;

import ex02.jdbc_mvc.controller.GiftController;

public class MainEntry { // view
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		GiftController.connect();
		GiftController.menu();
	}
}
