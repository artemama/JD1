package com.itacademy.exel.command;

import java.io.IOException;

public class CSaveProgramm extends Command {
	public CSaveProgramm(String key) {
		super("Сохранить файл");
		setKey(key);
	}

	@Override
	public void execute() throws IOException {
		// TODO Auto-generated method stub

	}

}
