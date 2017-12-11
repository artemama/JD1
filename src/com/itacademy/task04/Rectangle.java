package com.itacademy.task04;

public class Rectangle {

	public static void main(String[] args) {
		int a = 5;
		int b = 8;
		double r = 5;

		// надо найти длину диагонали прямоугольника по теореме пифагора

		double res = ((Math.sqrt(a * a + b * b)) / 2);
		System.out.println("При размерах  прямоугольника - " + a + " на " + b);
		System.out.println("Радиус круга должен быть не менее " + res);
		if (res <= r) {
			System.out.println("Закроет");

		} else {
			System.out.println("Не закроет");

		}

	}

}
