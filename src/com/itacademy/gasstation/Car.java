package com.itacademy.gasstation;

import java.util.Queue;

public class Car extends Thread{
	private String numberCar;
	private Queue<Car> queue;

	public int getFuelType() {
		return fuelType;
	}

	public String getnumberCar() {
		return numberCar;
	}

	int fuelType = (int) (Math.random() * 3);
	int quantity = (int) (Math.random() * 20);

	public Car(Queue<Car> queue) {
		super();
		this.numberCar = String.format("%s %s", getClass().getSimpleName(), getName());
		System.out.println(String.format("Создан " + numberCar));

	}

	public Queue<Car> getQueue() {
		return queue;
	}
}
