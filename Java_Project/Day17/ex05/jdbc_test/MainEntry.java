package ex05.jdbc_test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MainEntry {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		// 1. Driver load... exception
		Class.forName("org.mariadb.jdbc.Driver");
		System.out.println("driver load success");
		
		// 2. Connection & open - driver:IP:portNumber/DB name
		String url = "jdbc:mariadb://localhost:3306/sampledb";
		String uid = "root";
		String pwd = "mariadb";
		
		Connection conn = DriverManager.getConnection(url, uid, pwd);
		System.out.println("connection success");
	}
}
