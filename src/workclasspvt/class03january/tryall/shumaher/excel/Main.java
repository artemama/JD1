package workclasspvt.class03january.tryall.shumaher.excel;

import java.util.ArrayList;
import java.util.List;

import workclasspvt.class03january.tryall.shumaher.excel.commands.CommandChangeLanguage;
import workclasspvt.class03january.tryall.shumaher.excel.commands.CommandExit;
import workclasspvt.class03january.tryall.shumaher.excel.commands.forfile.CommandNew;
import workclasspvt.class03january.tryall.shumaher.excel.commands.forfile.CommandOpen;

public class Main {

	public static void main(String[] args) {
		List<Command> firstLevelCommands = new ArrayList<Command>();
		firstLevelCommands.add(new CommandChangeLanguage("language", "For change language print"));
		firstLevelCommands.add(new CommandOpen("open", "For open exists file print"));
		firstLevelCommands.add(new CommandNew("new", "For create new file print"));
		firstLevelCommands.add(new CommandExit("exit", "For close programm print"));
		Menu menu = new Menu(firstLevelCommands);
		menu.execute();
		System.out.println("Thank you for choosing our excel.");
	}

}