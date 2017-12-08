package com.intexsoft.task19;

public class LettersInText {

	public static void main(String[] args) {
		String str = "   ¬ертикальна€ черта раздел€ет допустимые варианты. Ќапример,  "
				+ " gray|grey соответствует gray или grey. —ледует помнить, что перебор вариантов "
				+ "выполн€етс€ слева направо, как они указаны.";
		String[] res = str.split("\\b");
		int n = res.length;
		
		System.out.println(" оличество слов = " + n/2);
	}

}
