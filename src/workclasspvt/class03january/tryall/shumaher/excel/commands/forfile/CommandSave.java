package workclasspvt.class03january.tryall.shumaher.excel.commands.forfile;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import workclasspvt.class03january.tryall.shumaher.excel.Sheet;
import workclasspvt.class03january.tryall.shumaher.excel.commands.CommandForFile;

public class CommandSave extends CommandForFile {

	private Sheet sheet;

	public CommandSave(String value, String output, Sheet sheet) {
		super(value, output);
		this.sheet = sheet;
	}

	@Override
	public void execute() {
		String fileName = enterFileName();
		try (FileOutputStream fos = new FileOutputStream(fileName);
				ObjectOutputStream oos = new ObjectOutputStream(fos);) {
			oos.writeObject(this.sheet);
			oos.close();
			System.out.println(String.format("File %s was saved.", fileName));
		} catch (IOException e) {
			System.out.println("Something was wrong. File wasn't saved. Please try again.");
		}
	}
}
