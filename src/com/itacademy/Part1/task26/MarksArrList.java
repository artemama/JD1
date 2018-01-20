package com.itacademy.Part1.task26;

import java.util.ArrayList;
import java.util.Iterator;

public class MarksArrList {
	public static void main(String[] args) {
		int pupils = 20;
		ArrayList<Integer> marks = new ArrayList<Integer>(pupils);
		for (int i = 0; i < pupils; i++) {
			int x = (int) (Math.random() * 10 + 1);
			marks.add(x);
		}
		System.out.println(marks);
		int badmark = 3;
		for (Iterator<Integer> iterator = marks.iterator(); iterator.hasNext();) {
			if (iterator.next() <= badmark) {
				iterator.remove();

			}

		}

		/*
		 * for (int i = 0; i < marks.size(); i++) { if (marks.get(i) <= badmark) {
		 * marks.remove(i);
		 * 
		 * } }
		 */

		System.out.println(marks);

	}

}
