package com.itacademy.task09;

import java.util.Random;

public class MaxNum {

	public static void main(String[] args) {

		Random rand = new Random();
		int max = 0;
		for (int i = 0; i < 20; i++) {
			int cicle = rand.nextInt(50);
			if (max < cicle) {
				max = cicle;
			}
			System.out.println(" " + cicle);

		}
		System.out.println();
		System.out.println("Максимальное значение - " + max);

	}

}
