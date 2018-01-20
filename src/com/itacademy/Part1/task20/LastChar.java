package com.itacademy.Part1.task20;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LastChar {

	public static void main(String[] args) {

		String str = "Время подарков, корпоративов и предновогоднего настроения уже началось! Все уже поздравляют друг друга с наступающим, а в "
				+ "домах и на улицах стоят украшенные ёлки.";
		Pattern pattern = Pattern.compile("([a-zа-я])\\b");
		Matcher matcher = pattern.matcher(str);
		while (matcher.find()) {
			System.out.print(matcher.group(1));
		}

	}
}
