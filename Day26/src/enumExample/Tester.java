package enumExample;

public class Tester {
	
	static void d(int i, Direction d) {
		System.out.println(d.a());
		if (i == Direction02.SOUTH) {
			System.out.println("ㅎㅇ");
		}
		
		if(d == Direction.SOUTH) {
			System.out.println("ㅂㅇ");
		}
	}
	
	public static void main(String[] args) {
		d(0, Direction.NORTH);
	}
}
