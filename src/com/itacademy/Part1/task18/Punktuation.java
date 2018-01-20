package com.itacademy.Part1.task18;

public class Punktuation {

	public static void main(String[] args) {
		String str = "��������, ������, �::;;; �����������,, ��������! �������?, �������. ??�������:!???????????";
		int before = str.length();
		int after = str.replaceAll("[-.?!)(,:]", "").length();
		System.out.println("The number of punctuation marks in the text: " + (before - after));

	}
}
