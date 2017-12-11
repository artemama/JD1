package com.itacademy.task10;

public class SumNumbers {

	public static void main(String[] args) {

		int number = 58245637, sum = 0, tmp = 0;

		for (int i = 1; number > 10; i++) {
			tmp = number % 10;
			sum = sum + tmp;
			number = (number - tmp) / 10;
		}
		if (number < 10) {
			sum = sum + number;
		} else if (number == 10) {
			sum = sum + 1;
		}
		System.out.println("Sum=" + sum);

	}

}
