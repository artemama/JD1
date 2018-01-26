package workclasspvt.class03january.tryall.omer;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Test {

	public static void main(String[] args) {

		Queue<Car> queue = new ConcurrentLinkedQueue<Car>();

		List<FuelTank> fuelTanks = new ArrayList<FuelTank>();
		for (int i = 0; i < FuelType.values().length; i++) {
			FuelTank fuelTank = new FuelTank(i, 1000);
			fuelTanks.add(fuelTank);
		}

		CarCreator carCreator = new CarCreator(queue, fuelTanks);
		carCreator.start();

		List<GasStation> gasStation = new ArrayList<GasStation>();
		for (int i = 0; i < 5; i++) {
			GasStation gasStation1 = new GasStation(queue, fuelTanks);
			gasStation1.start();

		}

	}

}