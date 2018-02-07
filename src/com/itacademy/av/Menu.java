package com.itacademy.av;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import com.itacademy.av.command.Command;


public class Menu {

		List<Command> LevelCommands;

		public Menu(List<Command> LevelCommands) {
			this.LevelCommands = LevelCommands;
		}

		public void execute() throws IOException {
			String s = "";
			do {
				for (Command command : LevelCommands) {
					command.printMenuItem();
				}
				Scanner scan = new Scanner(System.in);
				s = scan.next();
				for (Command command : LevelCommands) {
					if (s.equals(command.getKey())) {
						command.execute();
					}
				}
			} while (!s.equals(0)); //0 - command to exit

		}
	}
