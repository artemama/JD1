package com.itacademy.gasstation;

public class Car {
	int fuelType = (int) (Math.random() * 3);
	
	public int getFuelType() {
		return fuelType;
	}
	
	int quantity = (int) (Math.random() * 20);

}
