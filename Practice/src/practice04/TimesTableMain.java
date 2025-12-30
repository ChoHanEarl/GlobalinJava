package practice04;

import java.util.Scanner;

public class TimesTableMain {
	public static void main(String[] args) {
		
		TimesTable tt = new TimesTable();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("출력할 단을 입력 : ");
		int dan = sc.nextInt();
		tt.showTable(dan);
		
	}
}
