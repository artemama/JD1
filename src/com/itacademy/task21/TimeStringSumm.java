package com.itacademy.task21;

public class TimeStringSumm {

	public static void main(String[] args) {
		String str = "Продвижение меняется и старые механики скоро перестанут давать эффект. Время перемен открывает новые дороги.";
		long startTime = System.nanoTime();

		for (int i = 0; i < 20; i++) {
			str += str;
		}
		long timeSpent = System.nanoTime();
		long timeSpentFinal = timeSpent - startTime;
		System.out.println(String.format("the program was implemented %s milliseconds", timeSpentFinal));

		long startTime1 = System.nanoTime();
		StringBuilder strbild = new StringBuilder();
		for (double i = 0; i < 20; i++) {
			strbild.append(strbild);
		}
		long timeSpent1 = System.nanoTime();
		long timeSpentFinal1 = timeSpent1 - startTime1;
		System.out.println(String.format("the program was run StringBuilder %s milliseconds", timeSpentFinal1));
	}

}