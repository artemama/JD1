package com.itacademy.exel.command;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;

import com.itacademy.exel.dock.Cell;
import com.itacademy.exel.dock.Document;
import com.itacademy.exel.dock.Line;

public class CNewFile extends Command implements Serializable {

	private Document document;

	public CNewFile(String key) {
		super("Создать  документ", key);
		setKey(key);
	}

	@Override
	public void execute() throws IOException { // should not throw. cathc and retry
		System.out.println("введите имя файла для создания");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String fileName = reader.readLine();
		// create a new file
		try (FileOutputStream fos = new FileOutputStream(fileName);
				ObjectOutputStream oos = new ObjectOutputStream(fos);) {
			oos.writeObject(this.document);
			oos.close();
			System.out.println(String.format("File %s was saved.", fileName));
		} catch (IOException e) {
			System.out.println("File wasn't saved.");
		}

		System.out.println("Файл создан с именем " + fileName);
		// print list of actions (commands) for a new file

	}

}
