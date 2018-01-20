package com.itacademy.Part1.task07;

public class Homes {

	public static void main(String[] args) {
		int wight1 = 3;
		int wight2 = 4;
		int height1 = 5;
		int height2 = 6;
		int landwght = 9;
		int landheit = 9;
		if (wight1 + wight2 <= landheit && height1 + height2 <= landwght) {
			System.out.println("���� ����������");
		}
		if (wight1 + wight2 <= landwght && height1 + height2 <= landheit) {
			System.out.println("���� ����������");
		}
		if (wight1 + height2 <= landwght && height1 + wight2 <= landheit) {
			System.out.println("���� ����������");
		}
		if (wight1 + height2 <= landheit && height1 + wight2 <= landwght) {
			System.out.println("���� ����������");
		} else {
			System.out.println("���� �� ����������");

		}

	}

}
