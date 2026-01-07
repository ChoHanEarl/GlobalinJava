package mathClass;

public class MathExample {

	void math() {
		int[] lotto = new int[45];
		for ( int i = 0 ; i < 6 ; i++ ) {
			lotto[i] = (int)(Math.random() * 45) + 1;
			System.out.print(lotto[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		MathExample me = new MathExample();
		me.math();
	}
}
