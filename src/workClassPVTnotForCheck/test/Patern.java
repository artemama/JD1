package workClassPVTnotForCheck.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Patern {

	public static void main(String[] args) {
		Pattern p = Pattern.compile(" +- +");

		Matcher matcher = p.matcher("Test - string - test");
		while (matcher.find()) {
			System.out.println(matcher.start() + " " + matcher.end());

		}
		Pattern pattern = Pattern.compile("www\\.(\\w+)\\.by");
		Matcher matcher2 = pattern.matcher("   www.tut.by  www.onliner.by ");
		matcher2.find();
		System.out.println(matcher2.group(1));

	}

}
