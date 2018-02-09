package com.itacademy.av.command;

import java.io.IOException;
import java.util.HashSet;
import java.util.List;

import com.itacademy.av.Car;

public class AddCar extends Command {
	private List<String> brand;
	private HashSet<String> model;

	/* private String model; */
	/* private String brand; */
	private Car car;

	public AddCar(String key) {
		super("Добавить новую машину", key);
		setKey(key);
	}

	@Override
	public void execute() throws IOException {

		Car car = new Car(brand, model);

	}

}
