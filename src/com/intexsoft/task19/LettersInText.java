package com.intexsoft.task19;

public class LettersInText {

	public static void main(String[] args) {
		String str = "   Вертикальная черта разделяет допустимые варианты. Например,  "
				+ " gray|grey соответствует gray или grey. Следует помнить, что перебор вариантов "
				+ "выполняется слева направо, как они указаны.";
		String[] res = str.split("\\b");
		int n = res.length;
		
		System.out.println("The number of words = " + n/2);
	}

}
