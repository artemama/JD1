package com.intexsoft.task20;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LastChar {

	public static void main(String[] args) {

		String str = "��� ����� �����, ��� �� ������� � ����� �������. ������� ��� ������.\r\n"
				+ "��� ����� �������� �����, ����� ����������� � ����������� �����. ";
		Pattern pattern = Pattern.compile("([a-z�-�])\\b");
		Matcher matcher = pattern.matcher(str);
		while (matcher.find()) {
			System.out.print(matcher.group(1));
		}

	}
}
