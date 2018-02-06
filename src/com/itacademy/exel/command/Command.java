package com.itacademy.exel.command;

import java.io.IOException;

public abstract class Command {

	private String title;

	private String key;

	public Command(String title, String key) {
		super();
		this.title = title;
		this.key = key;
	}

	public Command(String key) {
		super();
		this.key = key;

	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
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
