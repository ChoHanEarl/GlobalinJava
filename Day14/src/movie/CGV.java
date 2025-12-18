package movie;

public class CGV {

	MovieTicket[] sell(int size) {
		
		if( size > 3 ) return null; 
		
		MovieTicket[] tArr = new MovieTicket[size];
		for( int i = 0 ; i <= size ; i ++ ) {
			tArr[i] = new MovieTicket();
		}
		
		return tArr;
		
	}
	
}
