package practice;

public class CoffeeShopTester {
	public static void main(String[] args) throws InterruptedException {
		
		CoffeeShop c = new CoffeeShop(50);
		c.order();
		c.showMaxCup();
		c.totalSellMoney();
		
	}
}
