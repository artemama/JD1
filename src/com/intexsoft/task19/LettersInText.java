package com.intexsoft.task19;

public class LettersInText {

	public static void main(String[] args) {
		String str = "   ������������ ����� ��������� ���������� ��������. ��������,  "
				+ " gray|grey ������������� gray ��� grey. ������� �������, ��� ������� ��������� "
				+ "����������� ����� �������, ��� ��� �������.";
		String[] res = str.split("\\b");
		int n = res.length;
		
		System.out.println("���������� ���� = " + n/2);
	}

}
