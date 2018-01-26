package workclasspvt.class03january.tryall.ermak;

import java.util.Random;

public class Car {

	private Fuel typeFuel;
	private int quantityFuel;

	public Car() {
		Random random = new Random();
		this.typeFuel = Fuel.values()[random.nextInt(3)];
		this.quantityFuel = random.nextInt(20) + 1;
	}

	public Fuel getTypeFuel() {
		return typeFuel;
	}

	public int getQuantityFuel() {
		return quantityFuel;
	}
}