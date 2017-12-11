package com.itacademy.task16;

import java.util.Arrays;

public class WorkWArray {

	public static void main(String[] args) {
		int workarray[] = new int[10];
		for (int i = 0; i < workarray.length; i++) {
			workarray[i] = (int) (Math.random() * 8 + 1);

		}
		System.out.println("Start array : " + Arrays.toString(workarray));

		for (int i = 0; i < workarray.length / 2; i++) {
			int tmp = workarray[i];
			workarray[i] = workarray[workarray.length - 1 - i];
			workarray[workarray.length - 1 - i] = tmp;
		}
		System.out.println("Reversed array : " + Arrays.toString(workarray));
	}

}
