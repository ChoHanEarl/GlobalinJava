package classPractice;

public class ClassPractice01 {
	// 인스턴스 변수
	// 멤버변수, 필드(Fields)라고도 불린다.
	// 클래스 내에 선언된 변수로, 같은 클래스의 메서드에서도 접근이 가능하다.
	// 지역변수의 경우 해당 메서드에서만 접근이 가능하다.
	
	int balance = 0;
	public int deposit(int amount) {
		balance += amount;
		return balance;
	}
	
	public int withdraw(int amount) {
		balance -= amount;
		return balance;
	}
	
	public int checkMyBalance() {
		System.out.println("잔액 : " + balance);
		return balance;
	}
	
}
