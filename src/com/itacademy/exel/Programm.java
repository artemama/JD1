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
import com.itacademy.exel.dock.CellEdit;
import com.itacademy.exel.dock.CellReader;
import com.itacademy.exel.dock.Document;

public class Programm {

	private List<Command> topLevelCommands = new ArrayList<>();
	private List<Command> secondLevelCommands = new ArrayList<>();
	private Document document;

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

			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); // читает введенное значение

			String input = reader.readLine();

			for (Command command : topLevelCommands) {
				if (command.isSelected(input)) {
					command.execute();
				}
			}
			/*
			 * for (Command command : secondLevelCommands) { if (command.isSelected(input))
			 * { command.execute(); } }
			 */
		}

	}

	private void enterSecondMenu(Document document) {
		System.out.println("Меню по работе с ячейкой");
		secondLevelCommands.add(new CellReader("1", "Прочитать ячейку", document));
		secondLevelCommands.add(new CellEdit("2", "Редактировать ячейку", document));
		secondLevelCommands.add(new CExitProgramm("3") );

	}
}
