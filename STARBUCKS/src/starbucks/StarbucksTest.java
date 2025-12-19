package starbucks;

import java.util.Scanner;

public class StarbucksTest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("");
		
		Money money = new Money(10000);
		Guest guest = new Guest(money, 2);
		Starbucks starbucks = new Starbucks();
		
		guest.buy(starbucks);
		guest.buy(starbucks);
		guest.buy(starbucks);
		
		System.out.println();
	}
}
