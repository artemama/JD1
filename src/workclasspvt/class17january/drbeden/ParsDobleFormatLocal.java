package workclasspvt.class17january.drbeden;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class ParsDobleFormatLocal {

	public static void main(String[] args) throws ParseException {
		Locale locale = new Locale("ru", "RU");
		NumberFormat numFormat = NumberFormat.getNumberInstance(locale);
		Number num = numFormat.parse("10,5");
		double n = num.doubleValue();
		System.out.println(n);

	}

}
