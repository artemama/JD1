package com.itacademy.av.command;

import java.util.ArrayList;
import java.util.List;

import com.itacademy.av.db.DB;


public class FindCar extends Command {

	public FindCar(String key, String name) {
		super(key, name);
	}

	private List<Command> secondLevelCommands = new ArrayList<>();

	public void execute() {
		

	}

}
