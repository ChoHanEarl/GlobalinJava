package enumExample;

public enum Direction {
	NORTH(0) {
		int a() {
			return super.a + 10;
		}
	}// ordinal 0 내부적으로 순서가 존재(디버깅 해보면 나옴)
	,SOUTH(1) // ordinal 1
	,EAST(2) // ordinal 2
	,WEST(3); // ordinal 3
	
	private int a;
	
	Direction(int a){
		this.a = a;
	}
	
	int a() {
		return this.a;
	}
}
