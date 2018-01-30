package workclasspvt.class03january.tryall.shumaher.excel.commands.forcell;

import java.util.NoSuchElementException;
import java.util.Scanner;

import workclasspvt.class03january.tryall.shumaher.excel.Cell;
import workclasspvt.class03january.tryall.shumaher.excel.Command;
import workclasspvt.class03january.tryall.shumaher.excel.Row;
import workclasspvt.class03january.tryall.shumaher.excel.Sheet;
import workclasspvt.class03january.tryall.shumaher.excel.commands.CommandForCell;

public class CommandEdit extends CommandForCell {

	public CommandEdit(String value, String output, Sheet sheet) {
		super(value, output, sheet);
	}

	@Override
	public void execute() {
		String s = enterCorrectAddress();
		enterNewValue(s);
		System.out.println("Don't remember to save changes in file!");
	}

	private void enterNewValue(String s) {
		Integer i = Integer.valueOf(s.substring(s.indexOf('[') + 1, s.indexOf(',')));
		String j = s.substring(s.indexOf(',') + 1, s.indexOf(']'));
		System.out.println("Please type new value.");
		Cell cell = new Cell(sheet);
		Scanner scan = new Scanner(System.in);
		try {
			cell.setValue(scan.next());
			if (sheet.isRowExist(i)) {
				sheet.getRow(i).addCell(j, cell);
			} else {
				Row row = new Row();
				row.addCell(j, cell);
				sheet.addRow(i, row);
			}
			System.out.println(String.format("Cell %s has been recorded.", s));
		} catch (NumberFormatException | NoSuchElementException e) {
			System.out.println("Incorrect value in one of the cells.");
			enterNewValue(s);
		}
	}
}