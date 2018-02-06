package com.itacademy.exel.dock;

import java.util.Scanner;

import com.itacademy.exel.command.Command;

public class CellEdit extends Command{
	private Document document;

	public CellEdit (String title, String key, Document document) {
		super(title, key, document);
		this.document = document;
	}

	@Override
	public void execute() {
		
		Integer i = Integer.valueOf(toString());
		
		System.out.println("Введите значение ячейки");
		Cell cell = new Cell(document);
		Scanner scan = new Scanner(System.in);
		
		try {
			cell.setValue(scan.next());
			if (document.lineExist(i)) {
				document.getline(i);
			} else {
				Line line = new Line();
				line.addCell(i, cell);
			}
			System.out.println("Ячейка создана");
		} catch (NumberFormatException e) {
			
		}
		
	}

}
