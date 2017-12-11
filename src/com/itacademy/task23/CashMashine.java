package com.itacademy.task23;

public class CashMashine {
	static int x100;
	static int x50;
	static int x20;

	public static void main(String[] args) {
		// Loading CashMashine

		x100 = 5;
		x50 = 10;
		x20 = 20;
	}

	private static void askmoney() {
		int requestCash = 1000;
		if (requestCash % 10 != 0) {
			System.out.println("Wrong sum, pleas enter correct sum");

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
