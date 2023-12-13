package ex01.jdbc_gift;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class GiftDelete {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		// 1. Driver load... exception
		Class.forName("org.mariadb.jdbc.Driver");
				
		// 2. Connection & open - driver//:host IP/:portNumber/DB name				
		Connection conn = DriverManager.getConnection(
				"jdbc:mariadb://localhost:3306/sampledb"
				, "root", "mariadb");
		
		
		// 3. 사용 (DML - Delete)
		System.out.println("상품 삭제");
		String sql = "DELETE FROM gift WHERE gno = ?  ";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, sc.nextInt());
		
		int result = pstmt.executeUpdate(); // 반환값 없는 경우 - insert, update, delete
		
		System.out.println(result +"개 데이터 삭제 성공");
		conn.commit();
		// 4. 닫기 (자원 반환)
		pstmt.close(); //conn.close();
		
	}
}
