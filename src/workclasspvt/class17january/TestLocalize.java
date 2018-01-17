package workclasspvt.class17january;

import java.util.Locale;
import java.util.ResourceBundle;

public class TestLocalize {

	public static void main(String[] args) {
		Locale locale = new Locale("ru", "RU");
		ResourceBundle rb = ResourceBundle.getBundle("MessagesBundle", locale);

		System.out.println(rb.getString("greetings"));

	}

}
