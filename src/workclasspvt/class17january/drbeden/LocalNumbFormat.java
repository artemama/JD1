package workclasspvt.class17january.drbeden;

import java.text.NumberFormat;
import java.util.Locale;

public class LocalNumbFormat {

	public static void main(String[] args) {
		Locale locale = new Locale("ru", "RU");
		NumberFormat rubFormat = NumberFormat.getCurrencyInstance(locale);
		System.out.println(rubFormat.format(153.5));
		NumberFormat numFormat = NumberFormat.getNumberInstance(locale);
		System.out.println(numFormat.format(153.5));

	}

}
