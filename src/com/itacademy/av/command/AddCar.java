package com.itacademy.av.command;

import java.io.IOException;

public class AddCar extends Command {
	private String model;

	/*public AddCar(String, key) {
		super ("", getKey());	
		setKey(key);
	}*/

	public AddCar(String key) {
		super("Добавить новую машину", key);
		setKey(key);
	}

	private String brand;

	@Override
	public void execute() throws IOException {
		// TODO Auto-generated method stub

	}

}
