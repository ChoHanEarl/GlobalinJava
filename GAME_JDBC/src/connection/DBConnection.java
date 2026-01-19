package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	// 접속 정보
	private static final String URL = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
	private static final String USER = "GAME";
	private static final String PASSWORD = "1234";
	
	// 드라이버 로드
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Oracle JDBC 드라이버 로드 성공");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// DB 연결
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(URL, USER, PASSWORD);
	}
	
	// 연결 테스트
	public static void main(String[] args) {
		try (Connection conn = getConnection()) {
			System.out.println("DB 연결 성공");
			System.out.println("연결된 DB: " + conn.getMetaData().getDatabaseProductName());
		} catch (Exception e) {
			System.out.println("DB 연결 실패");
			e.printStackTrace();
		}
	}
}
