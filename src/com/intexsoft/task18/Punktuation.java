package com.intexsoft.task18;

public class Punktuation {

	public static void main(String[] args) {
		String str = "��������, ������, �::;;; �����������,, ��������! �������?, �������. ??�������:!???????????";
		/*int n = 0;
		int n1 = 0;
		// int n2 = 0;
		int p = 0;
		int q = 0; // ?
		// int � = 0; // !
		// int � = 0; // :
		while (p != -1) {
			p = str.indexOf(',', p);
			if (p != -1) {
				p++;
				n++;
			}
			while (q != -1) {
				q = str.indexOf('?', q);
				if (q != -1) {
					q++;
					n1++;
				}
			}
			// � �.�. ����� ��� ����������
		}
		System.out.println("� ��� ���� " + n + " �������, " + n1 + " ��������");*/
				
		// ������ �������!!!!!!!!!!!!!

		int before = str.length();
		int after = str.replaceAll("[-.?!)(,:]", "").length();
		System.out.println("���������� ������ ���������� � ������: " + (before - after));

	}
}
