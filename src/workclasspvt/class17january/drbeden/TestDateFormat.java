package workclasspvt.class17january.drbeden;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class TestDateFormat {

	public static void main(String[] args) {
		Locale locale = new Locale("ru", "RU");
		Date currentDate = new Date();
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, locale);
		System.out.println(df.format(currentDate));

		DateFormat df1 = DateFormat.getDateInstance(DateFormat.MEDIUM, locale);
		System.out.println(df1.format(currentDate));

	}

}
