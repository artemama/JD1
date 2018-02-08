package com.itacademy.av.command;

import java.io.IOException;

public class ExitProgram extends Command {
	
	public ExitProgram(String key) {
		super("Выйти из программы", key);
		setKey(key);
	}

	@Override
	public void execute() throws IOException {
		// TODO Auto-generated method stub
		System.exit(0);

	}

}
