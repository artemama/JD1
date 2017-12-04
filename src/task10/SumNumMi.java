package task10;

import java.util.Random;

public class SumNumMi {

	public static void main(String[] args) {
		Random randnum = new Random();
		int number = randnum.nextInt(10000);
		int summa = 0;

		System.out.println(number);

		while (number > 0) {
			int tmp = number % 10;
			number /= 10;
			summa += tmp;
		}
		System.out.println(" " + summa);

	}

}
