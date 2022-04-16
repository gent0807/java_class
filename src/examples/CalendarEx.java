package examples;
import java.util.Calendar;

public class CalendarEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar now=Calendar.getInstance();
		int year=now.get(Calendar.YEAR);
		int month=now.get(Calendar.MONTH);
		int day=now.get(Calendar.DAY_OF_MONTH);
		int hour=now.get(Calendar.HOUR);
		int minute=now.get(Calendar.MINUTE);
		int sec=now.get(Calendar.SECOND);
		System.out.println(year+"년"+month+"월"+day+"일"+hour+"시"+minute+"분"+sec+"초");
	}

}
