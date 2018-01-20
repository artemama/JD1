package com.itacademy.Part1.task19;

public class LettersInText {

	public static void main(String[] args) {
		String str = "   ������������ ����� ��������� ���������� ��������. ��������,  "
				+ " gray|grey ������������� gray ��� grey. ������� �������, ��� ������� ��������� "
				+ "����������� ����� �������, ��� ��� �������.";
		String[] res = str.split("\\b");
		int n = res.length;
		
		System.out.println("The number of words = " + n/2);
	}

}
