package com.intexsoft.task15;

public class SumMinMaxMarks {

	public static void main(String[] args) {
		int marks[] = new int[5];
		for (int i = 0; i < marks.length; i++) {
			marks[i] = (int) (Math.random() * 10 + 1);
		}
		for (int i = 0; i < marks.length; i++) {
			System.out.println("Ученик №" + i + " = " + marks[i]);
		}
		int nrMaxMarkInMass = 0;
		int nrMinMarkInMass = 10;
		int maxMark = 0;
		int minMark = 0;
		for (int i = 0; i < marks.length; i++) {
			if (maxMark < marks[i])
				maxMark = marks[i];
			if (maxMark == marks[i]) {
				nrMaxMarkInMass = i;
			}
		}
		for (int i = 0; i < marks.length; i++) {
			if (minMark > marks[i])
				minMark = marks[i];
			if (minMark == marks[i]) {
				nrMinMarkInMass = i;
			}
		}

		System.out.println("Максимальная оценка =" + maxMark);
		System.out.println("Минимальная оценка =" + minMark);
		System.out.println("Номер ученика с максимальной оценкой - " + nrMaxMarkInMass);
		System.out.println("Номер ученика с минимальной оценкой - " + nrMinMarkInMass);

	}

}
