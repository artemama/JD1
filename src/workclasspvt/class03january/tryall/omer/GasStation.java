package workclasspvt.class03january.tryall.omer;

import java.util.List;
import java.util.Queue;

public class GasStation extends Thread {
	private Queue<Car> queue;
	private List<FuelTank> fuelTanks;

	public GasStation(Queue<Car> queue, List<FuelTank> fuelTanks) {
		this.queue = queue;
		this.fuelTanks = fuelTanks;

	}

	@Override
	public void run() {

		while (true) {

			handleCar();

		}
	}

	private void handleCar() {
		Car result = getQueue().poll();
		if (result != null) {
			for (FuelTank fuelTank : fuelTanks) {
				if ((fuelTank.getFuelTypeTank() == result.getFuelTypeCar())
						&& (fuelTank.getTankAmount() >= result.getFuelAmount())) {
					fuelTank.setTankAmount(fuelTank.getTankAmount() - result.getFuelAmount());
					System.out.println(String.format("%s start to fill up car with %s of %s. %s left in tank",
							this.getName(), result.getFuelAmount(), FuelType.values()[fuelTank.getFuelTypeTank()],
							fuelTank.getTankAmount()));
					try {
						Thread.sleep(1000 * result.getFuelAmount());
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} else if ((fuelTank.getFuelTypeTank() == result.getFuelTypeCar())
						&& (fuelTank.getTankAmount() < result.getFuelAmount())) {
					System.out.println(
							String.format("Not enough %s fuel in tank", FuelType.values()[fuelTank.getFuelTypeTank()]));
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

				}

				if (Thread.interrupted()) {
					System.out.println("Gasoline closed cause of no fuel in tanks");
					return;
				}

			}
		}
	}

	public Queue<Car> getQueue() {
		return queue;
	}

}
