package com.itacademy.exel.command;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;

import com.itacademy.exel.dock.Document;

public class COpenFile extends Command {
	public COpenFile(String key) {
		super("Открыть  документ", key);
		setKey(key);
	}

	@Override
	public void execute() throws IOException {
		System.out.println("введите имя файла для открытия");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String fileName = reader.readLine();
		Document document = new Document();
		// open file from file system, deserialize and propose action items

		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName));) {
			Document doc = (Document) ois.readObject();
			ois.close();
			System.out.println(String.format("Документ %s открыт", fileName));
		} catch (FileNotFoundException e) {
			System.out.println("File not found.");
			reader.readLine();
		} catch (Exception e) {
			System.out.println("Something is wrong.");
		}
	}

}
