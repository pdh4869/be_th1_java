package dept_mvc.connutil;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionHelper {
	public static Connection getConnection(String dsn) {
		Connection conn = null;
		try {
			if (dsn.equals("mysql")) {
				Class.forName("org.gjt.mm.mysql.Driver"); // driver
				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb", "root", "mysql");
			} else if (dsn.equals("oracle")) {
				Class.forName("oracle.jdbc.OracleDriver");
				conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "kingsmile", "oracle");
			} else if (dsn.equals("mariadb")) {
				Class.forName("org.mariadb.jdbc.Driver");
				conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/sampledb", "root", "mariadb");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			return conn;
		}
	}
	
	public static void menu() {
		System.out.println("\n-=-=-=-=-= JDBC Query =-=-=-=-=-");
		System.out.println("\t >> 원하는 메뉴 선택 하세요.  ");
		System.out.println("\t 0. rollback ");
		System.out.println("\t 1. 레코드 삽입(추가) ");
		System.out.println("\t 2. 레코드 수정 ");
		System.out.println("\t 3. 전체보기 ");
		System.out.println("\t 4. 조건에 의한 검색(ex>gno ) ");
		System.out.println("\t 5. 레코드 삭제 ");
		System.out.println("\t 6. 프로그램 종료 ");
		System.out.println("\t 9. commit ");
	}
	
}
