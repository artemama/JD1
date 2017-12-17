package com.itacademy.task26;

import java.util.ArrayList;

public class MarksArrList {
	public static void main(String[] args) {
		int pupils = 10;
		ArrayList<Integer> marks = new ArrayList<Integer>(pupils);
		for (int i = 0; i < pupils; i++) {
			int x = (int) (Math.random() * 10 + 1);
			marks.add(x);
		}
		System.out.println(marks);
		int badmark = 3;
		for (int i = 0; i < marks.size(); i++) {
			if (marks.get(i) <= badmark) {
				marks.remove(i);

			}
		}

		System.out.println(marks);

	}

}
