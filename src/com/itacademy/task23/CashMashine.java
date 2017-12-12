package com.itacademy.task23;

public class CashMashine {
	private static int x100;
	private static int x50;
	private static int x20;

	public static void addMoney(int addnote100, int addnote50, int addnote20) {
		// Loading CashMashine

		addnote100 += x100;
		addnote50 += x50;
		addnote20 += x20;

	}

	static void askMoney(int requestCash) {
		if (requestCash % 10 != 0) {
			System.out.println("Wrong sum, pleas enter correct sum");
		} else {
			boolean firstAnswer;
			if (x100 * 100 + x50 * 50 + x20 * 20 >= requestCash) {
				firstAnswer = true;

			} else {
				firstAnswer = false;
				System.out.println("not enough money");
			}

		}

	}
}
