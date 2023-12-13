package ex01.jdbc_gift;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class GiftUpdate {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		// 1. Driver load... exception
		Class.forName("org.mariadb.jdbc.Driver");
				
		// 2. Connection & open - driver//:host IP/:portNumber/DB name				
		Connection conn = DriverManager.getConnection(
				"jdbc:mariadb://localhost:3306/sampledb"
				, "root", "mariadb");
		
		
		// 3. 사용 (DML - Insert)
		System.out.println("상품 정보 변경");
		String sql = "UPDATE gift SET gname=?, g_start=?, g_end=? where gno=?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		
		System.out.print("상품명: "); pstmt.setString(1, sc.next());
		System.out.print("최소값: "); pstmt.setInt(2, sc.nextInt());
		System.out.print("최대값: "); pstmt.setInt(3, sc.nextInt());
		System.out.print("상품 번호: "); pstmt.setInt(4, sc.nextInt());
		
		int result = pstmt.executeUpdate(); // 반환값 없는 경우 - insert, update, delete
		
		System.out.println(result +"개 데이터 변경 성공");
		conn.commit();
		// 4. 닫기 (자원 반환)
		pstmt.close(); //conn.close();
		
	}
}
