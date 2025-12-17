package movie;

public class CGV {
	
	Ticket[] ticket;
	Money money;
	
	Ticket[] sell(Money payment, int count) {
		if(count > 3) {
			System.out.println("티켓 최대 3장만 가능");
			return null;
		}
		
		ticket = new Ticket[count];
		for(int i = 0; i < count; i++) {
			ticket[i] = new Ticket();
		}
		
		this.money = payment;
		return ticket;
	}
	
}
