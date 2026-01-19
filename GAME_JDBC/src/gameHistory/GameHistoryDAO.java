package gameHistory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import connection.DBConnection;

public class GameHistoryDAO {

	public boolean saveGameHistory(int userId, int wordId, boolean isCorrect) {
		String sql = "INSERT INTO GAME_HISTORY (HISTORY_ID, USER_ID, WORD_ID, IS_CORRECT) " +
					 "VALUES (SEQ_HISTORY.NEXTVAL, ?, ?, ?)";
		
		try (Connection conn = DBConnection.getConnection();
			 PreparedStatement pstmt = conn.prepareStatement(sql)){
			
			pstmt.setInt(1, userId);
			pstmt.setInt(2, wordId);
			pstmt.setInt(3, isCorrect ? 1 : 0);
			
			int result = pstmt.executeUpdate();
			return result > 0;
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public void getUserAccuracy(int userId) {
		String sql = "SELECT " +
					 "COUNT(HISTORY_ID) AS TOTAL_ATTEMPTS, " +
					 "SUM(IS_CORRECT) AS CORRECT_ANSWERS, " +
					 "ROUND(SUM(IS_CORRECT) * 100.0 / COUNT(HISTORY_ID), 2) AS ACCURACY " +
					 "FROM GAME_HISTORY WHERE USER_ID = ?";
		
		try (Connection conn = DBConnection.getConnection();
			 PreparedStatement pstmt = conn.prepareStatement(sql)){
			
			pstmt.setInt(1, userId);
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
				System.out.println("총 시도: " + rs.getInt("TOTAL_ATTEMPTS"));
				System.out.println("정답 수: " + rs.getInt("CORRECT_ANSWERS"));
				System.out.println("정답률: " + rs.getDouble("ACCURACY") + "%");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
