package com.itacademy.gasstation1v;

import java.util.ArrayList;
import java.util.List;


public class Main {

	public static void main(String[] args) {

		// creating instances of tank's different types
		 ArrayList<Tank> fuelTanksList = new ArrayList<Tank>();
		 for (int i = 0; i < GasMark.values().length; i++) {
			 fuelTanksList.add(new Tank(GasMark.values()[i], 100));
			Tank fTanksList = new Tank(1000, GasMark.values()[i]);
			fuelTanksList.add(fTanksList);
		}
		
		for (int i = 0; i < 5; i++) {
			Car car = new Car();
		}
		for (int i = 0; i < 5; i++) {
			Column column = new Column(tanks, cars);
			column.start();
		}
		
		while (!station.isEmptyTank()) {
			synchronized (cars) {
				if (cars.isEmpty()) {
					cars.add(new Car());
					cars.notify();
				}
			}
			
		}
		

	}




}
