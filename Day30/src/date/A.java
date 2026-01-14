package date;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.time.format.DateTimeFormatter;

public class A {
	
	void a() {
		// JVM이 OS의 시간을 읽어온다.(불안전)
		// 따라서 보통 DB의 시간을 불러와 활용하는 경우가 많다.
		LocalDate d = LocalDate.now();
		System.out.println(d);
		
		LocalTime t = LocalTime.now();
		System.out.println(t);
		
		LocalDateTime dt = LocalDateTime.now();
		System.out.println();
		
		ZoneId seoulZone = ZoneId.of("Asia/Seoul");
		d = LocalDate.now(seoulZone);
		System.out.println(d);
	}
	
	void a2() {
		// 미래나 과거의 날짜를 지정
		LocalDate d = LocalDate.of(2026, 1, 1);
		System.out.println(d.plusDays(3));
		System.out.println(d.plusMonths(4));
		System.out.println(d.plusWeeks(5));
		System.out.println(d.plusYears(7));
		System.out.println(d.minusYears(3));
	}
	
	void a3() {
		LocalTime t = LocalTime.of(23,59,59);
		System.out.println(t.plusHours(3));
		System.out.println(t.plusNanos(123456789));
		System.out.println(t.minusMinutes(23));
	}
	
	void a4() {
		LocalTime t = LocalTime.now();
		LocalTime plus10sec = t.plusSeconds(10);
	}
	
	void a5() {
		LocalDate start = LocalDate.of(2025, 11, 27);
		LocalDate end = LocalDate.of(2026, 1, 14);
//		Period period = Period.between(start, end);
		// 사이 간격 구하기
		long daysUntil = ChronoUnit.DAYS.between(start, end);
		long weeksUntil = ChronoUnit.WEEKS.between(start, end);
		System.out.println(daysUntil);
		System.out.println(weeksUntil);
	}
	
	void a6() {
		LocalDate start = LocalDate.of(2025, 11, 27);
		LocalDate end = LocalDate.of(2026, 1, 14);
		
		long businessDays = start.datesUntil(end)
				.filter(date -> {
					DayOfWeek day = date.getDayOfWeek();
					return day != DayOfWeek.SATURDAY && day != DayOfWeek.SUNDAY;
				})
				.count();
		
		System.out.println("주말 제외한 일수 : " + businessDays);
	}
	
	void a7() {
		LocalDateTime dateTime = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		String formatted = dateTime.format(formatter);
		System.out.println(formatted);
	}
	
	
}
