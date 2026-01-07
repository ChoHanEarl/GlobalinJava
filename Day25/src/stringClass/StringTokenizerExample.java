package stringClass;

import java.util.StringTokenizer;

public class StringTokenizerExample {
	void stringTokenizer() {
		String s = "a,b,c,d,e,f";
		StringTokenizer st = new StringTokenizer(s, ",");
		while ( st.hasMoreTokens() ) {
			String t = st.nextToken();
			System.out.print(t + " ");
		}
	}
}
