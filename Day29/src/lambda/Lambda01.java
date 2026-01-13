package lambda;

public class Lambda01 {

	void a() {
		I i = () -> System.out.println(11);
		i.i();
	}
	
	void b() {
		Calculator add = (x, y) -> x + y;
		System.out.println(add.i(5, 3));
		
		Calculator min = (x, y) -> x - y;
		System.out.println(min.i(5, 3));
		
		Calculator xx = (x, y) -> x * y;
		System.out.println(xx.i(5, 3));
		
		Calculator nanum = (x, y) -> x / y;
		System.out.println(nanum.i(5, 3));
	}
}
