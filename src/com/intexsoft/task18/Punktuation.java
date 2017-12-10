package com.intexsoft.task18;

public class Punktuation {

	public static void main(String[] args) {
		String str = "Тестовая, строка, с::;;; несколькими,, запятыми! разными?, другими. ??знаками:!???????????";
		/*int n = 0;
		int n1 = 0;
		// int n2 = 0;
		int p = 0;
		int q = 0; // ?
		// int е = 0; // !
		// int с = 0; // :
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
			// и т.д. можно все перечилить
		}
		System.out.println("У нас есть " + n + " запятых, " + n1 + " вопросов");*/
				
		// второй вариант!!!!!!!!!!!!!

		int before = str.length();
		int after = str.replaceAll("[-.?!)(,:]", "").length();
		System.out.println("Количество знаков препинания в тексте: " + (before - after));

	}
}
