package feb01;

import java.util.Calendar;
import java.util.Date;
import java.sql.Timestamp;

import static java.lang.System.out;
class  CalendarEx1{

	public static void main(String[] args) 	{
		
		StringBuffer sb = new StringBuffer("년중 ");
		Calendar now = Calendar.getInstance();
		System.out.println(now);
		System.out.println(new Date());
		System.out.println(System.currentTimeMillis());
		System.out.println(new Timestamp(System.currentTimeMillis()));
		
		int week_yy = now.get(now.WEEK_OF_YEAR);
		int yy = now.get(now.YEAR);
		int mm = now.get(now.MONTH)+1;//1월이 0을 기억한다.
		int dd = now.get(now.DAY_OF_MONTH);

		sb.append(week_yy);
		sb.append("주째인 ");
		sb.append(yy);
		sb.append("년 ");
		sb.append(mm);
		sb.append("월 ");
		sb.append(dd);
		sb.append("일");

		out.println(sb.toString());
	}
}










