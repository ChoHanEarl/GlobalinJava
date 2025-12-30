package practice04;

import java.util.Scanner;

public class UserInfoMain {
	public static void main(String[] args) {
		UserInfo userInfo = new UserInfo();
		Scanner sc = new Scanner(System.in);
		
		boolean isTrue = true;
		while(isTrue) {
			System.out.println("1. 입   금 : ");
			System.out.println("2. 출   금 : ");
			System.out.println("3. 잔액확인 : ");
			System.out.println("4. 종   료 : ");
			
			int num = sc.nextInt();
			if(num < 1 || num > 4) {
				System.out.println("1~4의 숫자를 입력해 주세요.");
				continue;
			}
			switch(num) {
			case 1: 
				System.out.println("---입  금---");
				System.out.print("입금할 금액을 입력 : ");
				int deposit = sc.nextInt();
				System.out.println("입금성공");
				userInfo.deposit(deposit);
				break;
			case 2:
				System.out.println("---출  금---");
				System.out.print("출금할 금액을 입력 : ");
				int withdraw = sc.nextInt();
				userInfo.withdraw(withdraw);
				break;
			case 3:
				System.out.println("---잔액확인---");
				System.out.printf("%d원\n", userInfo.showMoney());
				break;
			case 4:
				System.out.println("---종  료---");
				isTrue = false;
			}
			System.out.println("------------------");
		}
	}
}
