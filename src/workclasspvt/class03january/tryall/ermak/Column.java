package workclasspvt.class03january.tryall.ermak;

import java.util.List;
import java.util.Queue;


public class Column extends Thread {

	private List<Tank> tanks;
	private Queue<Car> cars;
	private Car car;

	public Column(List<Tank> tanks, Queue<Car> cars) {
		this.tanks = tanks;
		this.cars = cars;
		System.out.println(String.format("Started %s %s", getClass().getSimpleName(), getName()));
		this.setDaemon(true);
	}

	@Override
	public void run() {
		while (true) {
			do {
				synchronized (cars) {
					if (cars.isEmpty()) {
						try {
							cars.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					car = cars.poll();
				}
			} while (!fillCar());
			try {
				Thread.sleep(car.getQuantityFuel() * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public boolean fillCar() {
		synchronized (tanks) {
			for (Tank tank : tanks) {
				if ((tank.getFuelType() == car.getTypeFuel()) && (tank.getQuantityFuel() >= car.getQuantityFuel())) {
					tank.setQuantityFuel(tank.getQuantityFuel() - car.getQuantityFuel());
					System.out.println(String.format("Fill car (%s -- %s)---- Tank (%s -- %s)", car.getTypeFuel(),
							car.getQuantityFuel(), tank.getFuelType(), tank.getQuantityFuel()));
					return true;
				}
			}
			System.out.println("Not enough fuel. Try next car");
			return false;
		}
	}
}