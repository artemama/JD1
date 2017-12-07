package com.intexsoft.task18;

public class Punktuation {

	public static void main(String[] args) {
		String str = "Тестовая, строка, с несколькими,, запятыми! разными?, другими. ??знаками:!???????????";
		int n = 0;
		int n1 = 0;
		int n2 = 0;
		int p = 0;
		int q = 0;  //  ?
		int е = 0;  //  !
		int с = 0;  //  :
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
		}
		System.out.println("У нас есть " + n + " запятых, "+  n1 + " вопросов");

	
	}
}

/*
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
 


public static void main(String[] args) {
 
        String text = "Доброго времени суток. Помогите, пожалуйста, с программой. Необходимо подсчитать количество знаков препинания вне главной диагонали матрицы.";
        int before = text.length();
        int after = text.replaceAll("[,.]", "").length();
        System.out.println("Количество знаков препинания в тексте: " + (before - after));
 
    }
}
*/