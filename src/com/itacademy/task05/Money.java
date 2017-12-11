package com.itacademy.task05;

public class Money {

	public static void main(String[] args) {
		int money = 54628;
		int end;
		end = money % 10;
		if (end == 1) {
			System.out.println(money + " rubl");
		} else if (end == 2 || end == 3 || end == 4) {
			System.out.println(money + " rublia");
		} else if (end == 5 || end == 6 || end == 7 || end == 8 || end == 9 || end == 0) {
			System.out.println(money + " rubls"); //sorry for some translite
		}
	}
}
