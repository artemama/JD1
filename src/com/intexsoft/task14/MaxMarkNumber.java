package com.intexsoft.task14;

public class MaxMarkNumber {

	public static void main(String[] args) {
		int marks[] = new int[5];
		for (int i = 0; i < marks.length; i++) {
			marks[i] = (int) (Math.random() * 10 + 1);
		}
		for (int i = 0; i < marks.length; i++) {
			System.out.println("Ученик №" + i + " = " + marks[i]);
		}

		int nrNumberInMass = 0;
		int maxMark = 0;
		for (int i = 0; i < marks.length; i++) {
			if (maxMark < marks[i])
				maxMark = marks[i];
			if (maxMark == marks[i]) {
				nrNumberInMass = i;
			}
		}

		System.out.println("Максимальная оценка =" + maxMark);
		System.out.println("Номер ученика - " + nrNumberInMass);

	}

}
