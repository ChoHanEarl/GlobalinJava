package stringClass;

public class StringBuilderBufferExample {
	void stringBuilder() {
		StringBuilder sb = new StringBuilder(); // Single Thread
		sb.append("Hello");
		for( int i = 1 ; i <= 100 ; i++ ) {
			sb.append(i);
		}
		System.out.println(sb.toString());
	}
	
	void stringBuffer() {
		StringBuffer sb = new StringBuffer(); // Multi Thread, Thread Safe
		sb.append("Hello");
		for( int i = 1; i <= 100 ; i++ ) {
			sb.append(i);
		}
		System.out.println(sb.toString());
	}
	
}
