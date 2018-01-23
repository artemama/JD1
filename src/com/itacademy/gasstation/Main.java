package com.itacademy.gasstation;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/*есть 5 бензоколонок. на каждой 3 вида топлива: ДT, АИ-92, АИ-95 (использовать Enum)
колонки питаются из соответствующих общих резервуаров 3х типов, в каждом по 1000 литров горючего на момент старта

клиенты идут бесконечно один за одним. каждый заказывает от 1 до 20 литров случайно выбранного топлива. заправка происходит 
со скоростью 1 литр в секунду. новый клиент начинает работу сразу после освобождения любой колонки.

когда в резервуаре заканчивается топливо, то клиенты должны получать "отказ" и уступать место другим клиента, которые, возможно,
выберут меньший объем или другой вид топлива.
программа полностью заканчивает работу когда закончится последнее топливо во всех резервуарах.

все события отображать в System.out*/
public class Main {

	public static void main(String[] args) {

		// creating instances of tank's different types
		TankGasStation tank95 = new TankGasStation(GasMark.gas95, 1000);
		TankGasStation tank92 = new TankGasStation(GasMark.gas92, 1000);
		TankGasStation tankDisel = new TankGasStation(GasMark.disel, 1000);

		while (tank92.getQantityTank() > 0 && tank92.getQantityTank() > 0 && tankDisel.getQantityTank() > 0) {
			// create car // - params (fuel type, quantity) - in class
			/* Car car = new Car(null); */
			for (int i = 0; i < 5; i++) {
				Car car = new Car();
				car.start(); // start thread

				/*
				 * Queue<GasStation> gasColumn; //= new ConcurrentLinkedQueue<GasStation>(); for
				 * (int i = 0; i < 5; i++) { Queue<GasStation> gasColumn1 = new
				 * ConcurrentLinkedQueue<GasStation>(); }
				 */

				// getting fuel type of car
				// searching if fuel is in tank

				if (car.getFuelType() == 0) {
					if (car.quantity < tank95.getQantityTank() && tank95.getQantityTank() - car.quantity >= 0) {
						tank95.setQantityTank(tank95.getQantityTank() - car.quantity);
						System.out.println("95 бензина в цистерне осталось - " + tank95.getQantityTank());
					} else {
						System.out.println("Извините, не хватает 95 бензина на заправке");
					}
				}
				if (car.getFuelType() == 1) {
					if (car.quantity < tank92.getQantityTank() && tank92.getQantityTank() - car.quantity >= 0) {
						tank92.setQantityTank(tank92.getQantityTank() - car.quantity);
						System.out.println("92 бензина в цистерне осталось - " + tank92.getQantityTank());

					} else {
						System.out.println("Извините, не хватает 92 бензина на заправке");
					}
				}

				if (car.getFuelType() == 2) {
					if (car.quantity < tankDisel.getQantityTank() && tankDisel.getQantityTank() - car.quantity >= 0) {
						tankDisel.setQantityTank(tankDisel.getQantityTank() - car.quantity);
						System.out.println("ДТ в цистерне осталось - " + tankDisel.getQantityTank());

					} else {
						System.out.println("Извините, не хватает ДТ на заправке");
					}
				}
				try {
					Thread.sleep(car.quantity * 10); // wait sec*litr
					if (tank92.getQantityTank() <= 0 && tank92.getQantityTank() <= 0
							&& tankDisel.getQantityTank() <= 0) {

						System.out.println("На заправках коничлось топливо, едьте на другую заправку");

					} else {
						System.out.println(String.format("Машина заправлятся %s л., сек.", car.quantity));

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

	}

	private static void startWorkColumn() {

	}

	// TODO check all types of fuel
	// TODO multiple threads

}
