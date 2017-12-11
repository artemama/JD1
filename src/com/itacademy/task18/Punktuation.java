package com.itacademy.task18;

public class Punktuation {

	public static void main(String[] args) {
		String str = "Тестовая, строка, с::;;; несколькими,, запятыми! разными?, другими. ??знаками:!???????????";
		int before = str.length();
		int after = str.replaceAll("[-.?!)(,:]", "").length();
		System.out.println("The number of punctuation marks in the text: " + (before - after));

	}
}
