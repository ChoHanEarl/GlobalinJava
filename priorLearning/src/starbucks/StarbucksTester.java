package starbucks;

public class StarbucksTester {
	public static void main(String[] args) {
		Money money = new Money(10000);
		Guest guest = new Guest(money, 3);
		Starbucks starbucks = new Starbucks();
		
		guest.buy(starbucks);
		guest.buy(starbucks);
		guest.buy(starbucks);
		System.out.println();
	}
}
