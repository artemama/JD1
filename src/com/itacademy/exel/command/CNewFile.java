package com.itacademy.exel.command;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CNewFile extends Command{

	public CNewFile(String key) {
		super("Открыть  документ");
		setKey(key);
	}

	@Override
	public void execute() throws IOException { // should not throw. cathc and retry
		System.out.println("введите имя файла для создания");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String fileName = reader.readLine();
		// create a new file
		// print list of actions (commands) for a new file
		
	}

}
