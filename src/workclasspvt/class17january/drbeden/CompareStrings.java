package workclasspvt.class17january.drbeden;

import java.text.Collator;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class CompareStrings {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Locale locale = new Locale("ru", "RU");
		Collator collator = Collator.getInstance(locale);
		collator.compare("abc", "def");
		List wordsList = null;
		Collections.sort(wordsList,collator);

		//System.out.println(collator);

	}

}
