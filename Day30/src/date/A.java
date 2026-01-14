package date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

public class A {

	void a() {
		// JVM이 OS의 시간을 읽어온다.(불안전)
		// 따라서 보통 DB의 시간을 불러와 활용하는 경우가 많다.
		LocalDate d = LocalDate.now();
		System.out.println(d);
		
		LocalTime t = LocalTime.now();
		System.out.println(t);
		
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
		
		ZoneId seoulZone = ZoneId.of("Asia/Seoul");
		d = LocalDate.now(seoulZone);
		System.out.println(d);
	}
	
}
