package com.itacademy.Part1.task04;

public class Rectangle {

	public static void main(String[] args) {
		int a = 5;
		int b = 8;
		double r = 5;

		// ���� ����� ����� ��������� �������������� �� ������� ��������

		double res = ((Math.sqrt(a * a + b * b)) / 2);
		System.out.println("��� ��������  �������������� - " + a + " �� " + b);
		System.out.println("������ ����� ������ ���� �� ����� " + res);
		if (res <= r) {
			System.out.println("�������");

		} else {
			System.out.println("�� �������");

		}

	}

}
