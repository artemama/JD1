package com.itacademy.exel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import com.itacademy.av.command.CExitProgramm;
import com.itacademy.av.command.FindCar;
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
		topLevelCommands.add(new FindCar("0"));
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

			// Reading data using readLine
			String input = reader.readLine();

			for (Command command : topLevelCommands) {
				if (command.isSelected(input)) {
					command.execute();
				}
			}
		}
	}
	protected void enterToSecondMenu(Document document) {
		System.out.println("You are in file menu.");
		List<Command> secondLevelCommands = new ArrayList<Command>();
	/*	secondLevelCommands.add(new CommandRead("read", "For read cell print", sheet));
		secondLevelCommands.add(new CommandEdit("edit", "For edit cell print", sheet));
		secondLevelCommands.add(new CommandSave("save", "For save file print", sheet));
		secondLevelCommands.add(new CommandExit("exit", "For close file and exit to previous menu print"));
		Menu menu = new Menu(secondLevelCommands);
		menu.execute();*/
	}
}
