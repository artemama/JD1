package com.itacademy.av.command;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FindCar extends Command{

	public FindCar(String key) {
		super("Искать машину", key);
		setKey(key);
	}
	private List<Command> secondLevelCommands = new ArrayList<>();

	@Override
	public void execute() throws IOException {
		
	}
	

}
