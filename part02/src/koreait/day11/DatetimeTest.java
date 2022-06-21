package koreait.day11;

import java.text.DecimalFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DatetimeTest {
public static void main(String[] args) {
	//
	long result = 24*60*60*1000; //if int result overflow
	System.out.println("1day = " +result + " ms");
	System.out.println("1yr = " + result*365 + " ms");
	System.nanoTime();
	
	DecimalFormat df = new DecimalFormat("###,###,###,###");
	System.out.println("1yr is " + df.format(result*365L) + "ms"  );
	System.out.println("1yr is " + df.format(result) + "ms"  );
	// String.format(%15s, ~) arrange print 
	
	/*��¥�� �ð������� �ٷ�� �ڹ�Ŭ������ �����մϴ�.
	1)java.util.Date Ŭ����  2)java.util.Calendar Ŭ����
	3) java 8 ����  java.time.LocalDate(��¥) , LocalTime(�ð�) , LocalDateTime(��¥�� �ð�) Ŭ���� 
	 */
	LocalDate currentDate = LocalDate.now();
	System.out.println("date" + currentDate);
	
	LocalTime currentTime = LocalTime.now();
	System.out.println("time" + currentTime);
	
	LocalDateTime current = LocalDateTime.now();
	System.out.println("date time" + current);
	
	LocalDate mybirth = LocalDate.of(1994, 8, 3);
	System.out.println("my birth date " + mybirth);
	
	LocalTime mybirth_time = LocalTime.of(18, 10);
	System.out.println("my birth time " + mybirth_time);
	
	// time past after birth;
	Period between = Period.between(mybirth, currentDate);
	System.out.println(" "  + between.getYears() + "years");
	System.out.println(" "  + between.getMonths() + "moths");
	System.out.println(" "  + between.getDays() + "days");
	 
	System.out.println("test " + ChronoUnit.DAYS.between(mybirth, currentDate)+ "days since birth");
	//System.out.println("test2 :" + Duration.of(mybirth, currentDate) );
	
	//Duration /ChronoUnit/ java.sql.Date
	
}
}
