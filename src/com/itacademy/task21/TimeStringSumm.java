package com.itacademy.task21;

public class TimeStringSumm {

	public static void main(String[] args) {
		String str = "¬ стандартную библиотеку Java входит пакет, специально предназначенный дл€ работы с регул€рными выражени€ми Ч java.util.regex.";
		long startTime = System.currentTimeMillis();

		for (int i = 0; i < 20; i++) {
			str += str;
		}
		long timeSpent = System.currentTimeMillis();
		long timeSpentFinal = timeSpent - startTime;
		System.out.println("программа выполн€лась " + timeSpentFinal * 1000 + " миллисекунд");

		long startTime1 = System.currentTimeMillis();
		StringBuilder strbild = new StringBuilder();
		for (int i = 0; i < 20000; i++) {
			strbild.append(strbild);
		}
		long timeSpent1 = System.currentTimeMillis();
		long timeSpentFinal1 = timeSpent1 - startTime1;
		System.out.println("программа co StringBuilder выполн€лась " + timeSpentFinal1 + " миллисекунд(ы)");
	}

}