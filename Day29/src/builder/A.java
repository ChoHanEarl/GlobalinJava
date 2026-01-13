package builder;

public class A {

	int a;
	int a2;
	
	A(Builder b){
		this.a = b.a;
		this.a2 = b.a2;
	}
	
	static class Builder {
		
		int a;
		int a2;
		
		public Builder() {
			
		}
		
		public Builder a(int a) {
			this.a = a;
			return this;
		}
		
		public Builder a2(int a) {
			this.a2 = a;
			return this;
		}
		
		A build() {
			return new A(this);
		}
		
	}
	
}
