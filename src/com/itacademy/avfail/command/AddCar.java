package com.itacademy.avfail.command;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.List;

import com.itacademy.av.Car;
import com.itacademy.av.db.DB;

public class AddCar extends Command {
	/*
	 * private List<String> brand; private HashSet<String> model;
	 */

	private Car car;

	public AddCar(String key, DB db) throws IOException {
		super("Добавить новую машину", key);
		setKey(key);
	}

	public void execute(/*DB db*/) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); // читает введенное значение
		String brand = reader.readLine();

		reader = new BufferedReader(new InputStreamReader(System.in)); // читает введенное значение
		
		String model = reader.readLine();

		/*db.printBrands();*/

		Car car = new Car(brand, model);

		String[] stringArray = { "a", "b", "c", "d", "e" };
		/*boolean b = Arrays.asList(stringArray).contains("a");
		System.out.println(b);

		if (db.getBrands(brands) == car.getBrand()) {

		} else {

		}*/

		/*db.getCars().add(car);*/
	}


}
