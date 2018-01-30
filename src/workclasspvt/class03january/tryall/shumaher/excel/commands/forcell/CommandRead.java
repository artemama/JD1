package workclasspvt.class03january.tryall.shumaher.excel.commands.forcell;

import java.util.NoSuchElementException;

import workclasspvt.class03january.tryall.shumaher.excel.Sheet;
import workclasspvt.class03january.tryall.shumaher.excel.commands.CommandForCell;

public class CommandRead extends CommandForCell {

	public CommandRead(String value, String output, Sheet sheet) {
		super(value, output, sheet);
	}

	@Override
	public void execute() {
		String s = enterCorrectAddress();
		try {
			System.out.println(String.format("Cell %s=%s", s, this.sheet.getCellValue(s)));
		} catch (NullPointerException e) {
			System.out.println(String.format("Cell %s doesn-t exist", s));
		} catch (NoSuchElementException | NumberFormatException e) {
			System.out.println("Incorrect value in one of the cells.");
		}
	}
}
