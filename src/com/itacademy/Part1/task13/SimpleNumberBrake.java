package com.itacademy.Part1.task13;

public class SimpleNumberBrake {

	public static void main(String[] args) {

		int number = 3527;
		int temp = 1;
		for (int i = 2; i < number + 1; i++) {
			temp = number % i;
			if (temp == 0 && i != number) {
				System.out.println(number + " - a composite number");
				break;

			} else if (temp == 0 && i == number) {
				System.out.println(number + " - Simple number");

			}

		}
	}

}