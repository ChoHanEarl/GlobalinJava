package practice04;

import java.util.Scanner;

public class StartMain {
	public static void main(String[] args) {
		Start start = new Start();
		int rnd = start.random();
		Scanner sc = new Scanner(System.in);
		int count = 0;
		for(int i = 1; i <= 100; i++) {
			System.out.print("숫자입력 : ");
			int num = sc.nextInt();
			if(num > rnd) {
				System.out.println("Down!!");
			} else if(num < rnd) {
				System.out.println("Up!!");
			} else {
				count++;
				System.out.printf("%d회만에 정답!!!!\n", count);
				break;
			}
			count++;
		}
		
		
		
	}
}
