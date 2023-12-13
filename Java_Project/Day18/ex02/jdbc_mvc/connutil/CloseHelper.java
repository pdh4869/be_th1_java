package ex02.jdbc_mvc.connutil;

import java.lang.Thread.State;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import org.mariadb.jdbc.export.Prepare;

/*
 * if (rs != null) try { rs.close(); } catch (SQLException e) { e.printStackTrace(); }
 * if (stmt != null) try { stmt.close(); } catch (SQLException e) { e.printStackTrace(); }
 * if (conn != null) try { conn.close(); } catch (SQLException e) { e.printStackTrace(); }
 *  
 */

public class CloseHelper {
	public static void close(Connection conn) {
		if (conn != null) {
			try {
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void close(Statement stmt) {
		if (stmt != null) {
			try {
				stmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void close(PreparedStatement pstmt) {
		if (pstmt != null) {
			try {
				pstmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void close(ResultSet rs) {
		if (rs != null) {
			try {
				rs.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
