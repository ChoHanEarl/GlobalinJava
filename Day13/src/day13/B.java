package day13;

public class B {
	
	int b;
	
	B(int b){
		this.b = b;
	}
	
	int b1(int b) {
		this.b++;
		return this.b2(b);
	}
	
	int b2(int b) {
		this.b++;
		return this.b3(b);
	}
	
	int b3(int b) {
		return this.b + b;
	}
}
