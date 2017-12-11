package com.itacademy.task08;

public class Faktorial {

	public static void main(String[] args) {
		long faktorial = 1;
		int i = 1;
		while (i <= 20) {
			faktorial *= i;
			i++;
		}

		System.out.println("Факториал:" + faktorial);

	}

}
