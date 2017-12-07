package com.intexsoft.task17;

public class Butterfly {

	public static void main(String[] args) {
		int bflyarr[][] = new int[5][5];
		int i, j;

		for (i = 0; i < bflyarr.length / 2 + 1; i++) {
			for (j = 0; j < bflyarr[i].length; j++) {
				if ((j < i) || (j >= (bflyarr[i].length - i)))
					bflyarr[i][j] = 0;
				else
					bflyarr[i][j] = 1;

			}

		}
		for (i = bflyarr.length - 1; i >= bflyarr.length / 2; i--) {
			for (j = 0; j < bflyarr[i].length; j++) {
				if ((j < (bflyarr[i].length - 1 - i)) || (j > i))
					bflyarr[i][j] = 0;
				else
					bflyarr[i][j] = 1;
			}
		}
		for (i = 0; i < bflyarr.length; i++) {
			for (j = 0; j < bflyarr[i].length; j++) {
				System.out.print(bflyarr[i][j]);
			}
			System.out.println("");
		}
	}

}
