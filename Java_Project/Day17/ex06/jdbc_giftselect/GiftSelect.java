package ex06.jdbc_giftselect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GiftSelect {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// 1. Driver load... exception
		Class.forName("org.mariadb.jdbc.Driver");
				
		// 2. Connection & open - driver:IP:portNumber/DB name				
		Connection conn = DriverManager.getConnection(
				"jdbc:mariadb://localhost:3306/sampledb"
				, "root", "mariadb");
		
		
		// 3. 사용 (DML - select)
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM GIFT");
		
		System.out.println("상품번호\t상품명\t최저가\t최고가");
		while (rs.next()) {
			int gno = rs.getInt(1); // 인덱스, int gno = rs.getInt("gno");
			String gname = rs.getString("gname");
			int g_s = rs.getInt(3);
			int g_e = rs.getInt("g_end");
				
			System.out.println(gno+"\t"+gname+"\t"+g_s+"\t"+g_e);
		}
		// 4. 닫기 (자원 반환)
		rs.close();
		stmt.close();
		conn.close();
		
	}
}
