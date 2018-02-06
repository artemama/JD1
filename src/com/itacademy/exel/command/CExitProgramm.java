package com.itacademy.exel.command;

public class CExitProgramm extends Command {

	public CExitProgramm(String key) {
		super("Выйти из программы", key);
		setKey(key);
	}

	@Override
	public void execute() {
		// TODO print good bye...
		System.exit(0);
	}

}
