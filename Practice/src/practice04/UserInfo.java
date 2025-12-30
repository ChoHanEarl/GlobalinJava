package practice04;

public class UserInfo {

	// 문제설명
	// UserInfo 클래스를 만든 뒤, 금액을 저장할 money라는 변수를 만든다.
	// deposit(int money) 메서드를 만들어 유저가 돈을 입금했을 경우를 처리
	// withdraw(int money) 메서드를 만들어 유저가 돈을 출금했을 경우를 처리
	// 단 이 메서드에는 출금하고자 하는 돈보다 잔액이 적을 경우
	// 잔액이 부족하다는 메세지가 출력된다.
	// showMoney() 메서드를 만들어 현재 잔액을 반환하도록 한다.
	// UserInfo클래스는 여기까지.
	// Main클래스를 새로 만들어 UserInfo형 객체를 생성한 뒤
	// 아래의 결과가 나오도록 해보자.
	
	// 1. 입   금 :
	// 2. 출   금 :
	// 3. 잔액확인 :
	// 4. 종   료 :
	// 1
	// ---입  금---
	// 입금할 금액을 입력 : 1000
	// 입금성공
	// -------------------
	// 1. 입   금 :
	// 2. 출   금 :
	// 3. 잔액확인 :
	// 4. 종   료 :
	// 3
	// ---잔액확인---
	// 1000원
	// --------------------
	// 1. 입   금 :
	// 2. 출   금 :
	// 3. 잔액확인 :
	// 4. 종   료 :
	// 2
	// ---출  금---
	// 출금할 금액을 입력 : 5000
	// 잔액부족
	
	int money;
	public void deposit(int money) {
		this.money = money;
	}
	
	public void withdraw(int money) {
		if(this.money < money) {
			System.out.println("잔액부족");
			System.out.println("잔액 : " + this.money);
		} else {
			this.money -= money;
			System.out.println("출금성공");
			System.out.println("잔액 : " + this.money);
		}
	}
	
	public int showMoney() {
		return this.money;
	}
	
}
