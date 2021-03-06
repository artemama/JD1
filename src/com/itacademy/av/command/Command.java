package com.itacademy.av.command;

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
		this.key = key;
	}

	public boolean isSelected(String userInput) {
		if (key.equals(userInput)) {
			return true;
		} else {
			return false;
		}
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public void printMenuItem() {
		System.out.println(String.format("%s - %s", this.title, this.key));
	}

	public abstract void execute() throws IOException;

}
