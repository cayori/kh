package aug28.calendar;

import java.util.*;

public class CalendarEx5 {
	public static void main(String[] args) {
		Calendar date = Calendar.getInstance();
		
		date.set(2015,11,31); // 2015-12-31
		System.out.println(toString(date));
		//date.roll(Calendar.MONTH, 1);
		System.out.println(toString(date));
		date.add(Calendar.MONTH, 1);
		System.out.println(toString(date));
		
	}
	private static String toString(Calendar date) {
		return date.get(Calendar.YEAR)+"년 "+(date.get(Calendar.MONTH)+1)+"월 "+date.getMaximum(Calendar.DATE)+"일";
	}
}
