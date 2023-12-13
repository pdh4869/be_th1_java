package ex02.jdbc_mvc.connutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

/*
 * ConnectionHelper 클래스 문제
 * - 매번 드라이버를 로드해야 함.
 * - Connection 생성
 * 
 * 하나의 프로세스에서 하나만 만들어 재사용 
 * => 해결: 공유자원 (싱글톤)
 */

public class ConnectionSingletonHelper {
	// 하나의 프로세스에서 공통으로 사용할 수 있는 공용자원 (static)
	private static Connection conn;
	private ConnectionSingletonHelper() {}
	public static Connection getConnection(String dsn) {

		if (conn != null) {
			return conn;
		}
		try {
			if (dsn.equals("mysql")) {
				Class.forName("org.gjt.mm.mysql.Driver"); // driver
				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb", "root", "mysql");
			} else if (dsn.equals("oracle")) {
				Class.forName("oracle.jdbc.OracleDriver");
				conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "kingsmile", "oracle");
			} else if (dsn.equals("mariadb")) {
				Class.forName("mariadb");
				conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/sampledb", "root", "mariadb");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			return conn;
		}
	}

	public static void close() throws SQLException {
		if (conn != null) {
			if (!conn.isClosed()) {
				conn.close();
			}
		}
	}
	
}
