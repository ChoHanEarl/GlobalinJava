package practice04;

public class TimesTable {

	public void showTable(int dan) {
		System.out.printf("%d단\n", dan);
		for ( int i = 1 ; i <= 9 ; i++ ) {
			System.out.printf("%d * %d = %d\n", dan, i, dan*i);
		}
	}
	
}
