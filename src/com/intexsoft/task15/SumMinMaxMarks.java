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
		int nrMinMarkInMass = 0;
		int maxMark = 0;
		int minMark = 0;

		for (int i = 0; i < marks.length; i++) {
			if (minMark < marks[i]) {
				minMark = marks[i];
			//	nrMinMarkInMass = i;
			}
			if (maxMark > marks[i]) {
				maxMark = marks[i];
				nrMaxMarkInMass = i;
			}
			System.out.println("�aks ������ =" + maxMark);
			System.out.println("����������� ������ =" + minMark);
		}

		/*	if (minMark == marks[i]) {
		//		nrMinMarkInMass = i;
				System.out.println("����������� ������ =" + minMark);
			}
		

		for (int j = 0; j < marks.length; j++) {
			if (maxMark < marks[j])
				maxMark = marks[j];
			if (maxMark == marks[j]) {
				nrMaxMarkInMass = j;
			}
		}*/

		System.out.println("������������ ������ =" + maxMark);

		System.out.println("����� ������� � ������������ ������� - " + nrMaxMarkInMass);
		System.out.println("����� ������� � ����������� ������� - " + nrMinMarkInMass);

	}

}
