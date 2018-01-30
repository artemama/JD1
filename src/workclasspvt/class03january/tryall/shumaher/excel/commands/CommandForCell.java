package workclasspvt.class03january.tryall.shumaher.excel.commands;

import java.util.Scanner;

import workclasspvt.class03january.tryall.shumaher.excel.Command;
import workclasspvt.class03january.tryall.shumaher.excel.Sheet;

public abstract class CommandForCell extends Command {
	protected Sheet sheet;

	public CommandForCell(String value, String output, Sheet sheet) {
		super(value, output);
		this.sheet = sheet;
	}

	@Override
	public void execute() {
	}

	protected String enterCorrectAddress() {
		String s;
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("Please, enter cell address. For example [23,D]. (Remember [1..1000,A-Z]).");
			s = scan.next();
		} while (!isAddressValid(s));
		return s;
	}

	private boolean isAddressValid(String s) {
		if (s.matches("\\[([1-9][0-9]{0,2}|1000),[A-Z]\\]")) {
			return true;
		} else {
			System.out.println("Incorrect cell address.");
			return false;
		}
	}
}