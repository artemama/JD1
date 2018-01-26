package workclasspvt.class03january.tryall.ilya;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Car {
	private FuelType fuelType;
	private int quantityOfFuel;
	public static Queue<Car> cars = new ConcurrentLinkedQueue<Car>();

	public Car(FuelType fuelType, int quantity) {
		this.fuelType = fuelType;
		this.quantityOfFuel = quantity;
		cars.add(this);
	}

	public int getQuantityOfFuel() {
		return quantityOfFuel;
	}

	public FuelType getFuelType() {
		return fuelType;
	}
}