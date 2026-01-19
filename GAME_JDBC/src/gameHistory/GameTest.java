package gameHistory;

import java.util.List;
import java.util.Scanner;

import word.Words;
import word.WordDAO;

public class GameTest {

	public static void main(String[] args) {
		WordDAO wordDAO = new WordDAO();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("===일본어 단어 맞추기 게임===");
		System.out.println("난이도 선택 (1: 쉬움, 2: 보통, 3: 어려움): ");
		int difficulty = sc.nextInt();
		
		List<Words> words = wordDAO.getRandomWords(difficulty, 5);
		
		int score = 0;
		
		for (Words word : words) {
			System.out.println("\n일본어: " + word.getJapanese());
			System.out.print("한글 뜻을 입력하세요: ");
			sc.nextLine();
			String answer = sc.nextLine();
			
			if (answer.equals(word.getKorean())) {
				System.out.println("정답!");
				score++;
			} else {
				System.out.println("오답! 정답: " + word.getKorean());
			}
		}
		
		System.out.println("\n최종 점수: " + score + "/" + words.size());
		sc.close();
	}
}
