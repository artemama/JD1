package com.itacademy.av.command;

import java.io.IOException;

public class ExitProgram extends Command {
	
	public ExitProgram(String key, String name) {
		super(key, name);
	}

	public void execute() throws IOException {
		// TODO Auto-generated method stub
		System.exit(0);

	}

}
