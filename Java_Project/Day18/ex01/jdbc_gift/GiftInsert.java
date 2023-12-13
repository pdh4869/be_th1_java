package ex01.jdbc_gift;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GiftInsert {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// 1. Driver load... exception
		Class.forName("org.mariadb.jdbc.Driver");
				
		// 2. Connection & open - driver//:host IP/:portNumber/DB name				
		Connection conn = DriverManager.getConnection(
				"jdbc:mariadb://localhost:3306/sampledb"
				, "root", "mariadb");
		
		
		// 3. 사용 (DML - Insert)
		Statement stmt = conn.createStatement();
		// sql문 1) 데이터 값 직접 넣기
		String sql = "INSERT INTO gift VALUES (12, '스팸2', 900, 1300)";
		
		// sql문 2) 
		String sql2 = "INSERT INTO gift VALUES("+args[0]+",'"+args[1]+" ', "+args[2]+","+
					args[3]+")"; // run configuration에 인자 넣기
		
		int result = stmt.executeUpdate(sql);
		System.out.println(result +"개 데이터 추가 성공");
		conn.commit();
		// 4. 닫기 (자원 반환)
		stmt.close(); //conn.close();
		
	}
}
