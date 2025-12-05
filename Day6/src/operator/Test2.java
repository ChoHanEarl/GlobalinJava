// 실습 문제
// 2. 학생의 일본어 점수가 90점 초과거나 
// 컴퓨터 점수가 90점 이상이면
// A학점을 부여하는 논리식을 작성하시오.

package operator;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("일본어 점수 : ");
		int japanese = s.nextInt();
		System.out.print("컴퓨터 점수 : ");
		int computer = s.nextInt();
		String grade = null;
		
		if (japanese > 90 || computer >= 90) {
			grade = "A";
			System.out.printf("학점 : %s\n", grade);
		} else {
			System.out.println("열공");
		}
		
		// 삼항연산자
//		grade = (japanese > 90 || computer >= 90) ? "A" : "열공";
//		System.out.print(grade);
		
	}
}
