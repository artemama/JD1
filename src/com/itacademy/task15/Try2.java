package com.itacademy.task15;

public class Try2 {

	public static void main(String[] args) {
		int marks[] = new int[10];
		for (int i = 0; i < marks.length; i++) {
			System.out.print((marks[i] = (int) (Math.random() * 10 + 1)) + " ");
		}
		int maxMark = marks[0];
		int maxNumber = 1;
		int minMark = marks[0];
		int minNumber = 1;
		for (int i = 1; i < marks.length; i++) {
			if (maxMark < marks[i]) {
				maxMark = marks[i];
				maxNumber = i + 1;
			}
			if (minMark > marks[i]) {
				minMark = marks[i];
				minNumber = i + 1;
			}
		}
		if (minNumber < maxNumber) {
			int i = minNumber;
			minNumber = maxNumber;
			maxNumber = i;
		}
		int sum = 0;
		for (int i = maxNumber; i < minNumber - 1; i++) {
			sum += marks[i];
		}
		System.out.println("Sum is " + sum);

	}

}
/*
 * https://github.com/search?l=Java&o=asc&p=4&q=JD1&s=updated&type=Repositories&
 * utf8=%E2%9C%93
 */