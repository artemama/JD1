package com.intexsoft.task11;

public class SimpleNum {

	public static void main(String[] args) {
		int temp = 0;
		int number = 167;
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				temp++;
			}
		}
		if (temp == 0) {
			System.out.println("Число простое");
		} else {
			System.out.println("Составное число");
		}
	}


}
