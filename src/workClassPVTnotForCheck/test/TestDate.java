package workClassPVTnotForCheck.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestDate {

	public static void main(String[] args) throws ParseException {
		Date date = new Date();

		System.out.println(date);
		System.out.println("current time in milis" + date.getTime());

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
		System.out.println("formatted date:" + sdf.format(date));

		String strDate = "2017-06-12T21:07:10";
		Date parsedDate = sdf.parse(strDate);
		System.out.println("parsed Date:" + parsedDate.getTime());

		Calendar calendar = Calendar.getInstance();
		Date dateFromCalendar = calendar.getTime();
		System.out.println("date From Calendar:" + dateFromCalendar);
		calendar.add(Calendar.HOUR_OF_DAY, -26);
		System.out.println("shifted date" + calendar.getTime());

	}

}
