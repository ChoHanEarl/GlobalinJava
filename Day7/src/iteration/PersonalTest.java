package iteration;

import java.util.Scanner;

public class PersonalTest {
	public static void main(String[] args) {
		// 정수를 입력 받고, 입력받은 정수의 갯수만큼
		// 열을 출력하며 이때, 열마다 행의 * 갯수는 +1씩
		// 추가되는 코드를 작성하시오.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i = 0; i <= num; i++) {
			for(int j = 0; j < num; j++) {
				if(j >= num - i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		
		
		
		
		
	}
}
