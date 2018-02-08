package com.itacademy.av;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import com.itacademy.av.command.AddCar;
import com.itacademy.av.command.Command;
import com.itacademy.av.command.ExitProgram;
import com.itacademy.av.command.FindCar;

public class Programm {

	private List<Command> topLevelCommands = new ArrayList<>();


	public Programm() {
		super();
		topLevelCommands.add(new FindCar("1"));
		topLevelCommands.add(new AddCar("2"));
		topLevelCommands.add(new ExitProgram("0"));
	}

	public void start() throws IOException {
		while (true) {
			System.out.println("Выберите необходимую комманду...");
			for (Command command : topLevelCommands) {
				command.printMenuItem();
			}

			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); // читает введенное значение

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
