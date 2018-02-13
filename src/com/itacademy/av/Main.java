package com.itacademy.av;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.itacademy.av.command.AddCar;
import com.itacademy.av.command.Command;
import com.itacademy.av.command.ExitProgram;
import com.itacademy.av.command.FindCar;
import com.itacademy.av.command.Save;
import com.itacademy.av.Menu;

public class Main {

	public static void main(String[] args) throws IOException {
		Save.loadFile();
		List<Command> topLevelCommands = new ArrayList<Command>();
		topLevelCommands.add(new FindCar("Искать машину", "1"));
		topLevelCommands.add(new AddCar("Создать машину","2"));
		topLevelCommands.add(new ExitProgram("Выйти из программы","0"));
		Menu menu = new Menu(topLevelCommands) {
		};
		menu.execute();

	}

}
