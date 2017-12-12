package com.itacademy.task22;

public class MainTimeInterval {

	public static void main(String[] args) {
		TimeInterval obj1 = new TimeInterval(12578);
		TimeInterval obj2 = new TimeInterval(15,20,36);
		obj1.printAllTime();
		obj2.printDividedTime();
		obj2.compareTime();
	}

}
