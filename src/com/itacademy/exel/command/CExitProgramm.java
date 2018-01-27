package com.itacademy.exel.command;

public class CExitProgramm extends Command {

	public CExitProgramm(String key) {
		super("выйти из программы");
		setKey(key);
	}

	@Override
	public void execute() {
		// TODO print good bye...
		System.exit(0);
	}

}