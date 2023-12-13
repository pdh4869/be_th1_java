package ex01.jdbc_gift;

import java.io.*;
import java.sql.*;
import java.util.Scanner;

public class GiftCRUD {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		Class.forName("org.mariadb.jdbc.Driver");
		Connection conn = DriverManager.getConnection(
				"jdbc:mariadb://localhost:3306/sampledb",
				"root","mariadb");
		String sql = null;
		PreparedStatement pstmt;
		ResultSet rs = null;
		int row;
		int result;
		
		
		while (true) {
			menu();
			System.out.print("수행할 Query 선택: ");
			try {
				switch (sc.nextInt()) {
				case 1:
					System.out.println("모든 행 출력\n");
					sql = selectAll();
					pstmt = conn.prepareStatement(sql);
					rs = pstmt.executeQuery();
					
					System.out.println("상품번호\t상품명\t최저가\t최고가");
					while (rs.next()) {
						int gno = rs.getInt(1); // 인덱스, int gno = rs.getInt("gno");
						String gname = rs.getString("gname");
						int g_s = rs.getInt(3);
						int g_e = rs.getInt("g_end");
							
						System.out.println(gno+"\t"+gname+"\t"+g_s+"\t"+g_e);
					}
					conn.commit();
					pstmt.close();
					break;
				case 2:
					System.out.print("출력할 행 번호: ");
					row = sc.nextInt();
					System.out.println("\n"+row+"행 출력\n");
					sql = selectByGno(row);
					pstmt = conn.prepareStatement(sql);
					rs = pstmt.executeQuery();
					System.out.println("상품번호\t상품명\t최저가\t최고가");
					while (rs.next()) {
						int gno = rs.getInt(1); // 인덱스, int gno = rs.getInt("gno");
						String gname = rs.getString("gname");
						int g_s = rs.getInt(3);
						int g_e = rs.getInt("g_end");
							
						System.out.println(gno+"\t"+gname+"\t"+g_s+"\t"+g_e);
					}
					conn.commit();
					pstmt.close();
					break;
				case 3:
					System.out.println("행 변경\n");
					System.out.print("변경할 행 번호: ");
					row = sc.nextInt();
					sql = update(row);
					pstmt = conn.prepareStatement(sql);
					result = pstmt.executeUpdate();
					conn.commit();
					pstmt.close();
					break;
				case 4:
					System.out.println("행 삭제\n");
					System.out.print("삭제할 행 번호: ");
					row = sc.nextInt();
					sql = delete(row);
					pstmt = conn.prepareStatement(sql);
					result = pstmt.executeUpdate();
					conn.commit();
					pstmt.close();
					break;
				case 5:
					sql = insert();
					pstmt = conn.prepareStatement(sql);
					result = pstmt.executeUpdate();
					conn.commit();
					pstmt.close();
					break;
				case 6: 
					System.exit(0);
				default:
					System.out.println("다시 입력해주세요");
					
				}
			} catch (Exception e) {
				System.out.println("다시 입력해주세요");
			}
		}

	}
	
	public static String selectAll() {
		String str = "SELECT * FROM gift";
		return str;
	}
	
	public static String selectByGno(int gno) {
		String str = "SELECT * FROM gift WHERE gno = "+gno;
		return str;
	}
	
	public static String update(int gno) {
		Scanner sc = new Scanner(System.in);
		String gname = sc.next(); int g_start = sc.nextInt(); int g_end = sc.nextInt();
		String str = "UPDATE gift SET gname='"+gname+"', "+"g_start="+g_start
				+", g_end="+g_end+"WHERE gno="+gno;
		return str;
	}
	
	public static String delete(int gno) {
		String str = "DELETE FROM gift WHERE gno="+gno;
		return str;
	}
	
	public static String insert() {
		Scanner sc = new Scanner(System.in);
		System.out.print("상품 번호: "); int gno = sc.nextInt(); 
		System.out.print("상품 이름: "); String gname = sc.next(); 
		System.out.print("최소값: "); int g_start = sc.nextInt(); 
		System.out.print("최대값: "); int g_end = sc.nextInt();
		
		String str = "INSERT INTO gift VALUES ("+gno+",'"+gname+"',"+g_start+","+g_end+")";
		return str;
	}
	
	public static void menu() {
		System.out.println("1. 모든 행 출력");
		System.out.println("2. 특정 행 출력");
		System.out.println("3. 특정 행 변경");
		System.out.println("4. 특정 행 삭제");
		System.out.println("5. 행 삽입");
		System.out.println("6. 종료\n");
	}
	
}
