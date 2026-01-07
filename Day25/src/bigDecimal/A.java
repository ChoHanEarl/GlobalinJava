package bigDecimal;

import java.math.BigDecimal;

public class A {

	public static void main(String[] args) {
		
		double p1 = 19.99;
		double p2 = 3;
		double p3 = 0.08;
		
		double subTotal1 = p1 * p2;
		double tax1 = subTotal1 * p3;
		double total1 = subTotal1 + tax1;
		
		System.out.println(subTotal1);
		System.out.println(tax1);
		System.out.println(total1);
		
		
		BigDecimal price = new BigDecimal("19.99");
		BigDecimal quantity = new BigDecimal("3");
		BigDecimal taxRate = new BigDecimal("0.08");
		
		// 계산
		BigDecimal subTotal2 = price.multiply(quantity);
		BigDecimal tax2 = subTotal2.multiply(taxRate);
		BigDecimal total2 = subTotal2.add(tax2);
		
		System.out.println(subTotal2);
		System.out.println(tax2);
		System.out.println(total2);
		
		double price3 = 0.1;
		double total3 = price3 * 3;
		System.out.println(total3);
		
	}
}
