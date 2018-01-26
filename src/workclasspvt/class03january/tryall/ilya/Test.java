package workclasspvt.class03january.tryall.ilya;


public class Test {

	public static void main(String[] args) {

		for (int i = 0; i < FuelType.values().length; i++) {
			Tunks tank = new Tunks(1000, FuelType.values()[i]);
		}

		for (int i = 0; i < 5; i++) {
			Station station = new Station();
			station.start();
		}

		while (Tunks.tunksIsEmpty()) {
			if (Car.cars.size() < 5) {
				int fuel = (int) (Math.random() * FuelType.values().length);
				Car car = new Car(FuelType.values()[fuel], 1 + (int) (Math.random() * 20));
			}
		}
	}

}