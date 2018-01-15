package workclasspvtnot.class15january;

import java.util.regex.Pattern;

public class TestReg {

	public static void main(String[] args) {

		String str = " <div class=\"table\"><a name=\"d0e7385\"></a><p class=\"title\"><b>Таблица 16.1. Регулярные выражения - Модификаторы</b></p> ";

		System.out.println(str.replaceAll("<p[^>]*>", "<p>"));

	}

}
