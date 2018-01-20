package com.itacademy.Part1.task02;

public class HelloWorld {

	public static void main(String[] args) {
		final int s = 2513705;
		int sec = s % 60;
		int m = (s - sec) / 60;
		int min = m % 60;
		int h = (m - min) / 60;
		int hours = h % 24;
		int d = (h - hours) / 24;
		int day = d % 7;
		int week = day % 7;
		int w = (d - week) / 4;

		String str = String.format("%s ������, %s ����, %s �����, %s �����, %s ������ ", w, day, hours, min, sec);
		System.out.println(str);
	}

}
