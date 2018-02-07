package com.itacademy.exel.command;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import com.itacademy.exel.dock.Cell;
import com.itacademy.exel.dock.Document;

public class CSaveProgramm extends Command {
	private Document document;

	public CSaveProgramm(String key) {
		super("Сохранить файл", key);
		setKey(key);
	}

	@Override
	public void execute() throws IOException {

		System.out.println("Введите имя файла для сохранения");
		Scanner scaner = new Scanner(System.in);
		String fileName = "";
		fileName = scaner.next();

		FileOutputStream fos = new FileOutputStream(fileName);
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		oos.writeObject(this.document);
		oos.close();
		System.out.println(String.format("Файл с именем %s создан", fileName));
	}

}
