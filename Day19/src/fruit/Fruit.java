package fruit;

public class Fruit {
	
	// 정보
	// protected는 다른 패키지여도 상속일 때 보이게 하고 싶을 때 사용
	// 즉 protected가 있는 코드면 상속에 관련된 설계를 했다는 것을 유추 가능
	
	// final
	// 변수, 메소드, 클래스에 붙을 수 있다.
	// final이 붙을 시 이곳에서 마지막 처리를 하겠다는 의미. 다른 곳에서 사용할 수 없다.
	// 즉 저장된 값을 다시 바꿀 수 없다는 의미이기도 하다.

	protected String color;

	protected Fruit(String color) {
		this.color = "white";
	}

	// 처리
	protected Nutrition getNutrition() {
		return new Nutrition();
	}
	
}
