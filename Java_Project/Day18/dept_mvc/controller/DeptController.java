package dept_mvc.controller;

import java.io.*;
import java.sql.*;
import java.util.*;

import dept_mvc.model.DeptDTO;
import ex02.jdbc_mvc.connutil.ConnectionHelper;

import java.net.*;

public class DeptController {
	static Scanner sc = new Scanner(System.in);
	static Statement stmt = null;
	static ResultSet rs = null;
	static Connection conn = null;
	static PreparedStatement pstmt = null;
	
	public static void connect() {
		try {
			conn = ConnectionHelper.getConnection("mariadb");
			stmt = conn.createStatement();
			conn.setAutoCommit(false);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void selectAll(String className) throws SQLException {
		rs = stmt.executeQuery("SELECT * FROM " + className);
		ResultSetMetaData rsmd = rs.getMetaData();
		int cnt = rsmd.getColumnCount();
		
		while (rs.next()) {
			for (int i=1;i<=cnt;i++) {
				switch (rsmd.getColumnType(i)) {
				case Types.NUMERIC:
				case Types.INTEGER:
					System.out.println(rsmd.getColumnName(i)+" : "+rs.getInt(i)+" ");
					break;
				case Types.FLOAT:
					System.out.println(rsmd.getColumnName(i)+" : "+rs.getFloat(i)+" ");
					break;
				case Types.DOUBLE:
					System.out.println(rsmd.getColumnName(i)+" : "+(int)rs.getDouble(i)+" ");
					break;
				case Types.CHAR:
					System.out.println(rsmd.getColumnName(i)+" : "+rs.getString(i)+" ");
					break;
				case Types.DATE:
					System.out.println(rsmd.getColumnName(i)+" : "+rs.getDate(i)+" ");
					break;
				default:
					System.out.println(rsmd.getColumnName(i)+" : "+rs.getString(i)+" ");
					break;
				
				}
			}
			System.out.println();
		}
	
	}
	
	public static void selectByDeptno(String className) throws SQLException {
		System.out.print("검색하려는 번호: ");
		pstmt = conn.prepareStatement("SELECT * FROM " + className+" WHERE deptno = ?");
		pstmt.setInt(1, sc.nextInt());
		rs = pstmt.executeQuery();
		
		ResultSetMetaData rsmd = rs.getMetaData();
		int cnt = rsmd.getColumnCount();
		
		while (rs.next()) {
			for (int i=1;i<=cnt;i++) {
				switch (rsmd.getColumnType(i)) {
				case Types.NUMERIC:
				case Types.INTEGER:
					System.out.println(rsmd.getColumnName(i)+" : "+rs.getInt(i)+" ");
					break;
				case Types.FLOAT:
					System.out.println(rsmd.getColumnName(i)+" : "+rs.getFloat(i)+" ");
					break;
				case Types.DOUBLE:
					System.out.println(rsmd.getColumnName(i)+" : "+(int)rs.getDouble(i)+" ");
					break;
				case Types.CHAR:
					System.out.println(rsmd.getColumnName(i)+" : "+rs.getString(i)+" ");
					break;
				case Types.DATE:
					System.out.println(rsmd.getColumnName(i)+" : "+rs.getDate(i)+" ");
					break;
				default:
					System.out.println(rsmd.getColumnName(i)+" : "+rs.getString(i)+" ");
					break;
				
				}
			}
			System.out.println();
		}
	}
	
	public static void insert() {
		
	}
	
	public static void update(String className) {
		
	}
	
	public static void delete(String className) {
		
	}
	
	public static void commit() {
		
	}
	
	public static void rollback() {
		
	}
	
	public static void close() {
		
	}
	
	public static void menu() throws SQLException {
		DeptDTO dto = new DeptDTO();
		while (true) {
			System.out.println();
			ConnectionHelper.menu();
			
			switch (sc.nextInt()) {
			case 0: 
				System.out.println("Will you commit?");
				if (sc.next().equalsIgnoreCase("Y")) {
					conn.commit();
					selectAll(dto.getClassName());
				} else {
					conn.rollback();
					selectAll(dto.getClassName());
				}
				break;
			case 1:
				selectAll(dto.getClassName());
				insert();
				selectAll(dto.getClassName());
				break;
			case 2:
				selectAll(dto.getClassName());
				update(dto.getClassName());
				selectAll(dto.getClassName());
				break;
			case 3:
				selectAll(dto.getClassName());
				break;
			case 4:
				selectByDeptno(dto.getClassName());
				break;
			case 5:
				selectAll(dto.getClassName());
				delete(dto.getClassName());
				selectAll(dto.getClassName());
				break;
			case 6:
				close();
				System.out.println("프로그램 종료");
				System.exit(0);
				break;
			case 9:
				conn.commit();
				System.out.println("성공적으로 완료됨");
				break;
			default:
				System.out.println("없는 번호 선택");
				break;
			}
		}
	}
}
