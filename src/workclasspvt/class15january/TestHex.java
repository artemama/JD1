package workclasspvt.class15january;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestHex {

	public static void main(String[] args) {

		String x = "AF9, AF3, AE0, AC0, A50, 9F0, 990, 9B0, 8F0, 4A0, 1F0, C0, A0, 15, 13, 4F0, BE0, B00";
		Pattern p = Pattern.compile("[A-F0-9]+");
		Matcher m = p.matcher("x");
		// while (p) {
		System.out.println();
	}

}
