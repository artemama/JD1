package com.itacademy.exel.dock;

import java.util.NoSuchElementException;
import java.util.Scanner;

import com.itacademy.exel.command.Command;

public class CellReader extends Command{
	private Document document;

	public CellReader(String title, String key, Document document) {
		super(title, key);
		this.document = document;
	}

	@Override
	public void execute() {
		String s;
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("Please, enter cell address. For example [23,D]. (Remember [1..1000,A-Z]).");
			s = scan.next();
		} while (s.matches("\\[([1-9][0-9]{0,2}|1000),[A-Z]\\]")); {
			System.out.println("Incorrect cell address.");
		}
	
		
		try {
			System.out.println("Cell " +  s);
		} catch (NullPointerException e) {
			System.out.println(String.format("Cell %s doesn-t exist", s));
		} catch (NoSuchElementException | NumberFormatException e) {
			System.out.println("Incorrect value in one of the cells.");
		}
	}


}
