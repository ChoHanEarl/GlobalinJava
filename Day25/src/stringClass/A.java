package stringClass;

import java.util.Arrays;

public class A {

	void a() {
		int a = 10;
		String s = "Hello"; // 리터럴 방식으로 저장하면 String Pool에 저장
		String s2 = "Hello"; // String Pool에서 동일한 존재를 체크, s를 가리키게 됨
		String s3 = new String("Hello"); // 인스턴스 생성
		
		// 기존의 s에 할당된 Hello가 바뀌어 Hello World가 되는 것이 아님
		// 새로운 String 객체가 생성되고 참조가 변경된다.
		// 이러한 불변성은 멀티스레드 환경에서 안전하고, 해시맵의 키로 사용하기 안전
		s += " World";
		System.out.println(s);
		System.out.println(s.length());
		System.out.println(s.charAt(6));
		if( s.charAt(6) == 'W' ) {
			System.out.println(s.substring(5));
			System.out.println(s.substring(2,4)); // 2 이상 4 미만
			System.out.println(s.substring(s.indexOf('W'), s.indexOf('W') + 2)); // W라는 글자가 몇 번째에 있는가?
			System.out.println(s.indexOf('s')); // 존재하지 않는 경우 -1 리턴
			System.out.println(s.lastIndexOf('l')); // a.b.c.txt 등의 확장자를 찾을 때처럼 마지막에 있는 무언가의 위치를 알고 싶을 때 사용한다
			s = s.replace('o', 'O');
			System.out.println(s);
			s = s.replaceAll("l", "z");
			System.out.println(s);
			s = "Hello,World";
			String[] arr = s.split("[,]"); // |는 대괄호 필요, :나 ,는 없어도 가능(그냥 대괄호 쓰자)
			System.out.println(Arrays.toString(arr));
			s = s.join("|", arr);
			System.out.println(s);
			System.out.println(s.contains("z")); // z를 포함하냐
			System.out.println(s.startsWith("H")); // H로 시작하냐
			System.out.println(s.endsWith("d")); // d로 끝나냐
			System.out.println(s.toUpperCase()); // 모두 대문자로
			System.out.println(s.toLowerCase()); // 모두 소문자로
			s ="     HELLO World         ";
			s = s.trim(); // 문자열 앞 뒤의 공백 제거(중간부분은 그대로)
			System.out.println(s);
		}
	}
	

}
