package aug28.calendar;

public class CalendarEx9 {
	public static void main(String[] args) {
		System.out.println("2004. 5.31 : "+getDayOfWeek(2004,5,31));
		System.out.println("2002. 6. 1 : "+getDayOfWeek(2002,6,1));
		System.out.println("2004. 5. 1 - 2004. 4.28 : "+dayDiff(2004,5,1,2004,4,28));
		System.out.println("2005. 6.29 : "+convertDateToDay(2004,6,29));
		System.out.println("732126     : "+convertDayToDate(732126));
	}
	
	public static int[] endOfMonth = {31,28,31,30,31,30,31,31,30,31,30,31};

	public static boolean isLeapYear(int year) {
		return ((year%4==0)&&(year%100!=0) || (year%400==0));
	}
	
	private static String convertDayToDate(int i) {
		
		return null;
	}

	private static int convertDateToDay(int year, int month, int day) {
		int days = 0;
		int leapYears = 0;
		
		for (int i=0; i<year-1; i++)
			if (isLeapYear(i))
				leapYears++;
		
		days = 365*(year) + leapYears;
		
		for (int i=0; i<month-1; i++)
			days += endOfMonth[i];
		
		if (isLeapYear(year)) days++;
		
		days += day;
				
		return days;
	}

	private static String dayDiff(int i, int j, int k, int l, int m, int n) {
		// TODO Auto-generated method stub
		return null;
	}

	private static String getDayOfWeek(int i, int j, int k) {
		
		return null;
	}
	
	
}
