package com.itacademy.avfail.command;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.itacademy.av.db.DB;


public class FindCar  extends Command{

	public FindCar(String key
			) {
		super("Искать машину", key);
		setKey(key);
	}
	private List<Command> secondLevelCommands = new ArrayList<>();

	public void execute() throws IOException {
		
	}
	

}
