package word;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import connection.DBConnection;

public class WordDAO {

	// 난이도별 랜덤 단어 가져오기
	public List<Words> getRandomWords(int difficulty, int count) {
		List<Words> words = new ArrayList<>();
		String sql = "SELECT * FROM WORDS WHERE DIFFICULTY = ? " +
					 "ORDER BY DBMS_RANDOM.VALUE " +
					 "FETCH FIRST ? ROWS ONLY";
		
		try (Connection conn = DBConnection.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql)) {
			
			pstmt.setInt(1, difficulty);
			pstmt.setInt(2, count);
			
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()) {
				Words word = new Words();
				word.setWordId(rs.getInt("WORD_ID"));
				word.setJapanese(rs.getString("JAPANESE"));
				word.setKorean(rs.getString("KOREAN"));
				word.setRomaji(rs.getString("ROMAJI"));
				word.setCategory(rs.getString("CATEGORY"));
				word.setDifficulty(rs.getInt("DIFFICULTY"));
				words.add(word);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return words;
	}
}
