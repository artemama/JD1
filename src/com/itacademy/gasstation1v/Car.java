package com.itacademy.gasstation1v;

import java.util.ArrayList;
import java.util.Queue;

public class Car extends Thread {
	private String numberCar;
	boolean tankIsEmpty;

	public boolean isTankIsEmpty() {
		return tankIsEmpty;
	}

	public int getFuelType() {
		return fuelType;
	}

	public String getnumberCar() {
		return numberCar;
	}

	int fuelType;
	int quantity;

	public Car() {

		this.numberCar = String.format("%s %s", getClass().getSimpleName(), getName());
		System.out.println(String.format("Создан " + numberCar));

		this.fuelType = (int) (Math.random() * 3);
		this.quantity = (int) (Math.random() * 20);
		this.start();
	}
	public void run() {

		System.out.println(String.format(numberCar + " заехал на колонку"));

		while (true) {
			// create car // - params (fuel type, quantity) - in class

			// getting fuel type of car
			// searching if fuel is in tank
			if (tank95.getQantityTank() > 0 && tank92.getQantityTank() > 0 && tankDisel.getQantityTank() > 0) {
				tankIsEmpty = false;
			} else {
				tankIsEmpty = true;
			}
			if (this.getFuelType() == 0) {
				if (this.quantity < tank95.getQantityTank() && tank95.getQantityTank() - this.quantity >= 0) {
					tank95.setQantityTank(tank95.getQantityTank() - this.quantity);
					System.out.println("95 бензина в цистерне осталось - " + tank95.getQantityTank());
				} else {
					System.out.println("Извините, не хватает 95 бензина на заправке");
				}
			}
			if (car.getFuelType() == 1) {
				if (this.quantity < tank92.getQantityTank() && tank92.getQantityTank() - this.quantity >= 0) {
					tank92.setQantityTank(tank92.getQantityTank() - this.quantity);
					System.out.println("92 бензина в цистерне осталось - " + tank92.getQantityTank());

				} else {
					System.out.println("Извините, не хватает 92 бензина на заправке");
				}
			}

			if (car.getFuelType() == 2) {
				if (this.quantity < tankDisel.getQantityTank() && tankDisel.getQantityTank() - this.quantity >= 0) {
					tankDisel.setQantityTank(tankDisel.getQantityTank() - this.quantity);
					System.out.println("ДТ в цистерне осталось - " + tankDisel.getQantityTank());

				} else {
					System.out.println("Извините, не хватает ДТ на заправке");
				}
			}
			try {
				Thread.sleep(this.quantity * 10); // wait sec*litr
				if (tank92.getQantityTank() <= 0 && tank92.getQantityTank() <= 0 && tankDisel.getQantityTank() <= 0) {

					System.out.println("На заправках коничлось топливо, едьте на другую заправку");

				} else {
					System.out.println(String.format("Машина заправлятся %s л., сек.", this.quantity));

				}
				if (tankIsEmpty) {
					break;
				}

			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			try {

			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

	public Queue<Car> getQueue() {
		return queue;
	}
}
