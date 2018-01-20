package com.itacademy.Part1.task23;

public class CashMashine {
	private static int x100;
	private static int x50;
	private static int x20;
	private static int cash;

	public void addMoney(int addnote100, int addnote50, int addnote20) {
		// Loading CashMashine

		x100 += addnote100;
		x50 += addnote50;
		x20 += addnote20;
	}

	void askMoney(int requestCash) {
		boolean firstAnswer;
		cash = requestCash;
		if (requestCash % 10 != 0) {
			System.out.println("Wrong sum, pleas enter correct sum");
		} else {

			if (x100 * 100 + x50 * 50 + x20 * 20 >= requestCash) {
				firstAnswer = true;
				System.out.println("The money is enough");

			} else {
				firstAnswer = false;
				System.out.println("not enough money");
			}

		}

	}

	void reqestMoney() {
		int[] nominal = { 20, 50, 100 }; // the array of available notes
		int[] count = new int[nominal.length]; // the number of banknotes to give
		int index = nominal.length - 1;

		while (index != -1) {
			count[index] = cash / nominal[index];
			cash %= nominal[index];
			index--;
		}
		for (int i = 0; i < count.length; i++) {
			System.out.printf("Номинал в %d руб. = %d шт.\n", nominal[i], count[i]);
		}
	}
}
