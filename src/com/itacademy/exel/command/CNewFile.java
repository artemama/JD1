package com.itacademy.exel.command;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;

import com.itacademy.exel.dock.Document;

public class CNewFile extends Command implements Serializable{

	public CNewFile(String key) {
		super("Создать  документ");
		setKey(key);
	}

	@Override
	public void execute() throws IOException { // should not throw. cathc and retry
		System.out.println("введите имя файла для создания");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String fileName = reader.readLine();
		// create a new file
		
		
	/*  !!	Document document = new Document(document, docName);*/
		
		
		// print list of actions (commands) for a new file
		
	}

}
