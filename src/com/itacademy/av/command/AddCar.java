package com.itacademy.av.command;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.util.HashSet;

import com.itacademy.av.Car;
import com.itacademy.av.db.DB;

public class AddCar extends Command implements Serializable {

	private Car car;
	private String brand;
	private String model;

	public AddCar(String key, String name) {
		super(key, name);
	}

	public void createCar(/* DB db */) throws IOException {
		DB db = new DB();

		for (int i = 0; i < db.size(); i++) {
			HashSet<String> b = db.getBrands();
			HashSet<String> modl = db.getAudis();
			if (b.equals(car.getBrand()) && modl.contains(car.getModel())) {
				Car car = new Car(brand, model);
				Save.saveFile();
				System.out.println(String.format("Создали новую машину бренд: %s модель: %s", brand, model));
			} else {
				if (!b.equals(car.getBrand())) {

					HashSet<String> brands = new HashSet<String>();
					System.out.println("ВВедите новый бренд");
					BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

					String brand = reader.readLine();
					brands.add(brand);
					Save.saveFile();
				}
				if (!modl.contains(car.getModel())) {

				}
			}
		}
		db.getCars().add(car);
	}

	@Override
	public void execute() throws IOException {
		System.out.println("ВВедите бренд");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); // читает введенное значение
		String brand = reader.readLine();
		System.out.println("ВВедите модель");
		reader = new BufferedReader(new InputStreamReader(System.in)); // читает введенное значение

		String model = reader.readLine();

		createCar();
		Car car = new Car(brand, model);
	}

}
