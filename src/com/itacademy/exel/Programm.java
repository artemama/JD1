package com.itacademy.exel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import com.itacademy.exel.command.CExitProgramm;
import com.itacademy.exel.command.CNewFile;
import com.itacademy.exel.command.COpenFile;
import com.itacademy.exel.command.CSaveProgramm;
import com.itacademy.exel.command.Command;
import com.itacademy.exel.dock.Document;


public class Programm {

	private List<Command> topLevelCommands = new ArrayList<>();
	private List<Command> secondLevelCommands = new ArrayList<>();
	
	public Programm() {
		super();
		topLevelCommands.add(new CNewFile("0"));
		topLevelCommands.add(new COpenFile("1"));
		topLevelCommands.add(new CExitProgramm("2"));
		topLevelCommands.add(new CSaveProgramm("3"));

		
		secondLevelCommands.add((0), null);
	}

	public void start() throws IOException {
		while (true) {
			System.out.println("Выберите необходимую комманду...");
			for (Command command : topLevelCommands) {
				command.printMenuItem();
			}
		
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); //читает введенное значение

			String input = reader.readLine();

			for (Command command : topLevelCommands) {
				if (command.isSelected(input)) {
					command.execute();
				}
			}
		}
	}
	protected void enterSecondMenu(Document document) {
		System.out.println("You are in file menu.");
		List<Command> secondLevelCommands = new ArrayList<Command>();
	/*	secondLevelCommands.add(new CRead("1", "Read cell", table));
		secondLevelCommands.add(new CEdit("2", "Edit cell", table));
		secondLevelCommands.add(new CSave("3", "Save file", table));
		secondLevelCommands.add(new CommandExit("4", "For close file and exit"));
		Menu menu = new Menu(secondLevelCommands);
		menu.execute();*/
	}
}
