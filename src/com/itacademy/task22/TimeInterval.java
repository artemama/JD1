package com.itacademy.task22;

public class TimeInterval {

	private int hour;
	private int minut;
	private int second;

	public TimeInterval(int h, int m, int s) {
		hour = h;
		minut = m;
		second = s;
	}

	public TimeInterval(int allsec) {
		second = allsec;
	}

	public int returnAllSecond() {
		return hour * 3600 + minut * 60 + second;
	}

	public void printAllTime() {
		System.out.println("Object1 \\(only seconds\\) = " + second);
	}

	public void printDividedTime() {
		System.out.println(String.format("Object2 have %s hours, %s minuts, %s seconds", hour, minut, second));
	}

	public int compareTime() {
		if (this.second >= this.returnAllSecond()) {
			System.out.println("Object1 => Object2");
		} else {
			System.out.println("Object1 < Object2");
		}

		return this.second - this.returnAllSecond();

	}

}
