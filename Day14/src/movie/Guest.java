package movie;

public class Guest {
	Money money = new Money();
	Ticket[] ticket;
	
	void buy(CGV cgv, int count) {
		ticket = cgv.sell(money, count);
		
		if(ticket != null) {
			money = null;
			System.out.println(ticket.length+"장 구매 완료");
		}
	}
}
