package com.intexsoft.task14;

public class MaxMarkNumber {

	public static void main(String[] args) {
		int marks[] = new int[5];
		for (int i = 0; i < marks.length; i++) {
			marks[i] = (int) (Math.random() * 10 + 1);
		}
		for (int i = 0; i < marks.length; i++) {
			System.out.println("Pupil ¹" + i + " = " + marks[i]);
		}

		int nrNumberInMass = 0;
		int maxMark = 0;
		for (int i = 0; i < marks.length; i++) {
			if (maxMark < marks[i])
				maxMark = marks[i];
		}
		System.out.println("Max mark = " + maxMark);

		for (int i = 0; i < marks.length; i++) {
			if (maxMark == marks[i])
				nrNumberInMass = i;
		}

		System.out.println("Pupil number - " + nrNumberInMass);

	}

}
