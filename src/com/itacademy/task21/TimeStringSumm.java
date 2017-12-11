package com.itacademy.task21;

public class TimeStringSumm {

	public static void main(String[] args) {
		String str = "� ����������� ���������� Java ������ �����, ���������� ��������������� ��� ������ � ����������� ����������� � java.util.regex.";
		long startTime = System.currentTimeMillis();

		for (int i = 0; i < 20; i++) {
			str += str;
		}
		long timeSpent = System.currentTimeMillis();
		long timeSpentFinal = timeSpent - startTime;
		System.out.println("��������� ����������� " + timeSpentFinal * 1000 + " �����������");

		long startTime1 = System.currentTimeMillis();
		StringBuilder strbild = new StringBuilder();
		for (int i = 0; i < 20000; i++) {
			strbild.append(strbild);
		}
		long timeSpent1 = System.currentTimeMillis();
		long timeSpentFinal1 = timeSpent1 - startTime1;
		System.out.println("��������� co StringBuilder ����������� " + timeSpentFinal1 + " �����������(�)");
	}

}