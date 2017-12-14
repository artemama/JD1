package com.itacademy.task23;

public class Bankomat {

	public static void main(String[] args) {
		CashMashine CM1 = new CashMashine();

		CM1.addMoney(20, 30, 5);
		CM1.askMoney(2050);
		CM1.reqestMoney();

	}

}
