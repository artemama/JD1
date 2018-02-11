package com.itacademy.av;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import com.itacademy.av.command.Command;



public abstract class Menu{
		List<Command> LevelCommands;

		public Menu(List<Command> topLevelCommands) {
			this.LevelCommands = topLevelCommands;
		}

		public void execute() throws IOException {
			String s = "";
			do {
				System.out.println("Выберите необходимую комманду...");
				for (Command command : LevelCommands) {
					command.printMenuItem();
				}
				BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); // читает введенное значение

				// Reading data using readLine
				String input = reader.readLine();
				
				for (Command command : LevelCommands) {
					if (s.equals(command.getKey())) {
						command.execute();
					}
				}
			} while (s.equals("0")); //0 - command to exit

		}


	}
