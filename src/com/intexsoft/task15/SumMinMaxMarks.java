package com.intexsoft.task15;

public class SumMinMaxMarks {

	public static void main(String[] args) {
		int marks[] = new int[5];
		for (int i = 0; i < marks.length; i++) {
			marks[i] = (int) (Math.random() * 10 + 1);
		}
		for (int i = 0; i < marks.length; i++) {
			System.out.println("������ �" + i + " = " + marks[i]);
		}

		int nrMaxMarkInMass = 0;
		int nrMinMarkInMass = 10;
		int maxMark = 0;
		for (int i = 0; i < marks.length; i++) {
			if (maxMark < marks[i])
				maxMark = marks[i];
		}
		System.out.println("������������ ������ = " + maxMark);

		for (int i = 0; i < marks.length; i++) {
			if (maxMark == marks[i])
				nrMaxMarkInMass = i;
		}

		System.out.println("����� ������� � ������������ ��������� - " + nrMaxMarkInMass);
		int minMark = 10;
		for (int i = 0; i < marks.length; i++) {
			if (minMark > marks[i])
				minMark = marks[i];
		}
		System.out.println("����������� ������ = " + minMark);

		for (int i = 0; i < marks.length; i++) {

			if (minMark == marks[i])
				nrMinMarkInMass = i;
		}

		System.out.println("����� ������� � ����������� ��������� - " + nrMinMarkInMass);
		
		int sum = 0;
		if (nrMaxMarkInMass > nrMinMarkInMass) {
			for (int i = nrMinMarkInMass; i < nrMaxMarkInMass; i++) {
				
				sum += marks[i];
			}
		} else  
			for (int i = nrMaxMarkInMass; i < nrMinMarkInMass; i++) {
				sum += marks[i];	
			}
		System.out.println("����� - " + sum);

		}

			
}
