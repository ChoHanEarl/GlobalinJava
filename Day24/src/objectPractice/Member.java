package objectPractice;

public class Member {
	String id = "user123";
	int jumin = 123456789;

	@Override
	public boolean equals(Object obj) {
		System.out.println("같은 사람임");
		return this.jumin == ((Student)obj).jumin;
	}
	
	@Override
	public String toString() {
		return this.id + "@" + this.jumin;
	}
}
