package com.intexsoft.task20;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LastChar {

	public static void main(String[] args) {

		String str = "Нам очень важно, что Вы думаете о нашем сервисе. Хорошее или плохое.\r\n"
				+ "Нам нужна обратная связь, чтобы развиваться и становиться лучше. ";
		Pattern pattern = Pattern.compile("([a-zа-я])\\b");
		Matcher matcher = pattern.matcher(str);
		while (matcher.find()) {
			System.out.print(matcher.group(1));
		}

	}
}
