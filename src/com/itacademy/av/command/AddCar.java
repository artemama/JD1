package com.itacademy.av.command;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.util.HashSet;

import com.itacademy.av.Car;
import com.itacademy.av.db.DB;

public class AddCar extends Command implements Serializable{

	private Car car;

	public AddCar(String key, String name) {
		super(key, name);
	}

	public void execute(DB db) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); // читает введенное значение
		String brand = reader.readLine();

		reader = new BufferedReader(new InputStreamReader(System.in)); // читает введенное значение

		String model = reader.readLine();

		db.printBrands();

		for (int i = 0; i < db.size(); i++) {
			HashSet<String> b = db.getBrands();
			HashSet<String> modl = db.getAudis();
			if (b.equals(car.getBrand()) && modl.contains(car.getModel())) {
				Car car = new Car(brand, model);
				
			} else {
				if (!b.equals(car.getBrand())) {
					HashSet<String> brands = new HashSet<String>();
				}
				if (!modl.contains(car.getModel())) {
				}
			}
		}
		db.getCars().add(car);
	}

	@Override
	public void execute() throws IOException {
		// TODO Auto-generated method stub

	}

}
