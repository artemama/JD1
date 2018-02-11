package com.itacademy.av;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.itacademy.av.command.AddCar;
import com.itacademy.av.command.Command;
import com.itacademy.av.command.ExitProgram;
import com.itacademy.av.command.FindCar;
import com.itacademy.av.db.DB;
import com.itacademy.av.Menu;

public class Main {

	public static void main(String[] args) throws IOException {

		List<Command> topLevelCommands = new ArrayList<Command>();

		topLevelCommands.add(new FindCar("1", "Искать машину"));
		topLevelCommands.add(new AddCar("2", "Создать машину"));
		topLevelCommands.add(new ExitProgram("0", "Выйти из программы"));
		Menu menu = new Menu(topLevelCommands) {
		};
		menu.execute();
		DB db = new DB();

	}

}
