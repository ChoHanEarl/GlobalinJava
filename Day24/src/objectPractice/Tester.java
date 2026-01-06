package objectPractice;

public class Tester {
	public static void main(String[] args) {
		Member m = new Member();
		Student s = new Student();
		boolean isSame = m.equals(s);
		System.out.println(isSame);
	}
}
