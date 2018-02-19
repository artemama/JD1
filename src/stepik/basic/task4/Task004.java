package stepik.basic.task4;

import java.util.Scanner;

/*
1. Написать программу, вычисляющую сумму цифр введённого
пользователем целого числа.
 */

public class Task004 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		String numberIn = scanner.nextLine();
		int sumNumber = 0;
		
		for (int i = 0; i < numberIn.length(); i++) {
			char tmp = numberIn.charAt(i);
			String sTmp = String.valueOf(tmp);
			sumNumber = sumNumber + Integer.parseInt(sTmp);
		}
		
		System.out.println(sumNumber);
	}

}
