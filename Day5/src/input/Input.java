package input;

import java.util.Scanner;

public class Input {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("점수를 입력하세요.");
//		String input = scanner.nextLine();
		int num = scanner.nextInt();
//		num = Integer.parseInt(input);
		if (num >= 80) {
			System.out.println("합격입니다.");
		} else {
			System.out.println("불합격입니다.");
		}
	}
}