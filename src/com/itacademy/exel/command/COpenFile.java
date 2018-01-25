package com.itacademy.exel.command;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class COpenFile extends Command {
	public COpenFile(String key) {
		super("Cоздать  документ");
		setKey(key);
	}

	@Override
	public void execute() throws IOException {
		System.out.println("введите имя файла для открытия");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String fileName = reader.readLine();
		// open file from file system, deserialize and propose action items
		// print list of actions (commands) for a current opened file file
	}
}
