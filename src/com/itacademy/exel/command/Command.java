package com.itacademy.exel.command;

import java.io.IOException;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

public abstract class Command {

	private String title;

	private String key;

	
	public Command(String title) {
		super();
		this.title = title;
	}

	public boolean isSelected(String userInput) {
		return key.equals(userInput);
	}


	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public void printMenuItem() {
		System.out.println(String.format("%s - %s", this.key, this.title));
	}

	public abstract void execute() throws IOException;

}
