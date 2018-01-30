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

public class Programm {

	private List<Command> topLevelCommands = new ArrayList<>();

	public Programm() {
		super();
		topLevelCommands.add(new CNewFile("0"));
		topLevelCommands.add(new COpenFile("1"));
		topLevelCommands.add(new CExitProgramm("2"));
		topLevelCommands.add(new CSaveProgramm("3"));
	}

	public void start() throws IOException {
		while (true) {
			System.out.println("Выберите необходимую комманду...");
			for (Command command : topLevelCommands) {
				command.printMenuItem();
			}
			

			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

			// Reading data using readLine
			String input = reader.readLine();

			for (Command command : topLevelCommands) {
				if (command.isSelected(input)) {
					command.execute();
				}
			}
		}
	}
}
