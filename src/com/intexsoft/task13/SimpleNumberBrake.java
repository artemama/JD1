package com.intexsoft.task13;

public class SimpleNumberBrake {

	public static void main(String[] args) {

		int number = 167;
		int temp = 1;
		for (int i = 2; i < number+1; i++) {
			temp = number % i;
			if (temp == 0&&i!=number) {
				System.out.println(number + " - Составное число");
				break;

			} else {
				if (temp == 0 && i == number) {
					System.out.println(number + " - Простое число");

				}

			}

		}
	}

}