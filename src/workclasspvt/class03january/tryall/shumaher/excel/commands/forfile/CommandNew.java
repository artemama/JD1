package workclasspvt.class03january.tryall.shumaher.excel.commands.forfile;

import workclasspvt.class03january.tryall.shumaher.excel.Sheet;
import workclasspvt.class03january.tryall.shumaher.excel.commands.CommandForFile;

public class CommandNew extends CommandForFile {

	public CommandNew(String value, String output) {
		super(value, output);
	}

	@Override
	public void execute() {
		System.out.println("New file was created.");
		enterToSecondMenu(new Sheet());
	}

}