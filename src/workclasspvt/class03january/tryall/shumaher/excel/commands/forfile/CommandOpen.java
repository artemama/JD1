package workclasspvt.class03january.tryall.shumaher.excel.commands.forfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import workclasspvt.class03january.tryall.shumaher.excel.Sheet;
import workclasspvt.class03january.tryall.shumaher.excel.commands.CommandForFile;

public class CommandOpen extends CommandForFile {

	public CommandOpen(String value, String output) {
		super(value, output);
	}

	@Override
	public void execute() {
		String fileName = enterFileName();
		Sheet sheet = new Sheet();
		sheet = openFile(fileName);
		enterToSecondMenu(sheet);
	}

	private Sheet openFile(String fileName) {
		try (FileInputStream fis = new FileInputStream(fileName); ObjectInputStream ois = new ObjectInputStream(fis);) {
			Sheet sheet = (Sheet) ois.readObject();
			ois.close();
			return sheet;
		} catch (FileNotFoundException e) {
			System.out.println("File not found.");
			openFile(enterFileName());
		} catch (Exception e) {
			System.out.println("Something is wrong.");
			openFile(enterFileName());
		}
		return null;
	}
}