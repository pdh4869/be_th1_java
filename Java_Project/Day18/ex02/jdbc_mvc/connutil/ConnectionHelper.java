package ex02.jdbc_mvc.connutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

/*
 DB 연결 정보를 반복적으로 코딩하는 것을 해결
 다른 클래스에서 아래 코드를 구현하지 않도록 설계 
 
Class.forName("org.mariadb.jdbc.Driver");
Connection conn = DriverManager.getConnection(
		"jdbc:mariadb://localhost:3306/sampledb", "root", "mariadb");

아래와 같은 방법으로 사용
ConnectionHelper.getConnection("mariadb")  / ("oracle") / ("mysql")
dsn (Data Source Name)
 */

public class ConnectionHelper {
	// 함수(접근자: public, static)
	public static Connection getConnection(String dsn, String userid, String pwd) {
		Connection conn = null;
		try {
			if (dsn.equals("mysql")) {
				Class.forName("org.gjt.mm.mysql.Driver"); // driver
				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb", userid, pwd);
			} else if (dsn.equals("oracle")) {
				Class.forName("oracle.jdbc.OracleDriver");
				conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", userid, pwd);
			} else if (dsn.equals("mariadb")) {
				Class.forName("org.mariadb.jdbc.Driver");
				conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/sampledb", userid, pwd);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			return conn;
		}
		
	}
	
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
