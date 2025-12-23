package animal;

public class AnimalTester {
	public static void main(String[] args) {
		Lion lion = new Lion();
		Animal animal = lion; // polymophism(다형성)
		
		if (animal instanceof Lion) {
			lion = (Lion)animal;			
		}
		if (animal instanceof Tiger) {
			Tiger tiger = (Tiger)animal;			
		}
		
	}
}
