package workclasspvt.class03january.tryall.omer;

import java.util.List;
import java.util.Queue;
import java.util.Random;

public class CarCreator extends Thread {
	private Queue<Car> queue;
	private List<FuelTank> fuelTanks;

	public CarCreator(Queue<Car> queue, List<FuelTank> fuelTanks) {
		this.queue = queue;
		this.fuelTanks = fuelTanks;
	}

	@Override
	public void run() {
		while (true) {
			if (queue != null) {
				if (queue.size() <= 10) {
					queue.add(new Car(getRandomFuelType(), getRandomFuelAmount()));

					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					if (Thread.interrupted()) {
						return;
					}

				}
			}
		}

	}

	protected int getRandomFuelType() {
		Random r = new Random();
		return r.nextInt(3 - 0) + 0;
	}

	protected int getRandomFuelAmount() {
		Random r = new Random();
		return r.nextInt(21 - 1) + 1;
	}

}