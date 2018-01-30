package com.itacademy.exel.command;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import com.itacademy.exel.dock.Document;

public class CSaveProgramm extends Command {
	private Document document;

	public CSaveProgramm(/*String key,*/ String string) {
		super("Сохранить файл");
		/*setKey(key);*/
	

	}


	/*public CSaveProgramm(Document document) {
		super("Сохранить файл");
		this.document = document;
		// TODO Auto-generated constructor stub
	}
*/

	@Override
	public void execute() throws IOException {
		System.out.println("Введите имя файла для сохранения");
		Scanner scaner = new Scanner(System.in);
		String fileName = "";
		
		FileOutputStream fos = new FileOutputStream(fileName);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(this.document);
		oos.flush();
		oos.close();
		System.out.println(String.format("Файл с именем %s создан", fileName));
	}

}
