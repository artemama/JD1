package com.intexsoft.task02;

public class HelloWorld {

	public static void main(String[] args) {
		int s = 2513705;
		int sec;
		int m;
		int min, h, hours, d, day, w, week;
		sec = s % 60;
		m = (s - sec) / 60;
		min = m % 60;
		h = (m - min) / 60;
		hours = h % 24;
		d = (h - hours) / 24;
		day = d % 7;
		week = day % 7;
		w = (d - week) / 4;

		String str = String.format("%s Недель, %s дней, %s часов, %s минут, %s секунд ", w, day, hours, min, sec);
		System.out.println(str);
	}

}
